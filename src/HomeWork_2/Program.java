package HomeWork_2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        EngineVolvo engineVolvo = new EngineVolvo("Volvo", 1800, "B4184S2", "AИ-95");
        EngineBMV engineBMV = new EngineBMV("BMV", 1600, "M43B16", "АИ-92");
        Tire tire = new Tire(Season.WINTER, 19, "Michelin");
        CarInfo carInfo = new CarInfo(5, 60);
        OpenLock lock = new OpenLock(1235);
        Drivers rights = new Drivers("B", 2);
        Car volvoCar = new Car(engineVolvo, carInfo, tire, lock);

        Scanner in = new Scanner(System.in);
        System.out.print("Выберите автомобиль для поездки (пример: BMV, Volvo)");
        String avto = in.next();
        String str1 = avto;

        switch (str1) {
            case "BMV":
                engineBMV.engineInfo();
                break;
            case "Volvo":
                engineVolvo.engineInfo();
                break;
            default:
                System.out.println("Такой автомобиль отсутствует!");
                break;
        }

        tire.VehicleInformation();
        carInfo.VehicleInformation();

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

        System.out.println("Залейте в бак бензин марки - " + engineVolvo.getFuelGrade());
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
        volvoCar.Move();
    }
}
