package all.java.programmes;

class ParentClass {
    String parentClassVar1="Parent class variable..";
    String parentClassVar2="Parent class variable Number 2..";

    public void parentClassFunction()
    {
        System.out.println("This is from parent class..");
    }
}

public class InheritanceDemo extends ParentClass{
    String childClassVar = "Child class variable..";
    public static void main(String args[]){
        //Creating object of child calss and trying to access variable and function of parent class
        InheritanceDemo obj = new InheritanceDemo();
        System.out.println(obj.parentClassVar1);
        System.out.println(obj.parentClassVar2);
        System.out.println(obj.childClassVar);
        obj.parentClassFunction();
    }
}