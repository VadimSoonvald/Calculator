/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to calculator");
        System.out.println("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        double number_one = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double number_two = scanner.nextDouble();
        System.out.println("Enter operation: (+, -, *, /)");
        scanner.nextLine();
        String symbols = scanner.nextLine();
        double result = 0;
        if ("+".equals(symbols)) {    
            result = number_one + number_two;
        }    
        if ("-".equals(symbols)) {    
            result = number_one - number_two;
        }    
        if ("*".equals(symbols)) {    
            result = number_one * number_two;
        }    
        if ("/".equals(symbols)) {    
            result = number_one / number_two;
        }    
        System.out.print("Result");
        System.out.printf("%.2f%n%s%n%10.2f%n ,и %n%10.2f%n",
                result, "использовались числа:",
                number_one,
                number_two
        );
        System.out.println("Good bye");
    }
    
}
