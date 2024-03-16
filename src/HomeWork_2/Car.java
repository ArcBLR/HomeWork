package HomeWork_2;

public class Car {
    private Engine engine;
    private Tire tire;
    private CarInfo carInfo;

    public Car(Engine engine, Tire tire, CarInfo carInfo) {
        this.engine = engine;
        this.tire = tire;
        this.carInfo = carInfo;
    }

    @Override
    public String toString() {
        return "" + engine + tire + carInfo;
    }
}



