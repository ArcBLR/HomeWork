package HomeWork_2;

public class CarInfo {
    private int namberSeats;
    private String categoryRights;

    public CarInfo(int namberSeats, String categoryRights) {
        this.namberSeats = namberSeats;
        this.categoryRights = categoryRights;
    }

    @Override
    public String toString() {
        return "\nКодичество мест в автомобиле - " + namberSeats + "\nКатегория прав необходимая для управления данным автомобилем - " + categoryRights;
    }
}
