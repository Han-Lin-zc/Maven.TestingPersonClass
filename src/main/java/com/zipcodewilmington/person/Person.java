package com.zipcodewilmington.person;

import com.apple.eawt.event.MagnificationEvent;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = "Leon";
    }

    public void setAge(int age) {
        this.age = 5;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
