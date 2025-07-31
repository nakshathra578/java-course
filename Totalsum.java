public class Totalsum {
  public static long findSum(long N,long M) {
    long sum=0;
    for(long i=N;i<=M;i++){
      if(i%3!=0 && i%5!=0){
        sum+=i;
      }
    }
      return sum;
  }
  public static void main(String[] args) {
     
     
      long N=1;
      long M=8;
      long result=findSum(N,M);
      System.out.println(result);
     }
     
  }

