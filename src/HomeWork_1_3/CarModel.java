package HomeWork_1_3;

public class CarModel {
    private String model;

    @Override
    public String toString() {
        return model;
    }

    public CarModel(String md) {
        model = md;
        System.out.printf("Модель автомобиля - %s\n", this);
    }
}
