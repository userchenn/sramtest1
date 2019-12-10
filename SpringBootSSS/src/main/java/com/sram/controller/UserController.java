package com.sram.controller;

import com.sram.common.CodeMenu;
import com.sram.common.ResponsnResult;
import com.sram.dao.UserDao;
import com.sram.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * create by chengang with IntelliJ IDEA on 2019/12/9 18:27
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserDao userDao;

    //@RequestMapping(value = "/findAll",method = RequestMethod.GET)
    @GetMapping("/findAll")
    public ResponsnResult<User> findAll(){

        List<User> users = userDao.findAll();
        ResponsnResult<User> rr = new ResponsnResult<>(true, CodeMenu.SUCCESS);

        rr.setUser(new User());
        rr.setUserList(users);
        return rr;
    }

    @GetMapping("/findById")
    public ResponsnResult<User> findUserById(int id){

        Optional<User> user = userDao.findById(id);
        User user1 = user.get();

        ResponsnResult<User> rr = new ResponsnResult<>(true, CodeMenu.SUCCESS);

        rr.setUser(user1);
        rr.setUserList(new ArrayList<>());
        return rr;

    }


    @PostMapping("updateUser")
    public ResponsnResult<User> updateUser(@RequestBody User user){

        //Optional<User> user1 = userDao.findById(user.getId());
        userDao.save(user);

        ResponsnResult<User> rr = new ResponsnResult<>(true, CodeMenu.SUCCESS);

        rr.setUser(new User());
        rr.setUserList(new ArrayList<>());
        return rr;
    }

}
