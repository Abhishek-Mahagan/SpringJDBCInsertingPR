package com.mahagan.test;

import com.mahagan.dao.ProjectDao;
import com.mahagan.domain.Insert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application-contexl.xml");
        ProjectDao projectDao=applicationContext.getBean("projectDao", ProjectDao.class);

        Insert insert=new Insert();

        insert.setId(9);
        insert.setEmail("kanawade");
        insert.setUsername("Abhi");
        insert.setPassword("Abhi@123");
        System.out.println(projectDao.setabhi(insert));

    }
}