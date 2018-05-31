package com.company.codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Max {

    public static void main(String[] args) {
        System.out.println(sequence2(new int[]{-1, 3, 4, -5, 7}));
    }


    public static int sequence1(int[] arr) {
        final List<Integer> list = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());

        final long positive = list.stream()
                .filter(x -> x > 0)
                .count();

        // empty or all negative numbers in array:
        if (positive == 0)
            return 0;

        // all positive numbers:
        if (arr.length == positive)
            return IntStream.of(arr).sum();


        // mixed list:
        final int end = list.size();
        final List<Integer> resultList = new ArrayList<>();

        IntStream.range(0, end).forEach(i -> {
            IntStream.range(i, end).forEach(j -> {
                resultList.add(list.subList(i, j + 1).stream().mapToInt(x -> x).sum());
            });
        });

        return Collections.max(resultList);
    }

    public static int sequence2(int[] arr) {
        int m = 0, a = 0, s = 0;
        for (int e : arr) {
            s += e;
            m = Math.min(s, m);
            a = Math.max(a, s - m);
        }
        return a;
    }
}