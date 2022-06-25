import java.util.Scanner;

public class Nested_IF {
    public static void main(String args[]) {

        System.out.println("enter age");
        Scanner x = new Scanner(System.in);
        int age = x.nextInt();
        System.out.println("weight");
        Scanner y = new Scanner(System.in);
        int weight = x.nextInt();

        if (age>18){
            if(weight>80){
                System.out.println("overweight");
            }
        }else{
            System.out.println("normal");
        }
    }
}
