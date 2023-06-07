package server.servlet;

import org.json.JSONArray;
import org.json.JSONObject;
import server.model.Catalog;
import server.service.CatalogService;
import server.service.impl.CatalogServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "total", urlPatterns = { "/total" })
public class TotalServlet extends HttpServlet {
    CatalogService catalogService= new CatalogServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        int total = catalogService.getTotal();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("total",total);
        String jsonString = jsonObject.toString();
        PrintWriter out = response.getWriter();
        out.write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  {

    }
}
