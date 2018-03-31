// Inheritance example from lecture 3/27/2018

public class Person {
  private int age;
  private String name;
  private String address;

  
  public Person (int a) {
    age = a;
   System.out.println("in person constructor");
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void printInfo() {
    System.out.println("I am a person");
  }
}
