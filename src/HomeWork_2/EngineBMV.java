package HomeWork_2;

public class EngineBMV extends Engine {

    private String carBrand;
    private int engineCapasity;
    private String enginName;
    private String fuelGrade;


    public EngineBMV(String carBrand, int engineCapasity, String enginName, String fuelGrade) {
        this.carBrand = carBrand;
        this.engineCapasity = engineCapasity;
        this.enginName = enginName;
        this.fuelGrade = fuelGrade;
    }

    public String getFuelGrade() {
        return fuelGrade;
    }

    @Override
    public void EngineInfo() {

        System.out.println("Марка автомобиля - " + carBrand);
        System.out.println("Объём двигателя - " + engineCapasity);
        System.out.println("Марка двигателя - " + enginName);
        System.out.println("Марка бензина - " + fuelGrade);
    }
}