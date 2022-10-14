package com.javacodingtest.queue;

import java.util.LinkedList;
import java.util.Scanner;

public class Queue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        java.util.Queue<Integer> queue = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();

        int N = scanner.nextInt();
//        int i = 0;
        int x = 0;
        while (N --> 0) {
            String next = scanner.next();
            switch (next) {
                case "push":
                    x = scanner.nextInt();
                    queue.offer(x);
//                    System.out.println("push " + x);
                    break;
                case "pop":
                    stringBuilder.append((queue.isEmpty() ? -1 : queue.poll()) + "\n");
//                    System.out.println(queue.isEmpty() ? -1 : queue.poll());
                    break;
                case "size":
                    stringBuilder.append(queue.size() + "\n");
//                    System.out.println(queue.size());
                    break;
                case "empty":
                    stringBuilder.append((queue.isEmpty() ? 1 : 0) + "\n");
                    break;
                case "front":
                    stringBuilder.append((queue.isEmpty() ? -1 : queue.peek()) + "\n");
                    break;
                case "back":
                    stringBuilder.append((queue.isEmpty() ? -1 : x) + "\n");
                    break;
                default:
                    break;
            }
//            i++;
            System.out.println(stringBuilder);
        }
    }
}
