package server.servlet;

import server.model.Comics;
import server.service.ComicsService;
import server.service.impl.ComicsServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@WebServlet(name = "image", urlPatterns = { "/image" })
public class ImageServlet extends HttpServlet {
    ComicsService comicsService = new ComicsServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("image/jpeg");
        String idStr = request.getParameter("id");
        int id = Integer.parseInt(idStr);
        Comics comics = comicsService.findComicsById(id);
        String imageName = comics.getImageName();
        String fileName = String.format("/assets/%s",imageName);
        InputStream inputStream = getServletContext().getResourceAsStream(fileName);
        response.setContentLength(inputStream.available());
        OutputStream outputStream = response.getOutputStream();
        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
        inputStream.close();
        outputStream.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  {

    }
}
