package HomeWork_1_1_2;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        long result = 1; //если взять тип int то можно перемножить максимум до 31, если Long до 63
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.println("Результат перемножения всех чисел от 1 до " + num + ": " + result);
    }
}
