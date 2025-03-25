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
        int[] weeklyExpenses = {1000, 2000, 1500, 3000, 2500}; // Массив с пятью элементами
        int min = weeklyExpenses[0];
        int max = weeklyExpenses[0];

        for (int expense : weeklyExpenses) {
            if (expense < min) {
                min = expense; // Находим минимальное значение
            }
            if (expense > max) {
                max = expense; // Находим максимальное значение
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей.");

        // Задача 3: Средняя сумма трат за месяц
        int[] monthlyExpenses = {1000, 2000, 1500, 3000, 2500}; // Массив с пятью элементами
        total = 0; // Сбрасываем сумму для новой задачи

        for (int expense : monthlyExpenses) {
            total += expense; // Суммируем все элементы массива
        }

        double average = total / 4.0; // Делим на количество недель (4 недели)
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

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