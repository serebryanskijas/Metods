package com.company;

import java.util.Arrays;
import java.util.Random;

public class NewMetod {
    public static void main(String[] args) {
        System.out.println(isPrime(29));
        System.out.println(Arrays.toString(calcFactors(1128)));
        System.out.println(reversNumber(987654321));
        Object[] a = genArray(10);
        removeStrings(a);
        System.out.println(Arrays.toString(a));

        //Disarium number
        //isDisarium(135) ➞= true:  1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135

    }
    //Проверить, является ли число простым
    static boolean isPrime(int number){
        boolean flad = true;
        for (int i = 2; i < number/2; i++)
            if (number % i == 0) flad = false;
            return flad;
    }
    //Определить все множители числа
    static int[] calcFactors (int number){
        int[] result;
        int count = 0;
        for (int i = 2; i<= number; i++)
            if (number%i ==0) count++;
            result= new  int[count];
            count=0;
        for (int i = 2; i<= number; i++)
            if (number%i ==0) result[count++]=i;
            return result;
    }

    //Обратить число, записанное в десятичной системе счисления
    static int reversNumber(int number) {
        String s = Integer.toString(number);
        StringBuilder sb = new StringBuilder(s);
        String s2 = sb.reverse().toString();
        int number2 = Integer.parseInt(s2);
        return number2;
    }
//В массиве содержатся строки и целые числа. Вернуть массив, из которого удалены все строки
    static Object[] genArray(int count){

        Object[] a = new Object[count];
        for (int i =0; i< count; i++){
            Random random = new Random();
            boolean choise = random.nextBoolean();
            if (choise) a[i] = random.nextInt(101);
            else {
                StringBuilder sb = new StringBuilder();
                int countL = random.nextInt(5)+1;
                for (int j=0; j<countL;j++) {
                    char c = (char) (random.nextInt(26) + 97);
                    sb.append(c);
                }
                a[i] = sb.toString();
            }
        }

        //System.out.println(Arrays.toString(a));

        return a;

    }
    static void removeStrings(Object[] a){
        for (int i =0; i<a.length; i++){
            if (a[i].getClass().equals(String.class))
                a[i] = 0;
        }
    }
}
