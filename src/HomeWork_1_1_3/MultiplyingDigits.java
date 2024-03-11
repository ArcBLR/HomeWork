package HomeWork_1_1_3;

import java.util.Scanner;

public class MultiplyingDigits {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = number.nextInt();
        int num1 = num;
//        int numDigits = Integer.toString(num).length(); //вводимое число преобразуется в строку и считаются символы
//        int numDigits = String.valueOf(num).length();   //аналог Integer.toString
        int numDigits = (int) Math.log10(num) + 1;  /* берется Log по основанию 10, он возвращает колличество цифр
//                                                       в числе -1 и по этому добавляем +1
//                                                       меньше потребление ресурсов компа.*/
        System.out.println("Кол-во цифр в числе: " + numDigits);
        int m = 1;
        for (int i = 0; i < numDigits; i++) {
            m *= num % 10;
            System.out.print("Берем последнюю цифру числа " + num);
            System.out.println(" и умножаем на предыдущий результат получаем: " + m);
            num /= 10;
            System.out.println("Оставшиеся цифры: " + num);

        }
        System.out.println("Произведение цифр числа " + num1 + " равно: " + m);

    }
}