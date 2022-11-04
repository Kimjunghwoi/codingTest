package com.javacodingtest.programmers.level0;

public class OngAl {

    public int solution(String[] babbling) {
        int answer = 0;
        StringBuilder addBabbles = new StringBuilder();
        for (String n : babbling) {
            addBabbles.append(n);
        }
        String[] says = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < says.length; i++) {
            if(addBabbles.toString().contains(says[i])){
                answer++;
            };
        }
        return answer;
    }

    public static void main(String[] args) {


    }
}
