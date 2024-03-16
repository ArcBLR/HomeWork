package HomeWork_1_3;

public class CarBodyType {
    private String bodyType;

    public CarBodyType(String bodyType) {
        this.bodyType = bodyType;
        System.out.printf("Тип кузова автомобиля - %s\n", this);
    }

    @Override
    public String toString() {
        return bodyType;
    }
}
