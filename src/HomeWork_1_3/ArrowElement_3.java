package HomeWork_1_3;

public class ArrowElement_3 {
    public static void main(String[] args) {
        String[] array = {"Volvo", "S80", "SW", "Red"};
        for (int i = 0; i < array.length; ) {

            CarBrand br = new CarBrand(array[i++]);
            CarModel md = new CarModel(array[i++]);
            CarBodyType bt = new CarBodyType(array[i++]);
            CarColor col = new CarColor(array[i++]);



        }

    }
}
class CarBodyType {
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
class CarBrand {
    private String brand;

    public CarBrand(String br) {
        brand = br;

        System.out.printf("Марка автомобиля - %s\n", this);

    }

    @Override
    public String toString() {
        return brand;
    }

}
class CarColor {
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
class CarModel {
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
