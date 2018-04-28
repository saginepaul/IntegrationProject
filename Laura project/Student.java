// Inheritance example from lecture 3/27/2018
/**
 * Represents some basic personal information of the student.
 * The student class uses properties from the Person.java class
 * @author laurapaul
 */
public class Student extends Person {

  private String name;
  private int age;
  
  public int getAge() {
    return age;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  /**
   * Gets the age and name of a student.
   * Returns student's name and age.
   * intAge , StringName
   * @author Laura Paul
   */
  
  public Student() {
    super(22);
  }
  
  // Overriding constructor
  public void printInfo() {
    super.printInfo();
    System.out.println(name + " is a student");
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
}
