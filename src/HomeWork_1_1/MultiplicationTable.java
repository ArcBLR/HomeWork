package HomeWork_1_1;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("\t      " + "Таблица умножения");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");


            }
            System.out.println();
        }


    }

}