package com.hackerrank.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountingSort1 {

    public static List<Integer> countingSort(List<Integer> arr) {
        int[] result = new int[100];

        for(int i : arr) {
            result[i]++;
        }

        List<Integer> sorted = Arrays.stream(result).boxed().collect(Collectors.toList());

        return sorted;
    }

    public static List<Integer> countingSort_v2(List<Integer> arr) {

        List<Integer> sorted = new ArrayList<>(Collections.nCopies(100, 0));

        for(int i : arr) {
            sorted.set(i, sorted.get(i)+1);
        }

        return sorted;
    }

//    public static List<Integer> countingSort(List<Integer> arr) {
//        int[] result = new int[100];
//        List<Integer> sorted = new ArrayList<>();
//
//        for(int i = 0 ; i < arr.size() ; i++) {
//            result[arr.get(i)]++;
//        }
//
//        for(int i = 0 ; i < 100 ; i++){
//            for(int j = 0 ; j < result[i] ; j++) {
//                sorted.add(i);
//            }
//        }
//        return sorted;
//    }

}
