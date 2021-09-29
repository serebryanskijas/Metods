package com.company;

public class Main {

    public static void main(String[] args) {
        printHello();
        echo("Hello, mf");
        System.out.println(circle(2));
        System.out.println(isOdd(4));
        System.out.println(max(5, 6));
        System.out.println(sum(2, 3));
        System.out.println(sum(2.0, 3.0));
        System.out.println(sum("xt", "rt"));


    }

    public static void printHello() {
        System.out.println("Hello");
    }

    public static void echo(String s) {
        System.out.println(s);
    }

    public static double circle(double r) {
        double squre = Math.PI * r * r;
        return squre;
    }

    //Определить, является ли число нечетным
    public static boolean isOdd(int n) {
        if (n % 2 == 0)
            return false;
        else return true;
    }

    //Определить максимальное из двух чисел
    static int max(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    //Переставить два числа
    static void swop(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    //Перегрузка методов (overloading)
    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static String sum(String a, String b) {
        return a + b;
    }

    static int sum(int... args) {
        int result = 0;
        for (int arr : args) result += arr;
        return result;
    }
}
