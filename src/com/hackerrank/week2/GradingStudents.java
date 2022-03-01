package com.hackerrank.week2;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> result = new ArrayList<>();

        for(Integer i : grades) {
            if( i < 38 ) {
                result.add(i);
            } else {
                int diff = 5 - (i % 5);

                if ( diff < 3 ){
                    result.add(i + diff);
                } else {
                    result.add(i);
                }
            }
        }

//        for(Integer i : grades) {
//            if( i < 38 ) {
//                result.add(i);
//            } else {
//                int next5 = (( i / 5 ) + 1) * 5;
//
//                if ( next5 - i < 3 ){
//                    result.add(next5);
//                } else {
//                    result.add(i);
//                }
//            }
//        }

        return result;
    }

}
