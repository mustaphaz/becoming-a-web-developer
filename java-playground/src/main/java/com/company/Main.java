package com.company;

public class Main {

    public static void main(String[] args) {

        boolean test = (new Long(1)).equals(new Integer(1));
        System.out.println(test);

        int index = 1;
        String[] strArr = new String[5];
        String myStr = strArr[index];
        System.out.println(myStr);
    }
}
