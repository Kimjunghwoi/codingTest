package com.javacodingtest.sort.number1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortNumber1 {

    public static void main(String[] args) throws IOException {

        //선택정렬 (Selection sort)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < N - 1; i++) {
            for(int j = i + 1; j < N; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for(int val : arr) {
            sb.append(val).append('\n');
        }
        System.out.println(sb);

        //선택정렬 (Selection sort) END

        //Array 사용

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb1 = new StringBuilder();

        int N1 = Integer.parseInt(br1.readLine());
        int[] arr1 = new int[N1];

        for(int i = 0; i < N1; i++) {
            arr1[i] = Integer.parseInt(br1.readLine());
        }

        // 정렬 메소드
        Arrays.sort(arr1);

        for(int val : arr1) {
            sb1.append(val).append("\n");
        }
        System.out.println(sb1);

        //Array END

        //Counting Sort

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb2 = new StringBuilder();

        int N2 = Integer.parseInt(br2.readLine());

		/*
		  range : -1000 ~ 1000
		  0 은 index[1000] 을 의미
		*/
        boolean[] arr2 = new boolean[2001];

        for(int i = 0; i < N2; i++) {
            arr2[Integer.parseInt(br2.readLine()) + 1000] = true;
        }

        // 정렬 과정이 따로 필요 없음
        for(int i = 0; i < 2001; i++) {
            if(arr2[i]) {
                sb2.append(i - 1000).append('\n');
            }
        }
        System.out.println(sb2);
    }

    //결과 == 숏코딩 측면에서 Array.sort에 BufferedReader, StringBuilder를 이용한 방법이 가장 짧았으며
    //         속도 측면에선 카운팅 정렬이 가장 좋았다.
}
