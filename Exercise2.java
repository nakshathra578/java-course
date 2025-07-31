class Person{
  String name;
  int age;
      public Person(String name, int age) {
        this.name = name;
        this.age = age;
      }
   public void displayPerson(){
      System.out.println(" Name : " + this.name);
       System.out.println(" Age : " + this.age);
    }
}
class Vidyarthi extends Person{
  int rollno;
  Vidyarthi( String name, int age,int rollno){
    super(name,age);
    this.rollno= rollno;
  }
  public void  displayStudent(){
    System.out.println("Roll Number : "+ this.rollno);
    this.displayPerson();
  }
}
public class Exercise2 {
  public static void main(String[] args) {
      Vidyarthi v= new Vidyarthi("Bunny",21,507);
      v.displayStudent();
  }
}
