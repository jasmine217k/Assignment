package Day2;

import java.util.Scanner;

public class UC2EmpWage {

    public static void main(String [] args)
    {
        int IS_FULL_TIME=1;
        int EMP_RATE_PER_HOUR=20;
        Scanner sc=new Scanner(System.in);

        int empHours=0;
        int empWage=0;

        double attendance= Math.floor(Math.random()*10) % 2;

        if(attendance==IS_FULL_TIME)
        {
            System.out.println("Employee is present");
            empHours=8;
        }
        else {
            System.out.println("Employee is absent");
            empHours=0;
        }

        empWage=empHours*EMP_RATE_PER_HOUR;

        System.out.println("Employee Wage: "+empWage);


    }
}
