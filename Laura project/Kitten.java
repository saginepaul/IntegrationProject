class Kitten {
  
  private int weight;
  private String color;
  private String name;
  private int age;

  // Creating a method
  public void posture() {

    System.out.println("Hello " + name);

    System.out.println(name + " weighs " + weight + " pounds ");
  }

  // Getters and return values
  public int calculateYearsOfBirth() {
    int birthYear = 2018 - age;
    return birthYear;

  }

  public void setWeight(int weigh) {
    weight = weigh;
  }

  public int getWeight() {
    return weight;
  }

  public void setColor(String col) {
    color = col;
  }

  public String getcolor() {
    return color;
  }

  public void setName(String nam) {
    name = nam;
  }

  public String getName() {
    return name;
  }

  public void setAge(int ag) {
    age = ag;
  }

  public int getAge() {
    return age;
  }
}
