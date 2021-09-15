package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int toss = Integer.parseInt(scan.nextLine());

        ArrayDeque<String> names = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            String name = input[i];
            names.offer(name);
        }

        int c = 1;

        while (names.size() != 1) {

            if (c % toss == 0) {
                String removed = names.poll();
                System.out.println("Removed " + removed);
                c++;
                continue;
            }

            String pass = names.poll();
            names.offer(pass);

            c++;
        }

        System.out.printf("Last is %s", names.peek());

    }
}
