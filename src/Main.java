public class Main {
    public static void main(String[] args) {

        // Задача 1: Посчитать сколько месяцев потребуется, чтобы накопить 2 459 000 рублей
        System.out.println("Задача 1:");
        int savingsGoal = 2459000;  // Цель накоплений
        int monthlyDeposit = 15000;  // Ежемесячный вклад
        int currentSavings = 0;  // Текущая сумма накоплений
        int months = 0;  // Счётчик месяцев

        while (currentSavings < savingsGoal) {
            currentSavings += monthlyDeposit;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + currentSavings + " рублей");
        }
        System.out.println("Для накопления " + savingsGoal + " рублей потребуется " + months + " месяцев.");
        System.out.println(); // Переход на новую строку

        // Задача 2: Вывести числа от 1 до 10 с помощью цикла while и от 10 до 1 с помощью цикла for
        System.out.println("Задача 2:");
        // Цикл while
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(); // Переход на новую строку

        // Цикл for
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(); // Переход на новую строку

        // Задача 3: Рассчитать численность населения через 10 лет
        System.out.println("Задача 3:");
        int population = 12000000;  // Начальное население
        double birthRate = 17.0 / 1000;  // Рождаемость
        double deathRate = 8.0 / 1000;  // Смертность

        for (int year = 1; year <= 10; year++) {
            population += population * (birthRate - deathRate);
            System.out.println("Год " + year + ", численность населения составляет " + (int) population);
        }
        System.out.println(); // Переход на новую строку

        // Задача 4: Рассчитать, сколько месяцев Василию нужно копить, чтобы собрать 12 миллионов
        System.out.println("Задача 4:");
        double initialAmount = 15000;  // Начальная сумма
        double targetAmount = 12000000;  // Цель накоплений
        double currentAmount = initialAmount;  // Текущая сумма
        double interestRate = 0.07;  // Процент на месяц

        months = 0;

        while (currentAmount < targetAmount) {
            currentAmount += currentAmount * interestRate;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + currentAmount + " рублей");
        }
        System.out.println("Для достижения цели потребуется " + months + " месяцев.");
        System.out.println(); // Переход на новую строку

        // Задача 5: Выводить накопления каждый шестой месяц
        System.out.println("Задача 5:");
        currentAmount = initialAmount;
        months = 0;

        while (currentAmount < targetAmount) {
            currentAmount += currentAmount * interestRate;
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна " + currentAmount + " рублей");
            }
        }
        System.out.println(); // Переход на новую строку

        // Задача 6: Выводить сумму накоплений каждые полгода на протяжении 9 лет
        System.out.println("Задача 6:");
        currentAmount = initialAmount;
        months = 0;

        for (int year = 1; year <= 9; year++) {
            for (int month = 1; month <= 6; month++) {
                currentAmount += currentAmount * interestRate;
                months++;
            }
            System.out.println("Полгода, год " + year + ", сумма накоплений равна " + currentAmount + " рублей");
        }
        System.out.println(); // Переход на новую строку

        // Задача 7: Написать программу для напоминания о пятницах
        System.out.println("Задача 7:");
        int firstFriday = 3; // Допустим, первая пятница месяца - это 3-й день

        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println(); // Переход на новую строку

        // Задача 8: Программирование вычисления лет, когда пролетает комета
        System.out.println("Задача 8:");
        int startYear = 1825; // 200 лет назад
        int endYear = 2125; // 100 лет вперед

        for (int year = startYear; year <= endYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}