package com.hackerrank.week2;

public class FlippingBits {

    public static long flippingBits(long n) {

        return (long) Math.pow(2,32) - 1 - n;
    }

    public static long flippingBits_v2(long n) {

        return Long.parseLong(Long.toBinaryString(~n).substring(32), 2);
    }

}
