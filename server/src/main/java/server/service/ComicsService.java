package server.service;

import server.model.Comics;

public interface ComicsService {
    Comics findComicsById(int id);
}
