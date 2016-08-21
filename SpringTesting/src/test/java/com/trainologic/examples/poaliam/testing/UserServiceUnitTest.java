package com.trainologic.examples.poaliam.testing;

import com.trainologic.examples.poaliam.testing.dao.UserDao;
import com.trainologic.examples.poaliam.testing.domain.User;
import com.trainologic.examples.poaliam.testing.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by oridar on 7/31/2016
 * A unit test which uses mockito to mock UserDao which is depedency injected in real
 */
public class UserServiceUnitTest {

    @Test
    public void assertGreet() throws NoSuchFieldException {
        UserService userService = new UserService();

        UserDao userDao = Mockito.mock(UserDao.class);
        Mockito
                .when(userDao.userByName(Mockito.anyString()))
                .thenReturn(new User("mock"));
       userService.setUserDao(userDao);

        Assert.assertEquals("hello mock", userService.greet("faina"));
    }

}
