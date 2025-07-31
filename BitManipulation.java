public class BitManipulation {
  public static void main(String[] args) {
    //Get Operation
    int n=5;
    int pos=2;
    int bitmask=1<<pos;
    int newNum=bitmask & n;
    if((n& bitmask)==0){
      System.out.println("Bit is 0");
    }
    else{
      System.out.println("Bit is 1");
    }
    
    //set Operation
    int n1=5;
    int pos1=1;
    int bitmask1=1<<pos1;
    int newNum1= bitmask1 | n1;
    System.out.println(newNum1);
  
    //Clear Operation
    int n2=5;
    int pos2=1;
    int bitmask2=1<<pos2;
    int compNum=~(bitmask2);
    int newNum2= compNum & n2;//comp=complement
    System.out.println(newNum2);
  
    //Update Operation
    int num=5;
    int pos3=2;
    int val=0;
    if(val==1){
      int newNum3=(num | (1<< pos3));
      System.out.println(newNum3);
    }else {
      int newNum3=(num & ~(1<< pos3));
      System.out.println(newNum3);
    }
  }
}
