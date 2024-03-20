package HomeWork_1_2_2;

public class ArrayElement {
    public static void main(String[] args) {
        System.out.println("Выводим каждый второй элемент массива");
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 21};
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");

        }
    }
}
