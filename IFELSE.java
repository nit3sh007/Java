import java.util.Scanner;

public class IFELSE {

    public static void main (String args[]){
    Scanner s = new Scanner(System.in);
    int age = s.nextInt();

    if(age>18){
        System.out.println("allowed for vote"+ age);

    }else{
        System.out.println("not allowed");
    }

    }

    }
    

