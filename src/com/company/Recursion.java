package com.company;

public class Recursion {
    static int n = 5;

    public static void main(String[] args) {
        recurse();
    }

    static void recurse() {
        if (n == 0) return;
        n--;
        recurse();
        System.out.println(n);
    }

  /*  static int recurse(int n) {
        if (n == 0) return;
        System.out.println(n);
        recurse(n - 1);
    }*/


    //Сложить числа от 1 до 5 (используя поле)

}
