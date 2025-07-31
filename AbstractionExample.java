abstract class Forest {
  abstract void makeSound();

  void sleep() {
    System.out.println("Playing...");
  }
}

class Cat extends Forest {
  void makeSound() {
    System.out.println("Cat says: Meow  Meow");
  }
}

public class AbstractionExample {
  public static void main(String[] args) {
    Cat d = new Cat();
    d.makeSound();
    d.sleep();
  }
}
