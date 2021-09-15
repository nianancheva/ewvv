package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SampleCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] expressionElements = scan.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = expressionElements.length - 1; i >= 0; i--) {
            stack.push(expressionElements[i]);
        }

        while (stack.size() > 1) {
            int leftOperand = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int rightOperand = Integer.parseInt(stack.pop());

            int result = operator.equals("+")
                    ? leftOperand + rightOperand
                    : leftOperand - rightOperand;

            stack.push(String.valueOf(result));
        }

        System.out.println(stack.pop());

    }
}
