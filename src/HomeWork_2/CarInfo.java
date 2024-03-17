package HomeWork_2;

public class CarInfo implements CarInfoShow {
    private int numberSeats;
    private int refillingCar;

    public CarInfo(int numberSeats, int refillingCar) {
        this.numberSeats = numberSeats;
        this.refillingCar = refillingCar;
    }

    @Override
    public void VehicleInformation() {
        System.out.println("Количество мест в автомобиле - " + this.numberSeats);
        System.out.println("Количество топлива вмещающегося в бак - " + this.refillingCar);
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public int getRefillingCar() {
        return refillingCar;
    }
}

