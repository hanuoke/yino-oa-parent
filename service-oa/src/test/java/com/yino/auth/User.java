package com.yino.auth;

import org.springframework.stereotype.Component;

/**
 * ClassName: User
 * Package: com.yino.auth
 * Description:
 */
@Component
public class User {

    public String getUsername(int id) {
        if(id == 1) {
            return "zhangsan";
        }
        if(id == 2) {
            return "lisi";
        }
        return "admin";
    }
}
