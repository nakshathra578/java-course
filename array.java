
    import java.util.Arrays;
    public class array {
    public static void main(String[] args){
        int[] arr={30,10,45,27,82};
        System.out.println("Array elements:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("\nSorted Array elements:");
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        int x=10;
        double d=x;
        System.out.println("\n\n int:"+x+"-double:"+d);
        double d2=10.19;
        int x2=(int) d2;
        System.out.println("\n double:"+d2+"-int:"+x2);
    }
}
    

