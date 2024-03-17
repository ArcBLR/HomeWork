package HomeWork_2;

public class Drivers implements DriversInfo {
    private String categoryRights;
    private int drivingExperience;

    public Drivers(String categoryRights, int drivingExperience) {
        this.categoryRights = categoryRights;
        this.drivingExperience = drivingExperience;
    }

    public String getCategoryRights() {
        return categoryRights;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public void DriversInfoShow() {
        System.out.println("Категория удостоверения необходимая для управления данным автомобилем - " + this.categoryRights);
        System.out.println("Стаж вождения не менее - " + this.drivingExperience + " лет");
    }
}
