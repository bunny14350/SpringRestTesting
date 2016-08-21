package com.trainologic.examples.poaliam.testing.domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by oridar on 7/31/2016
 */

@XmlRootElement
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
