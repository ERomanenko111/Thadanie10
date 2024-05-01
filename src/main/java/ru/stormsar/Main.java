package ru.stormsar;

import java.util.stream.LongStream;

import java.util.stream.IntStream;

public class Main {

    public static long getArithmeticProgressionSum(int a, int b) {
        return IntStream.range(a, b) // Создаем поток целых чисел от a до b (исключая b)
                .mapToLong(num -> num)
                .sum(); // Суммируем все числа в потоке
    }

    public static void main(String[] args) {
        // Пример с числами a = 3 и b = 6
        long sum1 = getArithmeticProgressionSum(3, 6);
        System.out.println("Сумма чисел от 3 до 6 (исключая 6): " + sum1); // Вывод: 12

        // Пример с числами a = 10000000 и b = 1000000000
        long sum2 = getArithmeticProgressionSum(10000000, 1000000000);
        System.out.println("Сумма чисел от 10000000 до 1000000000 (исключая 1000000000): " + sum2);
    }
}