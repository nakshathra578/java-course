package recursion;
 
public class Power {
  public static int power(int x, int n) {
      if (n == 0) {
          return 1;
      }
      return x * power(x, n - 1);
  }

  public static void main(String[] args) {
      int x = 4;
      int n = 6;
      int result = power(x, n);
      System.out.println(x + "^" + n + " = " + result);
  }
}
