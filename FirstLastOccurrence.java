import java.util.Scanner;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to find: ");
        int target = sc.nextInt();
        int first = -1, last = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] == target) {
                if(first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        if(first == -1) {
            System.out.println("Element not found in array.");
        } else {
            System.out.println("First occurrence at index: " + first);
            System.out.println("Last occurrence at index: " + last);
        }

        sc.close();
    }
}
