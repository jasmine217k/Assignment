package Day1;

import java.util.Scanner;

public class MaxOfThreeNum {

    public static void main(String[] args)
    {
        //Taking the input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three input numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println("The maximum among the three numbers is: "+Math.max(a,Math.max(b,c)));


    }
}
