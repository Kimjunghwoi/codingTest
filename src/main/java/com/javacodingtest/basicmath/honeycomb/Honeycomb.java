package com.javacodingtest.basicmath.honeycomb;

import java.util.Scanner;

public class Honeycomb {

    /**
     * Memo :
     * 육각형을 봤을 때 중앙의 1 부터 밖으로 한 바퀴 씩 돌아갈 때 범위가 얼마나 커지는지를 봤다.
     * 1, 6, 12, 18, 24... 6개씩 증가한다..
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long a = 2;
        int c = 1;

        if (n == 1) {
            System.out.println(1);
        }else{
            while (a <= n) {
                a = a + (c * 6L);
                c++;
            }
            System.out.println(Long.valueOf(c));
        }
    }


}
