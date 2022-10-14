package com.javacodingtest.basicmath;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BreakEvenPoint {
    /**
     * Memo :
     * 임대료,재산세 보험료, 급여 = A
     * 노트북 1대 생산 비용 = B
     * <p>
     * A = 1000, B = 70
     * 1년에 1대 생산 비 1070 -> 10대 생산 1700
     * <p>
     * 노트북 1대 판매 금액 = C
     * <p>
     * 손익분기점 -> C * N  > A + ( B * N ) -> A / C - B
     * ex ) c = 170 이라면..
     * 1000 / 100  = N 이 손익 분기점 하지만 계산값이 총수입과 총 비용이 같기때문에 + 1처리
     * N + 1  = 11
     *
     *
     */

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        long A = Integer.parseInt(tokenizer.nextToken());
        long B = Integer.parseInt(tokenizer.nextToken());
        long C = Integer.parseInt(tokenizer.nextToken());

        /*
          손익 분기점이 존재하지 않는다면 -1 ...
          존재하지 않으려면 1대 판매금액이 생산비용과 같거나 더 작으면 생긴다고 판단
         */
        if (C <= B) {
            writer.write("-1\n");
        } else {
            writer.write(((A / (C - B)) + 1) + "\n");
        }

        writer.flush();
        reader.close();
        writer.close();
    }
}
