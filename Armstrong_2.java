public class Armstrong_2 {
    public static void main(String args[]){
        int i=1,a,arm,n,temp;
        System.out.println("Armstrong numbers between 1 to 500 are");
        while(i<500)
        {
        n=i;
        arm=0;
        while(n>0)
        {
            a=n%10;
            arm=arm+(a*a*a);
            n=n/10;
        }
        if(arm==i)
            System.out.println(i);
        i++;
        }
        }
    }

/*
 
import java.util.Scanner;
 
// Java Program to print all Armstrong numbers between 1 to N

public class ArmstrongSeries {
    public static void main(String[] args) {
        double N;
        int i;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        N = scanner.nextFloat();
        System.out.println("Armstrong Number between 0 to " + (int) N);
        
        //  Check for every number between 0 to N, whether it is Armstrong number or not

        for (i = 0; i < N; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i + " ");
            }
        }
    }
 
   
  //    This method return true if num is armstrong number otherwise returns false
     
    public static boolean isArmstrongNumber(int num) {
        int sum = 0, rightDigit, temp;
        temp = num;
        while (temp != 0) {
            rightDigit = temp % 10;
            sum = sum + (rightDigit * rightDigit * rightDigit);
            temp = temp / 10;
        }
       
       //    Check if sum is equal to N, then N is a armstrong number otherwise not an armstrong number
         
        if (sum == num) {
            // N is armstrong number
            return true;
        } else {
            // N is not an armstrong number
            return false;
        }
    }
}


  
 */
    
