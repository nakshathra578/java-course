import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int n=5;
        int[] arr={10,20,30,40,50};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            sum +=arr[i];
            System.out.println("Sum of an array"+sum);
        }
    
        double average=(double) sum/n;
        System.out.println("Average of an aray:"+average);
    }
}


public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        
        System.out.println("\nArray Elements with Index:");
        for (int i = 0; i < n; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
            sum += arr[i];
        }

        double average = (double) sum / n;

       
        System.out.println("\nSum of array: " + sum);
        System.out.println("Average of array: " + average);
    }
}
