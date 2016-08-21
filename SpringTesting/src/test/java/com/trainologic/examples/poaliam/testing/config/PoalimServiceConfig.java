package com.trainologic.examples.poaliam.testing.config;

import com.trainologic.examples.poaliam.testing.dao.UserDao;
import com.trainologic.examples.poaliam.testing.domain.User;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by oridar on 7/31/2016
 */

@Configuration
@ComponentScan(basePackages = {"com.trainologic.examples.poaliam.testing.service"})
public class PoalimServiceConfig {

    /*
    Only the service package is scaned for Spring components
    The UserDao is therefore has to be mocked
     */
    @Bean
    public UserDao mockUserDao() {
        UserDao userDao = Mockito.mock(UserDao.class);
        Mockito
                .when(userDao.userByName(Mockito.anyString()))
                .thenReturn(new User("mock"));
        return userDao;
    }

}
