import java.util.*;
public class TwoSumDistinctPair {
  public static void main(String[] args) {
      int[] arr={2,4,3,5,7,8,-1,6};
      int target = 7;
      Set<Integer> seen = new HashSet<>();
      Set<String> output=new HashSet<>();
      for(int num : arr){
        int complement=target-num;
        if(seen.contains(complement)){
          int a= Math.min(num,complement);
          int b= Math.max(num,complement);
          output.add("(" + a + ", " + b + ")");
          
        }
        seen.add(num);
      }
      System.out.println("Pairs with sum " + target + " : " + output);
  }
  
}
