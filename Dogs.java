class Dog{
  String name;
  String breed;
  public Dog(String name,String breed){
    this.name=name;
    this.breed=breed;
  }
  public void bark(){
    System.out.println(name + " says woof!");
  }
}
public class Dogs {
  public static void main(String[] args) {
      Dog myDog= new Dog("Dollar",  "Golden Retriever");
      System.out.println(" My dog's name is " + myDog.name + " and it's a " + myDog.breed + ".");
      myDog.bark();
  }
  
}
