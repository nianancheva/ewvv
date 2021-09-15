package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int deci = Integer.parseInt(scan.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (deci != 0) {
            stack.push(deci % 2);
            deci = deci / 2;
        }

        if (stack.size() == 0) {
            System.out.println(0);
        } else {
            for (int number : stack) {
                System.out.print(number);
            }
        }

    }
}
