package com.tz.Test02;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.sql.SQLException;

/**
 *  测试你配置的数据库链接是否成功 及 配置 文件里面配置的一些信息。
 */
public class Test02 {
    public static void main(String[] args) throws SQLException {

        // 测试你配置的数据库链接是否成功
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //BasicDataSource dataSource = (BasicDataSource)context.getBean("dataSource");
        //System.out.println(dataSource.getConnection());


        // 测试 SessionFactory 是否配置成功。
        //ApplicationContext context = new AnnotationConfigApplicationContext("classpath:applicationContext.xml");
        SessionFactory sessionFactory = (SessionFactory)context.getBean("sessionFactory");
        System.out.println(sessionFactory);



        //UserDao userDao = (UserDao)context.getBean("userDao");
        //System.out.println(userDao);





    }
}
