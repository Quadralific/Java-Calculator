package me.redstonenotplaced.javacalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("JAVA CALCULATOR");
        System.out.println("-----------------------");
        System.out.println("");
        System.out.println("Enter a number: ");
        long i = scanner.nextLong();
        System.out.println("Enter a second number: ");
        long i2 = scanner.nextLong();
        System.out.println("Choose what operator to use: ");
        String operator = scanner.next();
        switch (operator) {
            case "+":
                System.out.println("The sum is: " + Math.addExact(i, i2));
                break;
            case "-":
                System.out.println("The difference is: " + Math.subtractExact(i, i2));
                break;
            case "*":
                System.out.println("The product is: " + Math.multiplyExact(i, i2));
                break;
            case "/":
                System.out.println("The quotient is: " + Math.floorDiv(i, i2));
                break;
            default:
                System.out.println("Thats not a valid operator! Here's a list of operators:");
                System.out.println("+(Addition), -(Subtraction), *(Multiplication), /(Division)");
        }


    }
}
