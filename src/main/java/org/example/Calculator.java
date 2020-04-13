package org.example;
import java.util.Scanner;

import static java.lang.System.out;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       calc();
    }

    public static int getInt(){
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            out.println("Invalid number, please try again");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            out.println("Invalid operation, please try again.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }


    public static int addition(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
    public static int substraction(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }
    public static int multiplication(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }
    public static int diviision(int num1, int num2) {
        int result = num1/num2;
        return result;
    }

    public static void calc() {
        int result;
        out.println("Enter first number");
        int num1 = getInt();
        out.println("Enter operation");
        char operation = getOperation();
        out.println("Enter second number");
        int num2 = getInt();
        switch (operation) {
            case '+':
                result = addition(num1, num2);
                break;
            case '-':
                result = substraction(num1, num2);
                break;
            case '*':
                result = multiplication(num1, num2);
                break;
            case '/':
                result = diviision(num1, num2);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
        out.println("Result:" + result);
    }

}
