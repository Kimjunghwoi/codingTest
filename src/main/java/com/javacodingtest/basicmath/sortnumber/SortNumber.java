package com.javacodingtest.basicmath.sortnumber;

import java.util.Arrays;

public class SortNumber {

    public static void main(String[] args) {

        Long n = 8123456789L;
        String[] list = String.valueOf(n).split("");
        System.out.println("list = " + Arrays.toString(list));
        Arrays.sort(list);

        System.out.println("list = " + Arrays.toString(list));
        StringBuilder sb = new StringBuilder();
        for (String charAt : list) sb.append(charAt);

        System.out.println("sb.toString() = " + sb);
        System.out.println(Long.parseLong(sb.reverse().toString()));
    }

}
