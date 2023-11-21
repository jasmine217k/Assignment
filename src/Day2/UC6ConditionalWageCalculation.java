package Day2;

import java.util.Scanner;

public class UC6ConditionalWageCalculation {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the wage per hour:");
        int amount=sc.nextInt();

        System.out.println("Enter the number of full-time working hours per day:");
        int workingHours=sc.nextInt();

        System.out.println("Enter the number of part-time working hours per day:");
        int partTimeHours=sc.nextInt();

        System.out.println("Enter the number of working days per month:");
        int days=sc.nextInt();

        int totalWorkingHours=(workingHours+partTimeHours)*days;

        if(totalWorkingHours>100)
            totalWorkingHours=100;


        int monthlyWage=(amount*totalWorkingHours);

        System.out.println("The total monthly wage of the employee is: Rs "+ monthlyWage);



    }
}
