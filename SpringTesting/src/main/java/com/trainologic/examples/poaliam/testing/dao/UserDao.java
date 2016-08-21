package com.trainologic.examples.poaliam.testing.dao;

import com.trainologic.examples.poaliam.testing.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by oridar on 7/31/2016
 */

@Repository
public class UserDao {

    public User userByName(String name) {return new User(name);}

}
