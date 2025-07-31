
class Person2 {
    String name;
    int age;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPerson() {
        System.out.println("Name - " + this.name + ", Age - " + this.age);
    }
}

class Vidyarthi2 extends Person2 {
    int rollNum;

    Vidyarthi2(String name, int age, int rollNum) {
        super(name, age);
        this.rollNum = rollNum;
    }

    public void displayStudent() {
        System.out.println("Roll Number : " + this.rollNum);
        this.displayPerson();
    }
}

class GraduateStudent extends Vidyarthi2 {
    String degree;

    GraduateStudent(String name, int age, int rollNum, String degree) {
        super(name, age, rollNum); 
        this.degree = degree;
    }

    public void displayDegreeStudent() {
        System.out.println("Degree - " + this.degree);
        this.displayStudent();
    }
}

public class MultiLevelInh {
    public static void main(String[] args) {
        GraduateStudent g = new GraduateStudent("Bunny", 20, 507, "B.Tech");
        g.displayDegreeStudent();
    }
}