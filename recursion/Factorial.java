package recursion;

public class Factorial {
  
  public static void main(String[] args) {
      int n=5;
      int result=FactN(1,n,1);
      System.out.println(result);
  }
  public static int FactN(int i,int n, int fact){
    fact *=i;
    if(i==n){
      return fact;

    }
    return FactN(i+1,n,fact);
  }
}
