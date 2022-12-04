public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        byte clientOS = 1;
        if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else
            System.out.println("Установите версию приложения для Android по ссылке");
        System.out.println();

        // Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            if (clientOS == 0)
                System.out.println("Установите облегченную  версию приложения для iOS по ссылке");
            else
                System.out.println("Установите облегченную  версию приложения для Android по ссылке");
        } else {
            if (clientOS == 0)
                System.out.println("Установите версию приложения для iOS по ссылке");
            else
                System.out.println("Установите версию приложения для Android по ссылке");
            System.out.println();
        }

        // Задание 3
        System.out.println("Задание 3");

        int year = 2021;
        if (year % 400 == 0)
            System.out.println("год является високосным");
        else if (year % 4 == 0 && year % 100 != 0)
            System.out.println("год является високосным");
        else
            System.out.println("год не является високосным");
        System.out.println();

        // Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int day;
        if (deliveryDistance < 20) {
            day = 1;
            System.out.println("Потребуется " + day + " день");
        } else {
            day = (deliveryDistance - 20) / 40 + 2;
            System.out.println("Потребуется дней " + day);
        }
        System.out.println();

        // Задание 5
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Месеца не существует");
        }
    }
}