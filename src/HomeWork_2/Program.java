package HomeWork_2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Car car = new Car(new Engine(1800, "B4184S2", "АИ-95"),
                new Tire(Season.SUMMER, 16, "Michelin"),
                new CarInfo(5, "A"));
        OpenLock lock = new OpenLock();
        lock.setKey(1235);
        System.out.println(car);
        Scanner in = new Scanner(System.in);
        System.out.print("Введите PIN код для доступа в автомобиль: ");
        int pin = in.nextInt();
        if (pin == lock.getKey()) {
            System.out.println("Доступ в автомобиль открыт");
        } else {
            System.out.println("У Вас нет доступа в автомобиль");
        }
    }
}
