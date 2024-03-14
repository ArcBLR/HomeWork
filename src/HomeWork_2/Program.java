package HomeWork_2;

public class Program {
    public static void main(String[] args) {
        Car car=new Car(new Tire(Season.SUMMER,16,"Michelin"),new Engine(1800,"B4184S2","АИ-95"));
        System.out.println(car);
    }
}
