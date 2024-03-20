package HomeWork_2;

public class Car implements Movebl{
    private EngineVolvo engineVolvo;
    private CarInfo carInfo;
    private Tire tire;
    private OpenLock lock;


    public Car(EngineVolvo engine, CarInfo carInfo, Tire tire, OpenLock lock) {
        this.engineVolvo = engine;
        this.carInfo = carInfo;
        this.tire = tire;
        this.lock = lock;
    }

    @Override
    public void Move() {
        System.out.println("Автомобиль едет");
    }
}
