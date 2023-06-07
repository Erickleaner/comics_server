package server.mapper;

import server.model.Comics;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public interface ComicsMapper {

    Comics getComicsById(int id);
}
