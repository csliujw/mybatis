package cn.bbxx;

import cn.bbxx.dao.ArticleMapper;
import cn.bbxx.pojo.Article;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class AppTest {
    SqlSession session = null;

    @Before
    public void before() {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            session = sqlSessionFactory.openSession();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void select() {
        ArticleMapper mapper = session.getMapper(ArticleMapper.class);
        System.out.println(mapper.select());
    }

    @Test
    public void selectCondition() {
        Article article = new Article("aa");
        ArticleMapper mapper = session.getMapper(ArticleMapper.class);
        System.out.println(mapper.selectCondition(article).size());
    }

    @Test
    public void insert() {
        Article article = new Article("title", "liujiawei", 10, "2020-11-11");
        ArticleMapper mapper = session.getMapper(ArticleMapper.class);
        boolean insert = mapper.insert(article);
        System.out.println(insert);
        //session.commit();
        session.close();
    }

    @Test
    public void delete() {
        Article article = new Article("title", "liujiawei", 10, "2020-11-11");
        ArticleMapper mapper = session.getMapper(ArticleMapper.class);
        boolean insert = mapper.delete(article);
        System.out.println(insert);
        session.commit();
    }
}
