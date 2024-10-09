public class Main {
    public static void main(String[] args) {

        System.out.println("--------------Задание №1-----------------");
        byte clientOs = 0;
        System.out.println("При clientOs= " + clientOs);
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для ANDROID по ссылке");
        }
        clientOs = 1;
        System.out.println("При clientOs= " + clientOs);
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для ANDROID по ссылке");
        }

        System.out.println("\n--------------Задание №2-----------------");
        long clientDeviceYear = 2010;
        clientOs = 0;
        System.out.println("clientOs = " + clientOs + "; clientDeviceYears =" + clientDeviceYear);
        if (clientDeviceYear >= 2015) {
            if (clientOs == 0) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для ANDROID по ссылке");
            }
        } else if (clientOs == 0) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для ANDROID по ссылке");
            }
        clientDeviceYear = 2020;
        clientOs = 0;
        System.out.println("\nclientOs = " + clientOs + "; clientDeviceYears =" + clientDeviceYear);
        if (clientDeviceYear >= 2015) {
            if (clientOs == 0) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для ANDROID по ссылке");
            }
        } else if (clientOs == 0) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
            System.out.println("Установите облегченную версию приложения для ANDROID по ссылке");
        }
        clientDeviceYear = 2014;
        clientOs = 1;
        System.out.println("\nclientOs = " + clientOs + "; clientDeviceYears =" + clientDeviceYear);
        if (clientDeviceYear >= 2015) {
            if (clientOs == 0) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для ANDROID по ссылке");
            }
        } else if (clientOs == 0) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для ANDROID по ссылке");
            }
        clientDeviceYear = 2022;
        clientOs = 1;
        System.out.println("\nclientOs = " + clientOs + "; clientDeviceYears =" + clientDeviceYear);
        if (clientDeviceYear >= 2015) {
            if (clientOs == 0) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для ANDROID по ссылке");
            }
        } else if (clientOs == 0) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для ANDROID по ссылке");
            }

        System.out.println("\n--------------Задание №3-----------------");
        long year = 2021;
        if (year < 1584) {
            System.out.println("Ошибка ввода года, повторите ввод!!!");
        } else if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("\n--------------Задание №4-----------------");
        long deliveryDistance = 95;
        System.out.println("Если расстояние равно " + deliveryDistance + " км.");
        byte deliveryDays = 0;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
            System.out.println("потребуется дней на доставку: " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 2;
            System.out.println("Потребуется дней на доставку: " + deliveryDays);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
            System.out.println("Потребуется дней на достаку: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }

        System.out.println("\n--------------Задание №5-----------------");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " месяц принадлежит сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлежит сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит сезону лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит сезону осень");
                break;
            default:
                System.out.println("такого месяца нет повторите ввод!!!");
        }
    }
}