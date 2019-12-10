package com.sram.dao;

import com.sram.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * create by chengang with IntelliJ IDEA on 2019/12/9 18:21
 */
public interface UserDao extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {
}
