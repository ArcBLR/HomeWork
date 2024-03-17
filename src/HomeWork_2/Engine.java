package HomeWork_2;

public class Engine implements CarInfoShow {
    public static Tire engine;
    private int engineCapasity;
    private String enginName;
    private String fuelGrade;

    public Engine(int engineCapasity, String enginName, String fuelGrade) {
        this.engineCapasity = engineCapasity;
        this.enginName = enginName;
        this.fuelGrade = fuelGrade;
    }

    @Override
    public void VehicleInformation() {
        System.out.println("Объём двигателя - " + this.engineCapasity);
        System.out.println("Марка двигателя - " + this.enginName);
        System.out.println("Марка бензина - " + this.fuelGrade);
    }
}