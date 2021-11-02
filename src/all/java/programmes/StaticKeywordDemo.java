package all.java.programmes;

public class StaticKeywordDemo {
    static int staticVar1=20;
    static String staticVar2="Savita";

    // static method
    static void staticMethod()
    {
        System.out.println("Form static method...");
    }

    static{
        System.out.println("Printing static var: "+staticVar1 + " "+staticVar2);
    }


    void nonStaticMethod()
    {
        //Static method called in non-static method
        staticMethod();
        System.out.println("Printing from non-static var: "+staticVar1 + " "+staticVar2);
    }

    public static void main(String[] args)
    {
        StaticKeywordDemo obj=new StaticKeywordDemo();
        obj.nonStaticMethod();

        //calling this static method without creating any object.
        staticMethod();
        System.out.println("Printing static var from static without creating object: "+staticVar1+" "+staticVar2);
    }
}
