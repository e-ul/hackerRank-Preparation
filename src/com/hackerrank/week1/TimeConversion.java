package com.hackerrank.week1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {

    public static String timeConversion(String s) {

        int hh = Integer.parseInt(s.substring(0,2), 10);
        String format = s.substring(8,10);

        if(format.equals("AM")) {
            if(hh == 12) {
                return "00" + s.substring(2, 8);
            } else {
                return s.substring(0, 8);
            }
        } else {
            if(hh == 12){
                return s.substring(0,8);
            } else {
                return (hh + 12) + s.substring(2, 8);
            }
        }

    }

    public static String timeConversion_v2(String s) {

        return LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa")).format(DateTimeFormatter.ofPattern("HH:mm:ss"));

    }

}
