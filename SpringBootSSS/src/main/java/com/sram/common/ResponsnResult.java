package com.sram.common;

import com.sram.entity.User;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Table;
import java.util.List;

/**
 * create by chengang with IntelliJ IDEA on 2019/12/9 19:20
 */
/*@Data
@ToString*/
public class ResponsnResult<T> {

    private Boolean flag;
    String code;
    private T   user;
    private List<T> userList;


    public ResponsnResult(Boolean flag, String code) {
        this.flag = flag;
        this.code = code;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getUser() {
        return user;
    }

    public void setUser(T user) {
        this.user = user;
    }

    public List<T> getUserList() {
        return userList;
    }

    public void setUserList(List<T> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "ResponsnResult{" +
                "flag=" + flag +
                ", code='" + code + '\'' +
                ", user=" + user +
                ", userList=" + userList +
                '}';
    }
}
