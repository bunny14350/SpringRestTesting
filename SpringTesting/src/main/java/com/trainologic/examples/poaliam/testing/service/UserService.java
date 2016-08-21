package com.trainologic.examples.poaliam.testing.service;

import com.trainologic.examples.poaliam.testing.dao.UserDao;
import com.trainologic.examples.poaliam.testing.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by oridar on 7/31/2016
 */
@Service
public class UserService {

    UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String greet(String name) {
        return "hello " +   userDao.userByName(name).getName();
    }

    public User getUser(String name) {
        return  userDao.userByName(name);
    }
}
