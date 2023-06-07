package server.model;

import lombok.Data;

@Data
public class Catalog {
    int catalogId;
    String title;
    int order;
}
