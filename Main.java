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
        long l = scanner.nextLong();
        System.out.println("Enter a second number: ");
        long l2 = scanner.nextLong();
        System.out.println("Choose what operator to use: ");
        String operator = scanner.next();
        switch (operator) {
            case "+":
                System.out.println("The sum is: " + Math.addExact(l, l2));
                break;
            case "-":
                System.out.println("The difference is: " + Math.subtractExact(l, l2));
                break;
            case "*":
                System.out.println("The product is: " + Math.multiplyExact(l, l2));
                break;
            case "/":
                System.out.println("The quotient is: " + Math.floorDiv(l, l2));
                break;
            default:
                System.out.println("Thats not a valid operator! Here's a list of operators:");
                System.out.println("+(Addition), -(Subtraction), *(Multiplication), /(Division)");
        }


    }
}
