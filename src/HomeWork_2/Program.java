package HomeWork_2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Engine engine = new Engine(1800, "Volvo", "AИ-95");
        Tire tire = new Tire(Season.WINTER, 19, "Michelin");
        CarInfo carInfo = new CarInfo(8, "B");
        OpenLock lock = new OpenLock(1235);
        Rights rights = new Rights("B", 3);

        engine.VehicleInformation();
        tire.VehicleInformation();
        carInfo.VehicleInformation();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите категории имеющегося у Вас водительского удостоверения " +
                "(пример: ABCD.. или \"нет\" если у Вас нет удостоверения - ");

        String category = in.next();
        String str = category;
        System.out.print("Введите Ваш стаж воджения  - ");
        int experience = in.nextInt();
        int rightsExp = experience;
        if (str.contains(rights.getCategoryRights()) & (rightsExp >= rights.getDrivingExperience()) == true) {
            System.out.println("У Вас есть право управление данным автомобилем");
        } else {
            System.out.println("У Вас нет возможности управления данным автомобилем");
            rights.VehicleInformation();
            return;
        }
        System.out.print("Введите PIN код для доступа в автомобиль: ");
        int pin = in.nextInt();
        if (pin == lock.getKey()) {
            System.out.println("Доступ в автомобиль открыт");
        } else {
            System.out.println("У Вас нет доступа в автомобиль");
            return;
        }
    }
}

