package all.java.programmes;

public class IfConditionExample {
    int number1=50, number2=100;

    public void singleIfExample()
    {
        if(number1<number2)
        {
            System.out.println(number1+" < "+number2);
        }

        if(number1>number2)
        {
            System.out.println(number1+" > "+number2);
        }
    }

    public void ifElseExample()
    {
        if(number1>number2)
        {
            System.out.println(number1+" > "+number2);
        }
        else
        {
            System.out.println(number1+" < "+number2);
        }
    }

    public void ifElseIfExample()
    {
        if(number1>number2)
        {
            System.out.println(number1+" > "+number2);
        }
        else if(number1==number2)
        {
            System.out.println(number1+" == "+number2);
        }
        else
        {
            System.out.println(number1+" < "+number2);
        }
    }

    public static void main(String[] args) {
        IfConditionExample ifConditionExample=new IfConditionExample();
        ifConditionExample.singleIfExample();
        ifConditionExample.ifElseExample();
        ifConditionExample.ifElseIfExample();
    }
}
