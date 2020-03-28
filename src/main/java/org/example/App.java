package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public abstract class App {


    public static void main(String[] args) {
        names("John");
        substract(1, 3);
        biggest(new int[]{3, 4, 5});
        even(5);
        fiveToOne();
        table(7);
        sumArray(new int[]{3, 4, 5});
        sumArray1(new int[]{3, 4, 5});
        sumArray2(new int[]{3, 4, 5});
    }

    public static void names(String input) {
        String name = input;
        String admin = name;
        System.out.println(admin);
    }

    public static void substract(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }

    public static void biggest(int[] args) {
        Arrays.sort(args);
        System.out.println(args[args.length - 1]);
    }

    public static void even(int a) {
        String result = "Number is ";
        if (a % 2 == 0) {
            result += "even";
        }
        else  {
            result += "odd";
        }
        System.out.println(result);
    }

    public static void fiveToOne(){
        for (int x = 5; x >= 1; x--){
            System.out.print(x + " ");
        }
        System.out.print("\n");
    }

    public static void table(int x) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int num : arr) {
            System.out.println(x + " * " + num + " = " + num*x);
        }
    }

    public static void sumArray(int[] arr) {
        int sum = IntStream.of(arr).sum();
        System.out.println("The sum is " + sum);
    }

    public static void sumArray1(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("The sum is " + sum + " in more educational way");
    }

    public static void sumArray2(int[] arr) {
        int sum = 0;
        for (int e = 0; e < arr.length; e++) {
            sum = sum + arr[e];
        }
        System.out.println("The sum is " + sum + " in even more educational way");
    }

    public static  void calculator(int[] args) {

    }
//    1. Убрать .idea, iml, target из проекта. если пока не знаешь как - сделаешь это после лекции Сережи по гиту.
//3. Task 3: попробуй написать свою сортировку, не используя метод sort();
//4. Task 6: почему присутствует закоментированый код? можно сделать проще с обычным циклом for, подумай как
}
