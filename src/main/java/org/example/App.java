package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

import static java.lang.System.out;

public abstract class App {

    public static void main(String[] args) {
        names("John");
        substract(1, 3);
        biggest(new int[]{3, 4, 5, 6, 7});
        biggest_bubble_sort(new int[]{3, 4, 5, 6, 7, 8});
        even(5);
        fiveToOne();
        table(7);
        sumArray(new int[]{3, 4, 5});
        sumArray1(new int[]{3, 4, 5});
        sumArray2(new int[]{3, 4, 5});
        Calculator.calc();
    }

    public static void names(String input) {
        String name = input;
        String admin = name;
        out.println(admin);
    }

    public static void substract(int a, int b) {
        int result = a - b;
        out.println(result);
    }

    public static void biggest_bubble_sort(int[] args) {
        int temp;
        for(int i = 0; i  < args.length -1 ; i++) {
            for(int e = 0; e < args.length -1; e++) {
                if (args[i] < args[e + 1]) {
                    temp = args[e + 1];
                    args[e + 1] = args[i];
                    args[i] = temp;
                }
            }
        }
        System.out.println(args[0]);
    }

    public static void biggest(int[] args) {
        Arrays.sort(args);
        out.println(args[args.length - 1]);
    }

    public static void even(int a) {
        String result = "Number is ";
        if (a % 2 == 0) {
            result += "even";
        } else {
            result += "odd";
        }
        out.println(result);
    }

    public static void fiveToOne() {
        for (int x = 5; x >= 1; x--) {
            out.print(x + " ");
        }
        out.print("\n");
    }

    public static void table(int x) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int e = 1; e <= arr.length; e++) {
            out.println(x + " * " + e + " = " + e * x);
        }
    }

    public static void sumArray(int[] arr) {
        int sum = IntStream.of(arr).sum();
        out.println("The sum is " + sum);
    }

    public static void sumArray1(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        out.println("The sum is " + sum + " in more educational way");
    }

    public static void sumArray2(int[] arr) {
        int sum = 0;
        for (int e = 0; e < arr.length; e++) {
            sum += arr[e];
        }
        out.println("The sum is " + sum + " in even more educational way");
    }
}