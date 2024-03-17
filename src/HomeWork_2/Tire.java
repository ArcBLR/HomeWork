package HomeWork_2;

public class Tire implements CarInfoShow {
    private Season season;
    private int radius;
    private String tireBrand;

    public Tire(Season season, int radius, String tireBrand) {
        this.season = season;
        this.radius = radius;
        this.tireBrand = tireBrand;
    }

    @Override
    public void VehicleInformation() {
        System.out.println("Сезонность шин - " + this.season);
        System.out.println("Радиус шины - " + this.radius);
        System.out.println("Производитель шишы - " + this.tireBrand);
    }
}
