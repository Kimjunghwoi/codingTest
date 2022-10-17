package com.javacodingtest.basicmath.fountain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fountain {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(reader.readLine());

        int count_sum = 0, count = 1;

        while (true) {

            // 대각선 단계 합 + 대각선의 노드 갯 수 보다 받은 번호 수 가 적을때
            // ex ) X = 2 라면 답은 1/2 이며 해당 분기를 타지 못함.
            if (X <= count_sum + count) {

                //노드의 갯수가 홀수라면.. 분자가 큰 수부터 시작한다.
                // 분자는 대각선 상 ->  블럭의 개 수 - (X - 누적 된 블럭 개 수 - 1)
                // 분모는 X - 누적 된 블럭 개 수
                if (count % 2 == 1) {
                    System.out.print((count - (X - count_sum - 1) + "/" + (X - count_sum)));
                    break;
                } else {
                    //노드의 갯수가 짝수라면.. 분자가 작은 수부터 시작한다.
                    //때문에 계산식을 반대로..
                    System.out.print((X - count_sum) + "/" + (count - (X - count_sum - 1)));
                    break;
                }
            } else {
            // 위 분기에 타지 못했을때 1씩 증가시킴
            // 라인을 찾아 주는 count는 1씩 증가 count_sum은 증가하기전 count를 추가해준다.
                count_sum += count;
                count++;
            }
        }
    }
}
