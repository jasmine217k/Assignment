package Day1;

import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[]args)
    {
        //Taking the input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input number:");
        int inputNum=sc.nextInt();

        //Only works if 0 <= N < 31 since 2^31 overflows an int
        if(inputNum <0 || inputNum>=31)
        {
            System.out.println("Enter number between 0(including) to 31(excluding) ");
            return;
        }

        //Printing the output

        for(int i=1;i<=inputNum;i++)
        {
            System.out.println("2 raised to the power "+i+" is "+Math.pow(2,i));
        }


    }
}
