import java.util.Scanner;

public class ODDEVEN {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        int even = x.nextInt();
        
        if (even%2==0){

            System.out.println("even");
        }else{
            System.out.println("odd");
        }

    }
}
