package all.java.programmes;

import java.util.Scanner;

class ArrayGivenByUser {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println ("how many number you want to put in the array?");
        int num = input.nextInt();
        String[] numbers = new String[num];

        for (int i = 0; i < num; i++) {
            System.out.println ("Enter value for " + i + ":");
            numbers[i] = input.next();
        }

        for (String temp : numbers){
            System.out.print (temp + "\t");
        }
        input.close();
    }
}