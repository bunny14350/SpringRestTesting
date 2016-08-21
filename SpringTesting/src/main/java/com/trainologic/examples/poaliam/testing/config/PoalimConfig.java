package com.trainologic.examples.poaliam.testing.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by oridar on 7/31/2016
 */

@Configuration
@ComponentScan(basePackages = {"com.trainologic.examples.poaliam.testing"})
@EnableWebMvc
public class PoalimConfig {
}
