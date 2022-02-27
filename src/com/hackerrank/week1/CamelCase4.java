package com.hackerrank.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class CamelCase4 {

//    public static void main(String[] args) throws IOException {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String inputText = "";
//        while((inputText = bufferedReader.readLine()) != null)
//        {
//            camelCase(inputText);
//        }
//
//    }

    public static void camelCase(String inputText) {
        String[] aInput = inputText.split(";");
        String output = "";

        if("S".equals(aInput[0])) {
            // 대문자 기준으로 띄어쓰기 후 소문자로 변환

            // Method의 경우 괄호 생략 처리
            if("M".equals(aInput[1])){
                aInput[2] = aInput[2].substring(0, aInput[2].length()-2);
            }

            // 첫 글자 빼고 대문자 앞 띄어쓰기
            output += aInput[2].charAt(0);
            for(int i = 1 ; i < aInput[2].length() ; i++) {
                char tmp = aInput[2].charAt(i);

                if(Character.isUpperCase(tmp)){
                    output += " " + tmp;
                } else {
                    output += tmp;
                }
            }

            // 다른 경우에는 추가로 처리할 것 없음

            output = output.toLowerCase(Locale.ROOT);

        } else { //C
            // 띄어쓰기 뒷문자 대문자로 변환 후 띄어쓰기 생략
            boolean isCapital = false;
            for(int i = 0 ; i < aInput[2].length() ; i++) {
                char tmp = aInput[2].charAt(i);

                if(Character.isSpaceChar(tmp)){
                    output += "";
                    isCapital = true;
                } else {
                    if(isCapital){
                        output += (""+tmp).toUpperCase(Locale.ROOT);
                        isCapital = false;
                    } else {
                        output += tmp;
                    }
                }
            }

            // Method의 경우 끝에 괄호 추가, class의 경우 맨 앞 글자 대문자 전환
            if("M".equals(aInput[1])){
                output = output + "()";
            } else if ("C".equals(aInput[1])){
                output = (""+output.charAt(0)).toUpperCase(Locale.ROOT) + output.substring(1);
            }
            // V는 추가로 처리할 것 없음
        }

        System.out.println(output);
    }
}
