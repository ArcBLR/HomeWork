package HomeWork_2;

public class Car {
    private Engine engine;
    private Tire tire;
    private CarInfo carInfo;
    private Lock lock;

    public Car(Engine engine, Tire tire, CarInfo carInfo, Lock lock) {
        this.engine = engine;
        this.tire = tire;
        this.carInfo = carInfo;
        this.lock = lock;
    }

    @Override
    public String toString() {
        return ""+engine+tire+carInfo+lock;
    }
}



