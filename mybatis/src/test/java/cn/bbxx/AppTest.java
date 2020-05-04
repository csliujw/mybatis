package cn.bbxx;

import cn.bbxx.dao.ArticleMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            ArticleMapper mapper = session.getMapper(ArticleMapper.class);
            System.out.println(mapper.select());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
