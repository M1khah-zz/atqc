package org.example;

/**
 * Hello world!
 *
 */
public abstract class App {


    public static void main(String[] args) {
        String name = "John";
        String admin = name;
        System.out.println(admin);
    }

    public static void substract(int a , int  b) {
        int result = a - b;
        System.out.println(result);
    }

    public int biggest(int a, int b, int c) {
        int nums[] = {a, b, c};
        return nums[nums.length - 1];
    }

    public String even(int a) {
        String result = "Number is ";
        if (a % 2 == 0) {
            result += "even";
        }
        else if (a % 2 != 0) {
            result += "odd";
        }
        return result;
    }
}
