package mybatis;

import mybatis.dao.UserMapper;
import mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;

public class Sample1 {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Sample1.class);
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

        //直接使用SqlSession发送SQL
        User user = (User) sqlSession.selectOne("mybatis.dao.UserMapper.getUser", 1);
        log.info(user);

        //使用Mapper接口发送SQL,推荐使用
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User mapperUser = mapper.getUser(13);
        log.info(mapperUser);

        //关闭连接
        sqlSession.close();
    }
}
