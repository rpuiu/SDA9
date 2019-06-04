package com.sda.sda9.testio.anotherpackage;

import java.io.Serializable;

public class TestSerializable implements Serializable {
    private static final long serialVersionUID = -3;
    String a;
    String b;

    public TestSerializable(String a, String b) {
        this.a = a;
        this.b = b;
    }
}
