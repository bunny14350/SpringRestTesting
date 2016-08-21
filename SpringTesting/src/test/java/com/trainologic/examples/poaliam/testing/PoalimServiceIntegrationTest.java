package com.trainologic.examples.poaliam.testing;

import com.trainologic.examples.poaliam.testing.config.PoalimServiceConfig;
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
 * The service layer is however tested in isolation. The dao layer is mocked
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PoalimServiceConfig.class})
public class PoalimServiceIntegrationTest {

    @Autowired
    UserService userService;

    @Test
    public void assertGreeting() {
        Assert.assertEquals("hello mock", userService.greet("faina"));
    }

}
