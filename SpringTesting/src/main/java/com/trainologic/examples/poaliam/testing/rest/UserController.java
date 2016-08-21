package com.trainologic.examples.poaliam.testing.rest;

import com.trainologic.examples.poaliam.testing.domain.User;
import com.trainologic.examples.poaliam.testing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oridar on 7/31/2016
 */

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(path = "/get/{name}",  method = RequestMethod.GET, produces = "application/json")
    public User greet(@PathVariable("name") String name) {
        return userService.getUser(name);
    }


}
