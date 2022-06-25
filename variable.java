public class variable {
    
    int data = 50;// a variable which is declered inside of class but outside of body of the method.
    static int  x =10; // a variable which is declered as static is called as static varible .. can't be change . create single copy of staic varibale and share among all the instance of class. 
    
public static void main(String args[]) {
    int x =20;  //A variable declered inside the body of method is called local variable.
    int y = x;

    
    System.out.println(x);

}
}