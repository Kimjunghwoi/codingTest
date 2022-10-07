package com.javacodingtest.olympiad;


//계산식 만들기

/**
 * 두 척의 배가 같은 위치에서 같은 방향으로 동시에 출발하여 일정한 속도로 나아간다.
 * 2시간 30분 후 두 배 사이의 거리가 10Km이었다. 이후 2시간을 더 항해한 후 두 배 사이의 거리는 몇 Km인가?
 */
public class CreateAFomula {

    public static void main(String[] args) {

        //2시간 30분의 각각 이동거리 150분으로 계산...
        // distanceX = 150 * x;
        // distanceY = 150 * y;
        // answer = (150 * x) - (150 * y) ==  10km -> x-y = 10/150...
         // -->> 2시간 추가.. 270..
        // answer = (270 * x) - (270 * y) ==  ? -> x-y = ans/270...
        // 6학년 수학 추가공부..ㅠ
        //  비례식
        // 150 : 10 = 270 : x
        // 답은 18

        int answer = 2700 * 150;

        }


}
