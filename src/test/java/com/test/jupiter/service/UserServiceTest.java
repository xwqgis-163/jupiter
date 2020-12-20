package com.test.jupiter.service;

import com.test.jupiter.JupiterApplication;
import com.test.jupiter.JupiterApplicationTest;
import com.test.jupiter.dao.UserDao;
import com.test.jupiter.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

//@TestPropertySource("classpath:application.yml")
//@ActiveProfiles("test")
@SpringBootTest(classes = {JupiterApplicationTest.class})
class UserServiceTest {

    @MockBean
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @Value("${user.id}")
    private int userId;

    @Value("${test}")
    private String test;

    @Test
    public void findUserById() {
        System.out.println(userId);
        System.out.println(test);

        when(userDao.getUserById(1)).thenReturn(new User(3, "bruce", "123456", "13510506078"));

        User user = userService.findUserById(1);
        Assertions.assertEquals(3, user.getUserId());
    }
}