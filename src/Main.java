public class Main {
    public static void main(String[] args) {
        // Задача 1: Хранение Ф. И. О. сотрудника и вывод
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        // Задача 2: Преобразование Ф. И. О. в верхний регистр
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperFullName);

        // Задача 3: Заменить символ "ё" на "е"
        String fullNameWithYo = "Иванов Семён Семёнович";
        String correctedFullName = fullNameWithYo.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + correctedFullName);
    }
}