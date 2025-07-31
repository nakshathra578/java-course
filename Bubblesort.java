 class Bubble{
  void bubbleSort(int arr[]){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
      for(int j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
     }
  }
  int secondLargest(int arr[]){
    int n=arr.length;
    int largest=arr[n-1];
    for(int i=n-1;i>=0;i--){
      if(arr[i]!=largest){
        return arr[i];
      }
    }
    return-1;
  }
}
  public class Bubblesort{
  public static void main(String[] args) {
    Bubble ob=new Bubble();
    int a[]={64,34,25,12};
    ob.bubbleSort(a);
    int n=a.length;
    for(int i=0;i<n;i++){
      System.out.print(a[i]+" ");

    }
    int secondLarge=ob.secondLargest(a);
    if(secondLarge != -1){
      System.out.println("\n Second largest element : "+ secondLarge);
    }
    else{
      System.out.println("\n No second largest element found!");
    }
  }  
  }
