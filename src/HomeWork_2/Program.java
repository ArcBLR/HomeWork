package HomeWork_2;

public class Program {
    public static void main(String[] args) {
        Car car=new Car(new Tire(Season.SUMMER,"R-19","Michlen"),new Engine(1800,"volvo","АИ-95"));
        System.out.println(car);
    }
}
