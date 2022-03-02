package com.hackerrank.week2;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {

        int n = arr.size();
        int lrSum = 0;
        int rlSum = 0;

        for(int i = 0 ; i < n ; i++) {
            lrSum += arr.get(i).get(i);
            rlSum += arr.get(n-i-1).get(i);
        }

        return Math.abs(lrSum - rlSum);
    }
}
