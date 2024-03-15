package HomeWork_2;

public class Engine {
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
    public String toString() {
        return "\nОбъём двигателя - " + engineCapasity + " mm3" + "\nМарка двигателя - " + enginName + "\nМарка бензина - " + fuelGrade;
    }
}
