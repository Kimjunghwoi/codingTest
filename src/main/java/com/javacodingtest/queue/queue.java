package com.javacodingtest.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int N = scanner.nextInt();

        int i = 0;
        int x = 0;
        while (i < N) {
            String next = scanner.next();
            switch (next) {
                case "push":
                    x = scanner.nextInt();
                    queue.offer(x);
//                    System.out.println("push " + x);
                    break;
                case "pop":
                    System.out.println(queue.isEmpty() ? -1 : queue.poll());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    System.out.println(queue.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    System.out.println(queue.isEmpty() ? -1 : queue.peek());
                    break;
                case "back":
                    System.out.println(queue.isEmpty() ? -1 : x);
                    break;
            }
            i++;
        }


    }


}
