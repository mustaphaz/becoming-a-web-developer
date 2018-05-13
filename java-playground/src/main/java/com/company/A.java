package com.company;


public class A {
    int i = 10;

    public static void m1() {
        System.out.println("Static method m1 in A.");
    }

    public void m2() {
        System.out.println("Method m2 in A.");
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.i);
        a.m1();
        a.m2();
    }
}

class B extends A {
    int i = 20;

    public static void m1() {
        System.out.println("Static method m1 in B.");
    }

    public void m2() {
        System.out.println("Method m2 in B.");
    }
}
