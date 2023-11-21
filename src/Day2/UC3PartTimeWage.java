package Day2;

import java.util.Scanner;

public class UC3PartTimeWage {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the wage per hour:");
        int amount=sc.nextInt();

        System.out.println("Enter the number of full-time working hours per day:");
        int workingHours=sc.nextInt();

        System.out.println("Enter the number of part-time working hours per day:");
        int partTimeHours=sc.nextInt();

        System.out.println("The total daily wage of the employee is: Rs "+ amount*(workingHours+partTimeHours) );

    }
}
