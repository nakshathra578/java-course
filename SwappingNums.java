public class SwappingNums {
public static void main(String[] args) {
    int a=10,b=5;
    System.out.println("Before swapping \na : " + a + ", b : " + b);
    a = a^b;
    b = a^b;
    a = a^b;
    System.out.println("After swapping \na : " + a + ", b : " + b);
    //diff symbols
    int c=12,d=10;
    System.out.println("Before swapping \nc : " + c + ", d : " + d);
    c = c+d;
    d = c-d;
    c = c-d;
    System.out.println("After swapping \nc : " + c + ", d : " + d);
}
}
