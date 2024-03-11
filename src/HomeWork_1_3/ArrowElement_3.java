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
