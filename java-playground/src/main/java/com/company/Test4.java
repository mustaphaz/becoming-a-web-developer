package com.company;

class Super { static String ID = "QBANK"; }

class Sub extends Super{
    static { System.out.print("In Sub"); }
}
public class Test4{
    public static void main(String[] args){
        System.out.println(Sub.ID);
    }
}
