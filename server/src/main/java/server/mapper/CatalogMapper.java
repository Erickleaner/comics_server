package server.mapper;

import server.model.Catalog;
import server.model.Comics;

import java.util.List;

public interface CatalogMapper {

    Catalog getCatalogById(int id);
    List<Catalog> getAllCatalogs();
    int getTotal();
}
