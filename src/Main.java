import java.time.LocalDate;

public class Main {


    public static void leapYear(int year) {
        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            }
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void applicationVersion(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear < 2015) {
            switch (clientOS) {
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                default:
                    System.out.println("Неверный тип ОС");
            }
        } else {
            switch (clientOS) {
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                default:
                    System.out.println("Неверный тип ОС");
            }
        }
    }

    public static void deliveryTime(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }


    public static void main(String[] args) {
        int year = 1000;
        //task 1
        leapYear(year);

        //task 2
        int currentYear = LocalDate.now().getYear();
        int clientOS = 0;
        applicationVersion(clientOS, currentYear);


        //task 3
        int deliveryDistance = 65;
        deliveryTime(deliveryDistance);


    }
}