package HomeWork_1_3;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int num1 = num;
//        int numDigits = String.valueOf(num).length();
        int numDigits = (int)Math.log10(num) + 1;  // меньше потребление ресурсов
        int m = 1;
        for (int i = 0; i < numDigits; i++) {
            m *= num % 10;
            num /= 10;
        }
        System.out.println("Произведение цифр числа " + num1 + " равно: " + m);

    }
}