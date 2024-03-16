package HomeWork_1_3;

public class CarModel {
    private String model;

    public CarModel(String model) {
        this.model = model;
        System.out.printf("Модель автомобиля - %s\n", this);
    }

    @Override
    public String toString() {
        return model;
    }
}
