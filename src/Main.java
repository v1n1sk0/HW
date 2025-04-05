import java.time.LocalDate;

public class Main {

    // 1番目のタスク: Проверка високосного года
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    //
    //2番目のタスク: Вывод информации о версии приложения
    public static void checkAppVersion(int osType, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientDeviceYear < 2015) {  // Устаревшие устройства
            if (osType == 0) {  // iOS
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (osType == 1) {  // Android
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {  // Устройства, выпущенные в 2015 году и позже
            if (osType == 0) {  // iOS
                System.out.println("Установите приложение для iOS по ссылке");
            } else if (osType == 1) {  // Android
                System.out.println("Установите приложение для Android по ссылке");
            }
        }
    }

    //
    //
    //3番目のタスク: Расчет дней доставки банковской карты
    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;  // 1 день
        } else if (deliveryDistance <= 60) {
            return 2;  // 2 дня
        } else if (deliveryDistance <= 100) {
            return 3;  // 3 дня
        } else {
            return -1;  // Доставка невозможна
        }
    }

    public static void main(String[] args) {

        // 1番目のタスク: Проверка високосного года
        int year = 2024;  // Пример года
        checkLeapYear(year);  // Вызов метода для проверки

        // 2番目のタスク: Проверка версии приложения
        int osType = 1;  // 0 — iOS, 1 — Android
        int clientDeviceYear = 2014;  // Год выпуска устройства
        checkAppVersion(osType, clientDeviceYear);  // Вызов метода

        // 3番目のタスク: Расчет дней доставки
        int deliveryDistance = 95;  // Расстояние до клиента
        int days = calculateDeliveryDays(deliveryDistance);  // Вызов метода для расчета дней

        if (days == -1) {
            System.out.println("Доставка невозможна");
        } else {
            System.out.println("Потребуется дней: " + days);
        }
    }
}