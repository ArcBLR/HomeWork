package HomeWork_2;

public class Tire {
private Season season;

    public Tire(Season season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "Сезонность шин - " + season;
    }
}
