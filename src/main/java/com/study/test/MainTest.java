package com.study.test;

import com.study.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName MainTest
 * @Description 测试类
 * @Author chenguang
 * @Date 2020-04-25 21:09
 * @Version 1.0
 **/
public class MainTest {


    @Test
    public void selectTest() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        List<User> objects = sqlSession.selectList("user.selectList");
        for (User user : objects) {
            System.out.println(user);
        }
    }

    @Test
    public void insertTest() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        User user = new User();
        user.setUserId(3);
        user.setUserName("张三");
        sqlSession.insert("user.save", user);
    }

    @Test
    public void updateTest() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        User user = new User();
        user.setUserId(3);
        user.setUserName("王五");
        sqlSession.update("user.update",user);
    }

    @Test
    public void deleteTest() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        User user = new User();
        user.setUserId(3);
        user.setUserName("王五");
        sqlSession.delete("user.delete",3);
    }
}
