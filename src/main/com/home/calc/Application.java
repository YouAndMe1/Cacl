package com.home.calc;

import java.util.Scanner;

import static com.home.calc.Math.*;


public class Application {

    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double result = 0;
        char operation;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value:");
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print("Enter the first value:");
        }
        a = scanner.nextDouble();

        System.out.print("Choose the operation +,-,*,/: ");
        while (!scanner.hasNext("[+-/*]")) {
            scanner.next();
            System.out.print("Choose the operation +,-,*,/: ");
        }
        operation = scanner.next().charAt(0);

        System.out.print("Enter the second value:");
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print("Enter the first value:");
        }
        b = scanner.nextDouble();

        switch (operation) {
            case '*':
                result = mult(a, b);
                break;
            case '/':
                result = div(a, b);
                break;
            case '+':
                result = sum(a, b);
                break;

            case '-':
                result = sub(a, b);
                break;

        }

        System.out.println("Result:" + result);

        scanner.close();


    }

}
