package com.besant.test;

public class C {

     void m2()
    {
        System.out.println("Hello from class C m2()");
    }
    public void m20()
    {
        System.out.println("Hello from class C m20()");
        m2();
    }
}
