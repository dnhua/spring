package mybatis;

import mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class sample1 {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = null;
        String resourse = "config/mybatis-config.xml";
        InputStream imputStream;
        try {
            imputStream = Resources.getResourceAsStream(resourse);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(imputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = (User) sqlSession.selectOne("mybatis.dao.UserMapper.getUser", 1);
        System.out.println(user);
    }
}
