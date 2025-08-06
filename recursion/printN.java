package recursion;

public class printN {
  public static void main(String[] args) {
      int n=5;
      Ascending(1,n);
      Descending(n);
  }
  public static void Ascending(int i,int n){
    System.out.print(i+" ");
    if(i==n) return;
    Ascending(i+1,n);
  }
 public static void Descending(int n){
  System.out.print(n+" ");
    if(n==1) return;
    Descending(n-1);
 }
}
