package HomeWork_2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Car car = new Car(new Engine(1800, "B4184S2", "АИ-95"), new Tire(Season.SUMMER, 16, "Michelin"), new CarInfo(5, "A"), new Lock(1235));
        System.out.println(car);
        Scanner in = new Scanner(System.in);
        System.out.print("Введите PIN код для доступа в автомобиль: ");
        int pin = in.nextInt();
        if (pin == 1234234134) {
            System.out.println("Доступ в автомобиль открыт");
        } else {
            System.out.println("Доступ в автомобиль закрыт");
        }
        System.out.println("test");

    }
}
