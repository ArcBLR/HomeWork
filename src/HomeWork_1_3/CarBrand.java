package HomeWork_1_3;

public class CarBrand {
    private String brand;

    @Override
    public String toString() {
        return brand;
    }

    public CarBrand(String brand) {
        this.brand = brand;
        System.out.printf("Марка автомобиля - %s\n", this);
    }
}
