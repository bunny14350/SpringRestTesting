package com.trainologic.examples.poaliam.testing;

import com.trainologic.examples.poaliam.testing.config.PoalimServiceDaoConfig;
import com.trainologic.examples.poaliam.testing.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by oridar on 7/31/2016
 * A Spring integration test
 * UserService is injected as a fixture
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PoalimServiceDaoConfig.class})
public class PoalimIntegrationTest {

    @Autowired
    UserService userService;

    @Test
    public void assertGreeting() {
        Assert.assertEquals("hello faina", userService.greet("faina"));
    }

}
