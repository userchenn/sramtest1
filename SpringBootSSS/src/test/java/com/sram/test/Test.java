package com.sram.test;

import com.sram.MyApp;
import com.sram.dao.UserDao;
import com.sram.entity.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * create by chengang with IntelliJ IDEA on 2019/12/9 19:36
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApp.class)
public class Test {

    @Autowired
    private UserDao userDao;


    @org.junit.Test
    public void Test1(){
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
