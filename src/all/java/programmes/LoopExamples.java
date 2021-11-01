package all.java.programmes;

public class LoopExamples {

    public void forLoop()
    {
        System.out.println("\nFor loop example...");
        for(int i=10; i>3; i--){
            System.out.println("The value of i is now: "+i);
        }
    }

    public void forEachLoop()
    {
        System.out.println("\nFor each loop example...");
        int names[]={1,2,3,4,5};
        for (int ele : names) {
            System.out.println(ele);
        }
        System.out.println("Length of an array: "+names.length);
        System.out.println("Get value of specified position from array: "+names[4]);
    }

    public void whileLoop()
    {
        System.out.println("\nWhile loop example...");
        int i=1;
        while(i<10)
        {

            i++;
            System.out.println(i);
        }
    }

    public void doWhileLoop()
    {
        System.out.println("\nInside do while loop example...");
        int i=1;

        do{

            i++;
            System.out.println(i);
        }while(i<10);
    }


    public static void main(String[] args) {
        LoopExamples obj=new LoopExamples();
      //  obj.forLoop();
        obj.forEachLoop();
//        obj.whileLoop();
//        obj.doWhileLoop();
    }
}
