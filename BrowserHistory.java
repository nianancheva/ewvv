package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();

        String command = scan.nextLine();

        String currentURL; // = null

        while (!command.equals("Home")) {

            if (command.equals("back")) {
                if (history.size() <= 1) {
                    System.out.println("no previous URLs");
                    command = scan.nextLine();
                    continue;
                } else {
                    String toRemove = history.pop();
                    //String previous = history.peek();
                    currentURL = history.peek();
                }
            } else {
                currentURL = command;
                history.push(currentURL);
            }
            System.out.println(currentURL);

            command = scan.nextLine();
        }

    }
}
