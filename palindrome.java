import java.util.Scanner;
import java.io.*;

public class palindrome {
    public static void main(String args[]){

        System.out.println("enter a nmber");
        Scanner x = new Scanner(System.in);
        int number = x.nextInt();
        //converting string to int
        String pali = String.valueOf(number); 
         // reversing the input string
        String str = new StringBuilder(pali).reverse().toString();
        //Checking for Palindrome
        if (str.equals(pali)) 
        {
            System.out.println(pali + " is Palindrome");
        }
        else
        {
            System.out.println(pali+ " is not Palindrome");
        }

     
    }
}
