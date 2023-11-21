package Day1;

import java.util.Scanner;

public class HarmonicValue {

    public static void main(String[] args)
    {
        //Taking the input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input number:");
        int inputNum=sc.nextInt();

        if(inputNum==0)
        {
            System.out.println("Enter a valid number:");
            return;
        }

        double harmonicValue=0.0;

        for(int i=1;i<=inputNum;i++)
        {
            harmonicValue += (double)1/i;
        }

        System.out.println("The nth harmonic value is: "+harmonicValue);
    }
}
