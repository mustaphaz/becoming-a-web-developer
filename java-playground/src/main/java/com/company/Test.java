package com.company;

class Test {
    public static void main(String args[]) {

        int i = 0;
        int j = i++;
        int k = ++i;
        //===============
//        int i = 0;
//        int j = 1;
//        if ((i++ == 0) & (j++ == 2)) {
//            i = 12;
//        }
//        System.out.println(i + " " + j);
        //===============

        //===============
//        int var = 20, i = 0;
//        do {
//            while (true) {
//                System.out.println(i);
//                if (i++ > var) break;
//            }
//        } while (i < var--);
//        System.out.println(var);
//
//
//        double f = 43e1;
//        System.out.println(f);
        //===============


//        parseFloat("hallo");
    }

    public static float parseFloat(String s) {
        float f = 0.0f;
        try {
            f = Float.valueOf(s).floatValue();
            return f;
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid input " + s);
            f = Float.NaN;
            return f;
        } finally {
            System.out.println("finally" + f);
        }
//        return f;
    }

}
