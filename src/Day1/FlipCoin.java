package Day1;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FlipCoin {
    static void printPercentage(int heads, int tails, int total)
    {
        double headsPercentage= (100 * heads)/ total;
        double tailsPercentage= (100 * tails)/total;

        System.out.println("The heads percentage is:"+ headsPercentage);
        System.out.println("The tails percentage is:"+ tailsPercentage);

    }
    public static void main(String[] args) {

        //Take input the number of times to flip a coin
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of flips:");
        int num=sc.nextInt();

        double randomNumber;
        int heads=0, tails=0;

        //A loop generating a random number
        for(int i=0;i<num;i++) {
            randomNumber = Math.random();

            if (randomNumber < 0.5)
                tails++;
            else
                heads++;
        }

        printPercentage(heads,tails,num);
        }
    }
