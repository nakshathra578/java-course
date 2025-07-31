class Student3{
  int rno;
  String name;
  char grade;
  public void getDetails(){
    System.out.println(" My name is " + this.name +", My roll number is " + this.rno +",And my grade is " + this.grade + ".");
  }
}
public class Exercise {
  public static void main(String[] args) {
      Student3 s1=new Student3();
      s1.name="Bunny";
      s1.grade='A';
      s1.rno=507;
      s1.getDetails();
  }
}
