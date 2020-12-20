package com.test.jupiter.dao;

import com.test.jupiter.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public User getUserById(int id) {
        User user = null;
        switch (id) {
            case 1:
                user = new User(1, "bruce", "123456", "13510506078");
                break;
            case 2:
                user = new User(2, "carl", "123456", "13510506078");
                break;
            case 3:
                user = new User(3, "albert", "123456", "13510506078");
                break;
            case 4:
                user = new User(4, "rickey", "123456", "13510506078");
                break;
            default:
                user = null;
                break;
        }
        return user;
    }
}
