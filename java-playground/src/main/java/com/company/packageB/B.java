package com.company.packageB;

import com.company.packageA.A;

public class B extends A{
    public void test(){
        A a = new A();
//        a.bla();
    }

    public void bla(){
        System.out.println("In class B.");
    }

    public static void main(String[] args) {
        new B().test();
    }
}
