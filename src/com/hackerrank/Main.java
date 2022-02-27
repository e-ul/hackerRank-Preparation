package com.hackerrank;

import com.hackerrank.week1.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = "";
        while((inputText = bufferedReader.readLine()) != null)
        {
            CamelCase4.camelCase(inputText);
        }

        // week1 - Plus Minus
//        List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);
//        PlusMinus.plusMinus(arr);

        // week1 - Mini-Max Sum
//        List<Integer> arr = Arrays.asList(7,69,2,221,8974);
//        MiniMaxSum.miniMaxSum(arr);

        // week1 - Divisible Sum Pairs
//        String result = TimeConversion.timeConversion("07:05:45PM");

        // week1 - Divisible Sum Pairs
//        List<Integer> ar = Arrays.asList(1, 3, 2, 6, 1, 2);
//        int result = DivisibleSumPairs.divisibleSumPairs(6, 3, ar);

        // week1 - Sparse Arrays
//        List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");
//        List<String> queries = Arrays.asList("aba", "xzxb","ab");
//        List<Integer> res = SparseArrays.matchingStrings(strings, queries);

        // week1 - Breaking the Records
//        List<Integer> scores = Arrays.asList(12,24,10,24);
//        List<Integer> result = BreakingTheRecords.breakingRecords(scores);
    }
}
