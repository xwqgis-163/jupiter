package com.test.jupiter.service;

import com.test.jupiter.dao.UserDao;
import com.test.jupiter.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User findUserById(int id) {
        return userDao.getUserById(id);
    }

}
