public class Main {
    public static void main(String[] args) {
        // Задача 1: Целые числа от 1 до 10
        System.out.println("Задача 1:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Задача 2: Целые числа от 10 до 1
        System.out.println("\nЗадача 2:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Задача 3: Четные числа от 0 до 17
        System.out.println("\nЗадача 3:");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        // Задача 4: Числа от 10 до -10 от большего к меньшему
        System.out.println("\nЗадача 4:");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // Задача 5: Високосные года с 1904 по 2096
        System.out.println("\nЗадача 5:");
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }

        // Задача 6: Последовательность чисел 7, 14, 21, ..., 98
        System.out.println("\nЗадача 6:");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println(); // Для перевода строки после вывода

        // Задача 7: Последовательность чисел 1, 2, 4, 8, 16, ..., 512
        System.out.println("\nЗадача 7:");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Для перевода строки после вывода

        // Задача 8: Сумма накоплений без процентов (29 000 рублей каждый месяц)
        System.out.println("\nЗадача 8:");
        int monthlySavings = 29000;
        for (int month = 1; month <= 12; month++) {
            int totalSavings = monthlySavings * month;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
        }

        // Задача 9: Сумма накоплений с 12% годовых
        System.out.println("\nЗадача 9:");
        double totalSavingsWithInterest = 0;
        double interestRate = 0.12;
        for (int month = 1; month <= 12; month++) {
            totalSavingsWithInterest += monthlySavings;
            totalSavingsWithInterest += totalSavingsWithInterest * (interestRate / 12);  // Ежемесячный процент
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavingsWithInterest + " рублей");
        }

        // Задача 10: Таблица умножения на 2
        System.out.println("\nЗадача 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
}