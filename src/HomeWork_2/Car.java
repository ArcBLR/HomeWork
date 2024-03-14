package HomeWork_2;

public class Car {
    private Tire tire;
    private Engine engine;
    public Car(Tire tire, Engine engine) {
        this.tire = tire;
        this.engine = engine;
    }
    @Override
    public String toString() {
        return tire +
                "\nПараметры двигателя:" + engine;
    }
}



