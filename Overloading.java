class Student2{
  public void getInfo(String name){
    System.out.println(name);
  }
  public void getInfo(int age){
    System.out.println(age);
  }
  public void getInfo(String name, int age){
    System.out.println(name +" "+age);
  }
}
public class Overloading {
  public static void main(String[] args) {
      Student2 s =new Student2();
      s.getInfo("Bunny");
      s.getInfo(22);
       System.out.println(name +" "+age);
  }
  
}
