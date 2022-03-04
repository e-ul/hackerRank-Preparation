package com.hackerrank.week2;

import java.util.Arrays;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {

        int seaLv = 0;
        int result = 0;

        for(int i = 0 ; i < steps ; i++) {
            if(path.charAt(i) == 'D') {
                seaLv--;
            } else {
                seaLv++;
                if(seaLv == 0){
                    result++;
                }
            }
        }

        return result;
    }

    public static int countingValleys_v2(int steps, String path) {
        boolean underSea = false;
        int seaLv = 0;
        int result = 0;

        for(int i = 0 ; i < steps ; i++) {
            if(path.charAt(i) == 'U') {
                seaLv++;
            } else {
                seaLv--;
            }

            if(seaLv < 0) {
                underSea = true;
            } else {
                if(underSea){
                    result++;
                }
                underSea = false;

            }
        }

        return result;
    }
}
