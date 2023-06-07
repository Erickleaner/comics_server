package server.service.impl;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import server.mapper.ComicsMapper;
import server.model.Comics;
import server.service.ComicsService;

import java.io.IOException;

public class ComicsServiceImpl implements ComicsService {
    @Override
    public Comics findComicsById(int id) {
        try {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis.xml"));
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            ComicsMapper mapper = sqlSession.getMapper(ComicsMapper.class);
            return mapper.getComicsById(id);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
