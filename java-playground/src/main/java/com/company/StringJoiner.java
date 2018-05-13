package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringJoiner {
    public static void main(String[] args) {
        List<String> lijst0 = new ArrayList<>();
        List<String> lijst1 = Arrays.asList("Een");
        List<String> lijst2 = Arrays.asList("Een", "Twee");

        String stringLijst0 = String.join("--", lijst0);
        String stringLijst1 = String.join("--", lijst1);
        String stringLijst2 = String.join("--", lijst2);

        System.out.println("StringLijst0" + stringLijst0);
        System.out.println("StringLijst1" + stringLijst1);
        System.out.println("StringLijst2" + stringLijst2);
    }
}
