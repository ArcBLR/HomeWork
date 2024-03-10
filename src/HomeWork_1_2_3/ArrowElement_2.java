package HomeWork_1_2_3;

public class ArrowElement_2 {
    public static void main(String[] args) {

        String[] fruit = new String[6];
        fruit[0] = "Апельсин";
        fruit[1] = "Мандарин";
        fruit[2] = "Авокадо";
        fruit[3] = null;
        fruit[4] = "Грейпфрут";
        fruit[5] = "Лимон";

        for (int i = 1; i < fruit.length; i+=2) {
            if (fruit[i] == null) {
                break;
            }
            System.out.print(fruit[i] + ", ");
        }
    }
}
