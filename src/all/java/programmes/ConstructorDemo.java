package all.java.programmes;

public class ConstructorDemo {
    String name;

    //Constructor
    ConstructorDemo() {
        this.name = "This is my constructor string...";
        System.out.println(name);
    }

    public static void main(String[] args) {

        new ConstructorDemo();
    }
}