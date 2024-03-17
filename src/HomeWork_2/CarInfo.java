package HomeWork_2;

public class CarInfo implements CarInfoShow {
    private int numberSeats;


    public CarInfo(int numberSeats, String categoryRights) {
        this.numberSeats = numberSeats;
    }


    @Override
    public void VehicleInformation() {
        System.out.println("Количество мест в автомобиле - " + this.numberSeats);
    }
}
