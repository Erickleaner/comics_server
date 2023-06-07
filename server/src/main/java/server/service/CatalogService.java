package server.service;

import server.model.Catalog;
import server.model.Comics;

import java.util.List;

public interface CatalogService {
    List<Catalog> getAllCatalogs();

    int getTotal();
}
