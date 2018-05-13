package com.company;

class LoopTest{
    public static void main(String args[]) {
        int counter = 0;
        outer:
        for (int i = 0; i < 3; i++) {
            middle:
            for (int j = 0; j < 3; j++) {
                inner:
                for (int k = 0; k < 3; k++) {
                    System.out.println("i="+i+" j="+j+" k="+k);
                    if (k - j > 0) {
                        System.out.println("breaking middle "+j);
                        break middle;
                    }
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
