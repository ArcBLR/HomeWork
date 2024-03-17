package HomeWork_2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Engine engine = new Engine(1800, "Volvo", "AИ-95");
        Tire tire = new Tire(Season.WINTER, 19, "Michelin");
        CarInfo carInfo = new CarInfo(5, "A");
        engine.VehicleInformation();
        tire.VehicleInformation();
        carInfo.VehicleInformation();
        OpenLock lock = new OpenLock(1235);
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
