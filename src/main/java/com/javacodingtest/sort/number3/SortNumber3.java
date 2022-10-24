package com.javacodingtest.sort.number3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortNumber3 {

    public static void main(String[] args) throws IOException {

        //Array 사용
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb1 = new StringBuilder();

        int N1 = Integer.parseInt(br1.readLine());
        int[] arr1 = new int[N1];

        for (int i = 0; i < N1; i++) {
            arr1[i] = Integer.parseInt(br1.readLine());
        }

        // 정렬 메소드
        Arrays.sort(arr1);

        for (int val : arr1) {
            sb1.append(val).append("\n");
        }
        System.out.println(sb1);

        //Array END

    }
}