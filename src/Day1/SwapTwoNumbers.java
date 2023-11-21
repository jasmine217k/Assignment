package Day1;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args)
    {
        //Taking the input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        //Logic to swap two numbers
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("The two numbers after swapping are: "+num1+" and "+num2);
    }
}
