package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public abstract class App {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ArrayList<Integer> fiveToOne = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        BinaryOperator<Integer> substract = (x, y) -> x - y;
        Predicate<Integer> even = x -> x % 2 == 0;
        names("John");
        System.out.println(substract.apply(1, 3));
        biggest_bubble_sort(new int[]{3, 4, 5, 6, 7, 8});
        System.out.println(even.test(3));
        Collections.reverse(fiveToOne);
        System.out.println(fiveToOne);
        nums.forEach(App::table);
        sumArray(new int[]{3, 4, 5});
        Calculator.calc();
    }

    public static void names(String input) {
        String name = input;
        String admin = name;
        System.out.println(admin);
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

    public static void sumArray(int[] arr) {
        int sum = IntStream.of(arr).sum();
        System.out.println("The sum is " + sum);
    }

    private static void table(Integer e) {
        System.out.println(7 + " * " + e + " = " + e * 7);
    }
}