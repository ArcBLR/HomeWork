package Draf;

public class Dog extends Animal {
    private int ege;
    private String name;

    public Dog(int ege, String name) {
        this.ege = ege;
        this.name = name;
    }
    @Override
    public void info() {
        System.out.println("возраст " + ege);
        System.out.println("кличка " + name);
    }
}
