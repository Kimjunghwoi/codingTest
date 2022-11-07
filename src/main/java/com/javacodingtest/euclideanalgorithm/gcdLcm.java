package com.javacodingtest.euclideanalgorithm;

/*
첫 번째 분수의 분자와 분모를 뜻하는 denum1, num1, 두 번째 분수의 분자와 분모를 뜻하는 denum2, num2가 매개변수로 주어집니다.
두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
..
기약 분수 : 더이상 약분할 수 없는 분수.
*/

import java.util.Arrays;

public class gcdLcm {

    // 최대공약수
    // GCD(a, b) = GCD(b, r)
    //  => r = a % b;
    public static int gcd(int num1, int num2) {

        while(num2 != 0) {
            int r = num1 % num2;	// 나머지를 구해준다.

            // GCD(a, b) = GCD(b, r)이므로 변환한다.
            num1 = num2;
            num2 = r;
        }
        return num1;
    }
    //최소공배수
    static int lcm(int a, int b) {
        return a * b / gcd(a, b);// gcd(a, b) ==> 분모의 최대공약수
    }

    public static int[] solution(int denum1, int num1, int denum2, int num2) {

        //분모부터.. 기약 분수를 만들기 위해 최대공약수를 구함
        //lcm 에서 처리
//        int gcd = gcd(num1, num2);

        // 분모에 어떤 수를 곱해야 기존과 같아지는지 확인하기 위해 최소공배수구함
        int lcm = lcm(num1, num2);

        //최소공배수를 곱하여 분자를 분모에 맞춰준다
        int mul1 = lcm / num1;
        denum1 *= mul1;
        int mul2 = lcm / num2;
        denum2 *= mul2;

        //분자를 더한다
        int denum = denum1 + denum2;

        //기약분수를 구해야 하므로, 합한 분자와 분모의 최대공약수를 구한다.
        int gcd2 = gcd(denum, lcm);

        // 최대공약수로 나눠준다.

        return new int[]{denum / gcd2, lcm / gcd2};

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(1, 2, 3, 4)));

    }

}
