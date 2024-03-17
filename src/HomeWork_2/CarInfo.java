package HomeWork_2;

public class CarInfo {
    private int numberSeats;
    private String categoryRights;

    public CarInfo(int numberSeats, String categoryRights) {
        this.numberSeats = numberSeats;
        this.categoryRights = categoryRights;
    }

    @Override
    public String toString() {
        return "\nКодичество мест в автомобиле - " + numberSeats + "\nКатегория прав необходимая для управления данным автомобилем - " + categoryRights;
    }
}
