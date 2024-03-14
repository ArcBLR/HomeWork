package HomeWork_2;

public class Tire {
private Season season;
private String radius;
private String tireBrand;
    public Tire(Season season, String radius, String tireBrand) {
        this.season = season;
        this.radius = radius;
        this.tireBrand = tireBrand;
    }
    @Override
    public String toString() {
        return "\nСезонность шин - "+ season +"\nРадиус шины - " + radius +"\nПроизводитель шишы - "+ tireBrand;
    }
}
