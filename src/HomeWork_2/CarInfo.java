package HomeWork_2;

public class CarInfo implements CarInfoShow {
    private int numberSeats;
    private String categoryRights;

    public CarInfo(int numberSeats, String categoryRights) {
        this.numberSeats = numberSeats;
        this.categoryRights = categoryRights;
    }

    @Override
    public void VehicleInformation() {
        System.out.println("Кодичество мест в автомобиле - " + this.numberSeats);
        System.out.println("Категория прав необходимая для управления данным автомобилем - " + this.categoryRights);
    }
}
