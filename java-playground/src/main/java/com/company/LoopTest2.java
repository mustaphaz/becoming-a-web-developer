package com.company;

public class LoopTest2 {
    int k = 5;

    public boolean checkIt(int k) {
        return this.k-->0 ? true : false;
    }

    public void printThem() {
        while (checkIt(k)) {
            System.out.print(k);
        }
    }

    public static void main(String[] args) {
        new LoopTest2().printThem();
    }
}
