package all.java.programmes;


class SuperKeywordDemo
{
    int parentClassVar = 1000;

    SuperKeywordDemo()
    {
        System.out.println("Parent class constructor...");
    }

    void commonInBothParentAndChild()
    {
        System.out.println("Message from common function of Parent class");
    }
}


class Subclass extends SuperKeywordDemo
{
    int num = 110;

    Subclass()
    {
        System.out.println("Child class constructor..");
    }

    void printNumber(){
        System.out.println(super.parentClassVar);
    }

    void commonInBothParentAndChild()
    {
        System.out.println("Message from common function of Child class");
    }

    void callParentClassMethodUsingSuper()
    {
        // Need to user super keywrord only when parent and child class has method with same name
        super.commonInBothParentAndChild();
        commonInBothParentAndChild();
    }

    public static void main(String args[]){
        Subclass obj= new Subclass();
        obj.printNumber();
        obj.callParentClassMethodUsingSuper();
    }
}

