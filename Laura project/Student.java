// Inheritance example from lecture 3/27/2018
public class Student extends Person {

  private String name;
  private int age;
  
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public Student () {
    super(22);
  }
  // Overriding constructor
  public void printInfo() {
    super.printInfo();
    System.out.println(name +"  is a student");
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
