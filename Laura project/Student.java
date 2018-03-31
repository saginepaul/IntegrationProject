// Overriding example from lecture 3/27/2018
public class Student extends Person {

  
  public Student () {
    super(22);
  }
  // Overriding constructor
  public void printInfo() {
    super.printInfo();
    System.out.println("I am a student");
  }
}
