package all.java.programmes;

class ParentClass {
    public void myMethod() {
        System.out.println("Overridden method");
    }
}

class Demo extends ABC {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.myMethod();
    }

    public void myMethod() {
        super.myMethod();
        System.out.println("Overriding method");
    }
}