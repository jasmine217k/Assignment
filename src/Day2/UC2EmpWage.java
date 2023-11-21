package Day2;

import java.util.Scanner;

public class UC2EmpWage {

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the wage per hour:");
        int amount=sc.nextInt();

        System.out.println("Enter the number of working hours per day:");
        int workingHours=sc.nextInt();

        System.out.println("The total daily wage of the employee is: Rs "+amount*workingHours);


    }
}
