package com.programcreek.helloworld.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("empp")
public class Employee {

    private String name;

    public Employee(){
       this.name = "Daniel";
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
       this.name = name;
    }
}
