package Homework5;

import java.util.Scanner;

//        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//        Числа могут быть, как целочисленные, так и дробные.
//        Например :
//        ввод : m=10.5, n=10.45
//        вывод: Число 10.45 ближе к 10.
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double m = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double n = scanner.nextDouble();
        int k = 10;
        compare( m, n, k);

    }
    public static void compare(double m, double n, int k){
        if (Math.abs(m-k)<Math.abs(n-k)) System.out.println(m+ " ближе к "+ k +" чем "+n);
        else if (Math.abs(m-k)==Math.abs(n-k)) System.out.println("Оба числа одинаково близко к "+k);
        else System.out.println(n+ " ближе к "+ k +" чем "+m);
    }
}
