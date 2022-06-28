import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        System.out.println("enter a nmber");
        Scanner number = new Scanner(System.in);
        int x = number.nextInt();

        int temp =x;
        int sum=0;
        
        while(x>0){
            
            int r=x%10;
            sum= sum+(r*r*r);
            x=x/10;
        }
        if(temp==sum){
            System.out.println("armstrong");
        } 
        else{
            System.out.println("not");
          
        }

    }
}