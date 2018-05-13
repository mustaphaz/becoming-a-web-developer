package com.company;

public class Switcher{

    public static void main(String[] args){
        switch(1)  //1
        {
            case 0 :
                boolean b = false;
                break;

            case 1 :
                b = true; //2
                System.out.println(b);
                break;
        }
    }
}
