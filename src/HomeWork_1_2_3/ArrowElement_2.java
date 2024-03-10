package HomeWork_1_2_3;

public class ArrowElement_2 {
    public static void main(String[] args) {
        String str1="Апельсин";
        String str2="Мандарин";
        String str3="Авокадо";
        String str4=null;
        String str5="Грейпфрут";
        String str6="Лимон";

        String[] array = {str1,str2,str3,str4,str5,str6};

        for (int i =1;i< array.length;i+=2){
            if (array[i]==null){
                break;
            }
            System.out.print(array[i]+", ");
        }
    }
}
