package com.trainologic.examples.poaliam.testing.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by oridar on 7/31/2016
 */

@Configuration
@ComponentScan(basePackages = {
        "com.trainologic.examples.poaliam.testing.service",
        "com.trainologic.examples.poaliam.testing.dao"})
public class PoalimServiceDaoConfig {

}
