package server.servlet;

import org.json.JSONArray;
import org.json.JSONObject;
import server.model.Comics;
import server.service.ComicsService;
import server.service.impl.ComicsServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "content", urlPatterns = { "/content" })
public class ContentServlet extends HttpServlet {
    ComicsService comicsService = new ComicsServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        String idStr = request.getParameter("id");
        int id = Integer.parseInt(idStr);
        Comics comics = comicsService.findComicsById(id);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("content", comics.getContent());
        String jsonString = jsonObject.toString();
        PrintWriter out = response.getWriter();
        out.write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  {

    }
}
