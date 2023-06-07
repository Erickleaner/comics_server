package server.service.impl;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import server.mapper.CatalogMapper;
import server.model.Catalog;
import server.service.CatalogService;

import java.io.IOException;
import java.util.List;

public class CatalogServiceImpl implements CatalogService {
    @Override
    public List<Catalog> getAllCatalogs() {
        try {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis.xml"));
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            CatalogMapper mapper = sqlSession.getMapper(CatalogMapper.class);
            return mapper.getAllCatalogs();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public int getTotal(){
        try {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis.xml"));
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            CatalogMapper mapper = sqlSession.getMapper(CatalogMapper.class);
            return mapper.getTotal();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
