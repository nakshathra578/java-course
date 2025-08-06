public class TowerOfHanoi {
  public static void TOH(int n,String source,String helper,String destination) {
      if(n==1){
        System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
      }
      TOH(n - 1, source, destination, helper);
       System.out.println("Move disk " + n + " from " + source + " to " + destination);
       TOH(n - 1, helper, source, destination);
    }
    public static void main(String[] args) {
        int n = 3; 
        TOH(n,"A","B","c");
}
}