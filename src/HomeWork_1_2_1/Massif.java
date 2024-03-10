package HomeWork_1_2_1;

public class Massif {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 2, 5, 6, 0, 8, 9};
        System.out.println("Перебор массива циклом for");
        for (int i = 0; i < array.length; i++){
        System.out.print(array[i]);

        }
        System.out.println("");
        System.out.println("Перебор массива циклом foreach");
        for (int i:array){
            System.out.print(i);
        }
        System.out.println("");
        System.out.println("Перебор многоуровневого массива циклом for");
        int[][] array2 = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int i = 0; i < array2.length; i++){
            for(int j=0; j < array2[i].length; j++){

                System.out.printf("%d ", array2[i][j]);
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Перебор массива циклом do...while");
        int k=0;
        do {
            System.out.print(array[k]);
            k++;
        }
        while (k < array.length);
        System.out.println("");
        System.out.println("Перебор массива циклом while");
        int j= 0;
        while (j< array.length){
            System.out.print(array[j]);
            j++;

        }


    }
}

