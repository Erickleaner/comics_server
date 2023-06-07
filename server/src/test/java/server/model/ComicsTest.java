package server.model;


import org.junit.jupiter.api.Test;
import server.service.ComicsService;
import server.service.impl.ComicsServiceImpl;


public class ComicsTest {
    @Test
    public void find(){
        ComicsService service = new ComicsServiceImpl();
        Comics comics = service.findComicsById(10);
        System.out.println(comics.getContent());
    }
}
