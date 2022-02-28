package com.hackerrank.mockTest;

public class FizzBuzz {
    public static void fizzBuzz(int n) {

        for(int i = 1 ; i <= n ; i++) {
            String output = "";

            if(i%3 == 0) {
                output += "Fizz";
            }
            if(i%5 == 0) {
                output += "Buzz";
            }
            if(output == "") {
                output += i;
            }

            System.out.println(output);

        }

    }
}
