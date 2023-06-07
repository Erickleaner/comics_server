package server.servlet;

import org.json.JSONArray;
import org.json.JSONObject;
import server.model.Catalog;
import server.model.Comics;
import server.service.CatalogService;
import server.service.ComicsService;
import server.service.impl.CatalogServiceImpl;
import server.service.impl.ComicsServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "catalog", urlPatterns = { "/catalog" })
public class CatalogServlet extends HttpServlet {
    CatalogService catalogService= new CatalogServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        List<Catalog> catalogList = catalogService.getAllCatalogs();
        JSONArray jsonArray = new JSONArray();
        for (Catalog catalog : catalogList) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("catalogId", catalog.getCatalogId());
            jsonObject.put("title", catalog.getTitle());
            jsonObject.put("order", catalog.getOrder());
            jsonArray.put(jsonObject);
        }
        String jsonString = jsonArray.toString();
        PrintWriter out = response.getWriter();
        out.write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  {

    }
}
