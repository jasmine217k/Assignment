package Day1;

import java.util.Scanner;

public class PrintFactors {

    public static void main(String[] args)
    {
        //Taking the input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input number:");
        int inputNum=sc.nextInt();

        System.out.println("The factors are: ");
        //Loop to print the factors
        for(int i=1;i*i<=inputNum;i++)
        {
            if(inputNum % i==0)
            {
                if(inputNum/i != i)
                System.out.print(i+" "+inputNum/i +" ");
                else
                    System.out.println(i+" ");

            }
        }
    }
}
