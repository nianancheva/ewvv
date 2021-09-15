package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String expression = scan.nextLine();

        ArrayDeque<Integer> openingBracketsIndex = new ArrayDeque<>();

        int i = 0;

        while (expression.contains("(") && expression.contains(")") && i < expression.length()) {

            if (expression.charAt(i) == '(') {
                openingBracketsIndex.push(i);
            } else if (expression.charAt(i) == ')') {
                System.out.println(expression.substring(openingBracketsIndex.pop(), i + 1));
            }

            i++;
        }

    }
}
