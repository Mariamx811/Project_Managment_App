package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int input;

        do {
            System.out.println("*************************************************");
            System.out.println("*******************Main Menu*********************");
            System.out.println("0-Exit");
            Scanner in = new Scanner(System.in);
            input = in.nextInt();
        }while (input != 0);
    }
}
