package Day1;

import java.util.Scanner;

public class LeapYear {

    static boolean checkDigit(int number)
    {
        int numberOfDigits=0;

        while(number>0)
        {
            number/=10;
            numberOfDigits++;
        }

        return (numberOfDigits == 4);

    }
    public static void main(String []args)
    {

        System.out.println("Enter the year:");

        //Take the year as input
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();

        //Check if the number is of $ digits or not
        if(!checkDigit(year))
        {
            System.out.println("Invalid input. Enter a four digit number");
            return;
        }

        if(year%400 ==0 || (year%4==0 && year%100!=0))
        {
            System.out.println("It is a leap year");

        }
        else
        {
            System.out.println("It is not a leap year");
        }

     return;


    }
}
