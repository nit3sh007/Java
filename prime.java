import java.util.Scanner;

public class prime {

    public static void main(String args[]){

        Scanner s= new Scanner(System.in);
        System.out.println("enter a number");
        int x= s.nextInt();
        if (isPrime(x)) {  
            System.out.println(x + " is a prime number");  
        } else {  
            System.out.println(x + " is not a prime number");  
        }  
    }
    private static boolean isPrime(int x) {
        if (x <= 1){
            return false;

        }
        for(int i=2;i< Math.sqrt(x);i++){
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
    
}
