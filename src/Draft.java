public class Draft {
    public static void main(String[] args) {

        Person tom = new Person("Tom");
        System.out.println(tom.toString()); // Person Tom
    }
}
class Person {

    private String name;

    public Person(String name){

        this.name=name;
    }

    @Override
    public String toString(){

        return "Person " + name;
    }
}
