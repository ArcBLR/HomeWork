package HomeWork_1_1_2;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        long result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.println("Результат произведения всех чисел от 1 до " + num + ": " + result);
    }
}
