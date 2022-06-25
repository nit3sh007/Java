public class Operators {
    public static void main(String args[]){
        int x = 20;
        int y = 10;
        int a = 10;
        int b = 5;
        int min =(x<y)?x:y;  //ternary operator is one liner replacement of if- the nelse statemant
        int minn= (a<b)?a:b;
        System.out.println(x++); //10 (11)
        System.out.println(++x);//12
        System.out.println(x--);//12(11)
        System.out.println(--x);//10 */
        System.out.println(x++ + ++x + " number");
        System.out.println(x-- + --x + " number") ;
        System.out.println(10<<2); //  10*2^2= 40   
        System.out.println(10<<3); //10*2^3 =80
        System.out.println(4<<4); //4*2^4 =64
        System.out.println(10>>2);//10/2^2=10/4 =2
        System.out.println(20>>3); //10/2^3=20/8=2
        System.out.println(min);
        System.out.println(minn);






    }


}
