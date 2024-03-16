package HomeWork_1_3;

public class CarColor {
    private String color;

    public CarColor(String color) {
        this.color = color;
        System.out.printf("Цвет кузова автомобиля - %s\n", this);
    }

    @Override
    public String toString() {
        return color;
    }
}
