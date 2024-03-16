package HomeWork_2;

public class CarInfo /*implements CarInfoShow*/{
    private int namberSeats;
    private String categoryRights;

    public CarInfo(int namberSeats, String categoryRights) {
        this.namberSeats = namberSeats;
        this.categoryRights = categoryRights;
    }

    /*@Override
    public String CarInfo() {
        return "\nКоличество мест в автомобиле - " + namberSeats + "\nКатегория прав необходимая для управления данным автомобилем - " + categoryRights;
    }*/
    @Override
    public String toString() {
        return "\nКоличество мест в автомобиле - " + namberSeats + "\nКатегория прав необходимая для управления данным автомобилем - " + categoryRights;
     }
}
