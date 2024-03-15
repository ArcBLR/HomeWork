package HomeWork_1_3;

public class CarBodyType {
    private String bodyType;

    @Override
    public String toString() {
        return bodyType;
    }

    public CarBodyType(String bt) {
        bodyType = bt;
        System.out.printf("Тип кузова автомобиля - %s\n", this);

    }


}
