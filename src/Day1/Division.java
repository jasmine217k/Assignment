package Day1;

import java.util.Scanner;

public class Division {

    public static void main(String[] args)
    {
        //Taking the input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dividend:");
        int dividend =sc.nextInt();
        System.out.println("Enter the divisor:");
        int divisor=sc.nextInt();

        //Calculating quotient and remainder
        int quotient =dividend/divisor;
        int remainder=dividend%divisor;

        System.out.println("The quotient is "+quotient+" and the remainder is "+remainder);
    }
}
