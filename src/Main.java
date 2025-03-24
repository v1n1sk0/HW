public class Main {
    public static void main(String[] args) {
        // Задача 1: Объявление массивов
        // Целочисленный массив, заполненный 1, 2, 3
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        // Массив дробных чисел, заполненный значениями
        double[] doubleArray = {1.57, 7.654, 9.986};

        // Произвольный массив (например, массив строк)
        String[] stringArray = {"apple", "banana", "cherry"};

        // Задача 2: Печать элементов массивов в прямом порядке
        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);

        // Задача 3: Печать элементов массивов в обратном порядке
        printArrayReverse(intArray);
        printArrayReverse(doubleArray);
        printArrayReverse(stringArray);

        // Задача 4: Преобразование нечетных чисел в четные
        makeEven(intArray);
        printArray(intArray); // Печать преобразованного массива
    }

    // Метод для печати массива в прямом порядке
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // Метод для печати массива в обратном порядке
    public static void printArrayReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void printArrayReverse(double[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void printArrayReverse(String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // Метод для преобразования нечетных чисел в четные
    public static void makeEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] += 1; // Преобразуем нечетное число в четное
            }
        }
    }
}