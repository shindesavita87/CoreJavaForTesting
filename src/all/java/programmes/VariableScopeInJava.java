package all.java.programmes;

public class VariableScopeInJava {
    public static String myStaticVarAtClasslevel = "This is my static variable created at class level";
    String myInstanceVar = "This is my instance variable";

    public static void main(String[] args) {
        VariableScopeInJava obj1 = new VariableScopeInJava();
        VariableScopeInJava obj2 = new VariableScopeInJava();

        //Static variable example
        System.out.println("Print Static variable value: " + obj1.myStaticVarAtClasslevel);
        System.out.println("Print Static variable value: " + obj2.myStaticVarAtClasslevel);

        obj1.myStaticVarAtClasslevel = "Now changing the value of static vairable using object two";
        System.out.println("After value changed for obj2: " + obj1.myStaticVarAtClasslevel);
        System.out.println("After value changed for obj2: " + obj2.myStaticVarAtClasslevel);


        //Instance variable example
        System.out.println("\n\n\n");
        System.out.println("Print instance variable value: " + obj1.myInstanceVar);
        System.out.println("Print instance variable value: " + obj2.myInstanceVar);

        obj2.myInstanceVar = "Now changing the value of instance vairable using object two";
        System.out.println("After value changed for obj2: " + obj1.myInstanceVar);
        System.out.println("After value changed for obj2: " + obj2.myInstanceVar);

        //Local variable example
        System.out.println("\n\n\n");
        obj2.localVariableExample();
        System.out.println(obj1.myInstanceVar);
    }

    public void localVariableExample() {
        String myInstanceVar = "Savita this is my local variable inside method.";
        System.out.println("Printing from inside method: " + myInstanceVar);
    }
}
