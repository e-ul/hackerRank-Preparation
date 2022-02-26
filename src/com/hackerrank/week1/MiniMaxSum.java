package com.hackerrank.week1;

import java.util.List;
import java.util.stream.Collectors;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {

        long totalSum = 0L;

        arr = arr.stream().sorted().collect(Collectors.toList());

        for(Integer i : arr) {
            totalSum += i;
        }

        System.out.print((totalSum - arr.get(4)) + " " + (totalSum - arr.get(0)));
    }
}
