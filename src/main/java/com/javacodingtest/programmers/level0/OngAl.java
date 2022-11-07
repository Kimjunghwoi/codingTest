package com.javacodingtest.programmers.level0;

public class OngAl {
/*
    1 ≤ babbling의 길이 ≤ 100
    1 ≤ babbling[i]의 길이 ≤ 15
    babbling의 원소에서 "aya", "ye", "woo", "ma"는 각각 최대 한 번씩만 등장합니다.
    문자열은 알파벳 소문자로만 이루어져 있습니다.
*/



    public static void main(String[] args) {
        int answer = 0;
        String[] banSays = {"ayaaya", "yeye", "woowoo", "mama"};
        String[] says = {"aya", "ye", "woo", "ma"};
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        for (String bab : babbling) {
            String temp = bab;
            for (String ban : banSays) {
                temp = temp.replace(ban, "x");
            }
            for (String say : says) {
                temp = temp.replace(say, " ");
            }

            temp = temp.replace(" ", "");
            if (temp.length() == 0) {
                answer++;
            }
        }
        System.out.println("answer = " + answer);

    }
}
