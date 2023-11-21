package Day1;

import java.util.Scanner;

public class VowelAndConsonant {

    public static void main(String[] args)
    {
        //Taking the alphabet as input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input character:");
        char input=sc.next().charAt(0);

        input=Character.toLowerCase(input);

        if(input=='a' || input=='b' || input=='c' || input=='d' ||input=='e' )
            System.out.println("The alphabet is a vowel");
        else
            System.out.println("The alphabet is a consonant");


    }
}
