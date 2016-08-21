package com.trainologic.examples.poaliam.testing;

import com.trainologic.examples.poaliam.testing.config.PoalimConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by oridar on 7/31/2016
 * Spring MVC server side integration test.
 * No need for running server. Builds on org.springframework.mock.web objects
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PoalimConfig.class})
// Signals that the Spring application context is WebApplicationContext
@WebAppConfiguration
public class PoalimWebIntegrationTest {

    @Autowired
    private WebApplicationContext wac;

    // Main entry point for server-side Spring MVC test support.
    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void findUser() throws Exception {
        this.mockMvc.perform(get("/users/get/faina").accept("application/json"))
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.name").value("faina"))
                .andExpect(status().isOk());

        // validate that post is not supported
        this.mockMvc.perform(post("/users/get/faina").accept("application/json"))
                .andExpect(status().isMethodNotAllowed());

        // validate that xml is not suppported
        this.mockMvc.perform(get("/users/get/faina").accept("application/xml"))
                .andExpect(status().isNotAcceptable());
    }
}
