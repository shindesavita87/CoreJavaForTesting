package all.java.programmes;

public class MethodOverloadingDemo {
    void addition(int a, int b){
        System.out.println("Method 1");
        System.out.println(a+b);
    }

    void addition(float a, float b) {
        System.out.println("Method 2");
        System.out.println(a+b);
    }

    void addition(int a, float b) {
        System.out.println("Method 3");
        System.out.println(a+b);
    }

    void addition(float a, int b) {
        System.out.println("Method 4");
        System.out.println(a+b);
    }

    void addition(int a, int b, int c){
        System.out.println("Method 5");
        System.out.println(a+b+c);
    }

    void addition(double a, double b, double c){
        System.out.println("Method 6");
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo overloadingDemo=new MethodOverloadingDemo();
        overloadingDemo.addition(10,20.0f);
        overloadingDemo.addition(10.0f,20.0f,10.0f);
        overloadingDemo.addition(110,22,22);
    }
}
