import java.util.Scanner;

// Inheritance example from lecture 3/27/2018

public class Person {
  private int age;
  private String name;
  private String address;
  private static int number;
  private static int numero2;

  public Person(int a) {
    setAge(a);
    System.out.println(age + " years old ");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void printInfo() {
    System.out.println(name + " is an adult");
  }

  // Exception Handling Example
  /**Return true if exception found.
   * @author Laura
   */
  public static void getGoodIntGrade(final Scanner input) {
    numero2 = 100;
    boolean gottenGoodGrade = false;

    while (gottenGoodGrade == false) {
      try {
        numero2 = (input.nextInt());
        gottenGoodGrade = true;
      } catch (Exception e) {
        System.out.println(e);
      }

    }

  }

  public static int getNumber() {
    return number;
  }

  public static void setNumber(int number) {
    Person.number = number;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
