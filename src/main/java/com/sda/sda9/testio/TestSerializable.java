package com.sda.sda9.testio;

import java.io.Serializable;

public class TestSerializable implements Serializable {
    private static final long serialVersionUID = -5929917334606674243L;
    String a;
    String b;

    public TestSerializable(String a, String b) {
        this.a = a;
        this.b = b;
    }
}
