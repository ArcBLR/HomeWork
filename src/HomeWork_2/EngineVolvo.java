package HomeWork_2;

public class EngineVolvo implements CarInfoShow {

    private String carBrand;
    private int engineCapasity;
    private String enginName;
    private String fuelGrade;


    public EngineVolvo(String carBrand, int engineCapasity, String enginName, String fuelGrade) {
        this.carBrand = carBrand;
        this.engineCapasity = engineCapasity;
        this.enginName = enginName;
        this.fuelGrade = fuelGrade;
    }

    public String getFuelGrade() {
        return fuelGrade;
    }

    @Override
    public void VehicleInformation() {
        System.out.println("Марка автомобиля - " + this.carBrand);
        System.out.println("Объём двигателя - " + this.engineCapasity);
        System.out.println("Марка двигателя - " + this.enginName);
        System.out.println("Марка бензина - " + this.fuelGrade);
    }
}