package HomeWork_2;

public class Rights implements CarInfoShow {
    private String categoryRights;
    private int drivingExperience;

    public Rights(String categoryRights, int drivingExperience) {
        this.categoryRights = categoryRights;
        this.drivingExperience = drivingExperience;
    }

    public String getCategoryRights() {
        return categoryRights;
    }

    public void setCategoryRights(String categoryRights) {
        this.categoryRights = categoryRights;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public void VehicleInformation() {
        System.out.println("Категория удостоверения необходимая для управления данным автомобилем - " + this.categoryRights);
        System.out.println("Стаж вождения не менее - " + this.drivingExperience + " лет");
    }
}
