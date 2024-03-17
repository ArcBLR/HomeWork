package HomeWork_2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Engine engine = new Engine("Volvo", 1800, "B4184S2", "AИ-95");
        Tire tire = new Tire(Season.WINTER, 19, "Michelin");
        CarInfo carInfo = new CarInfo(5, 60);
        OpenLock lock = new OpenLock(1235);
        Drivers rights = new Drivers("B", 2);

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
            System.out.println("У Вас есть право управления данным автомобилем!");
        } else {
            System.out.println("У Вас нет возможности управления данным автомобилем!");
            rights.DriversInfoShow();
            return;
        }

        System.out.print("Введите ключ для доступа в автомобиль: ");
        int pin = in.nextInt();
        if (pin == lock.getKey()) {
            System.out.println("Доступ в автомобиль открыт.");
        } else {
            System.out.println("Ключ не подходит, у Вас нет доступа в автомобиль!");
            return;
        }

        System.out.print("Введите количество пассажиров для посадки в автомобиль - ");
        int pc = in.nextInt();
        if (pc < carInfo.getNumberSeats()) {
            System.out.println("Можно ехать, но в баке нет бензина.");
        } else {
            System.out.println("Количество пасажиров превышает количество мест в автомобиле!");
            return;
        }

        System.out.println("Залейте в бак бензин марки - " + engine.getFuelGrade());
        System.out.printf("В бак вмещается %d л.\n", carInfo.getRefillingCar());
        System.out.print("Сколько залить топлива? - ");

        int zf = in.nextInt();
        if (zf < carInfo.getRefillingCar()) {
            System.out.printf("Сейчас в баке %d литров топлива", zf);
        } else {
            System.out.println("Такое количество топлива залить невозможно");
            return;
        }

        System.out.println("\nСЧАСТЛИВОГО ПУТИ!!!");
    }
}
