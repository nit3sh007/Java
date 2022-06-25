import java.util.Scanner;
public class prime_num{
    public static void main() {
        Scanner x = new Scanner(System.in);
        int start = x.nextInt();
        
        Scanner y = new Scanner(System.in);
        int end = y.nextInt();
        for(int i=start;i<end;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    private static boolean isPrime(int n) {
        if(n <= 1){
            return false;

        }
        for(int i=2;i<Math.sqrt(i);i++){
            if(n%i==0){
                return false;
            }
        }
        return true; 
    }  
}
