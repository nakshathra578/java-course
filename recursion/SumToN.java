package recursion;
public class SumToN {
    public static void main(String[] args) {
        int n = 5;
        int result = SumtoN(1,n,0);
        System.out.println(result);
    }
    public static int SumtoN(int i, int n, int sum){
        sum+=i;
        if(i==n) return sum;
        return SumtoN(i+1, n, sum);
    }
}