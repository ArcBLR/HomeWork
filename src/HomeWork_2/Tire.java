package HomeWork_2;

public class Tire {
private Season season;
private int radius;
private String tireBrand;

    public Tire(Season season, int radius, String tireBrand) {
        this.season = season;
        this.radius = radius;
        this.tireBrand = tireBrand;
    }

    @Override
    public String toString() {
        return "\nСезонность шин - "+ season +"\nРадиус шины - " + radius +"\nПроизводитель шишы - "+ tireBrand;
    }
}
