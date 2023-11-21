package Day1;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args)
    {
        //Taking the input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input number:");
        int inputNum=sc.nextInt();

        //Logic for checking whether number is odd or even
        if(inputNum%2 == 0)
            System.out.println("The number is even.");
        else
            System.out.println("The number is odd.");
    }
}
