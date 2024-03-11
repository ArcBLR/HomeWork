package HomeWork_1_3;

public class CarColor {
    private String color;

    @Override
    public String toString() {
        return color;
    }

    public CarColor(String col) {
        color = col;
        System.out.printf("Цвет кузова автомобиля - %s\n", this);
    }

}
