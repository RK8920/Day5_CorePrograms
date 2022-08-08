package com.bridgelabz.evenorodd;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Welcome to Even and Odd Programs");
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Entered Number is EVEN");
        } else
            System.out.println("Entered Number is ODD");
    }
}
