import java.util.Scanner;

public class Negative {
    public static void main(String args[]) {
        
        System.out.println("enter a nmber");
        Scanner x = new Scanner(System.in);
        int nvg = x.nextInt();
        
        if (nvg>0){
            System.out.println("+ve");

        }else if(nvg<0){
        }else{
            System.out.println("zero");
        }
        


    }
    
}
