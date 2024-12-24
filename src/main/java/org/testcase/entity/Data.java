package org.testcase.entity;


import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;

//@Entity
//@Table(name = "data")
public class Data  {

    public String name;
    public String test;
    public  String desc_test;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getDesc_test() {
        return desc_test;
    }

    public void setDesc_test(String desc_test) {
        this.desc_test = desc_test;
    }
}
