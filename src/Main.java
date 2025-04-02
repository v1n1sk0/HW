public class Main {
    public static void main(String[] args) {
        // Задача 1: Сумма всех выплат за месяц
        int[] expenses = {1000, 2000, 1500, 3000, 2500}; // Массив с пятью элементами
        int total = 0;

        for (int expense : expenses) {
            total += expense; // Суммируем все элементы массива
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей.");

        // Задача 2: Минимальная и максимальная траты за неделю
        int[] weeklyExpenses = {1200, 1500, 900, 1300, 1100};  // Пример трат за неделю

        int minExpense = weeklyExpenses[0];
        int maxExpense = weeklyExpenses[0];

        for (int expense : weeklyExpenses) {
            if (expense < minExpense) {
                minExpense = expense;
            }
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpense + " рублей.");

        // Задача 3: Средняя сумма трат за месяц
        int[] weeklyExpenses = {1200, 1500, 900, 1300, 1100};  // Пример трат за месяц

        int totalExpense = 0;
        for (int expense : weeklyExpenses) {
            totalExpense += expense;
        }

        double averageExpense = totalExpense / 5.0;  // Средняя сумма трат за месяц

        System.out.println("Средняя сумма трат за месяц составила " + averageExpense + " рублей.");

        // Задача 4: Разворот массива символов
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        // Разворачиваем массив
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }

        // Печатаем результат
        System.out.println(new String(reverseFullName)); // Преобразуем массив символов в строку и выводим
    }
}