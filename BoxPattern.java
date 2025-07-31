public class BoxPattern {
  public static void main(String[] args) {
    System.out.println("\n Rectangle Box:\n");
    for(int i=1;i<=4;i++){
      for (int j=1; j<=5; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("Rectangle with a hole\n");
    for (int i=1;i<=4;i++){
      for(int j=1;j<=5;j++){
        if(i==1||i==4||j==1||j==5){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    }
  }
  

