
import java.util.Scanner;

public class Examples {

  private static long tire;
  private static boolean rain;
  private static char capitalA;
  private static byte binary;
  private static double dutch;
  private static short socks;
  private static int income;
  private static float fish;

  // Operators Exercise from HackerRank

  /**Returns data types.
   * @author laurapaul
   */
  public static void calculator() {
    Scanner in = new Scanner(System.in);
    double mealCost = in.nextDouble();
    int tipPercent = in.nextInt();
    int taxPercent = in.nextInt();
    in.close();
    // ((double) is the return type;
    double tip = mealCost * ((double) tipPercent / 100);
    double tax = mealCost * ((double) taxPercent / 100);
    double result = mealCost + tip + tax;
    int totalCost = (int) Math.round(result);
    System.out.println("The total meal cost is " + totalCost + " dollars.");
  }

  /**Initializing variables.
   * @author laurapaul
   */
  public static void demoInt() {

    tire = 46L;
    rain = false;
    capitalA = 'A';
    binary = 80;
    dutch = 34.5;
    socks = 8000;
    income = 80000;
    fish = 342.5f;

    // methods of strings from oracle java documentation
    // String anotherPalindrome = "Hollywood. O roar again!";
    // aChar = anotherPalindrome.charAt(9);
  }

  public long getTire() {
    return tire;
  }

  public boolean getRain() {
    return rain;
  }

  public char getCapitalA() {
    return capitalA;
  }

  public byte getBinary() {
    return binary;
  }

  public double getDutch() {
    return dutch;
  }

  public short getSocks() {
    return socks;
  }

  public int getIncome() {
    return income;
  }

  public float getFish() {
    return fish;
  }
 

  /**Represent string methods example from javatpoint.com.
   * @author LauraPaul
   */
  public static void demoStrings() {
    String s1 = "java";// creating string by java string literal
    char[] ch = { 's', 't', 'r', 'i', 'n', 'g', 's' };
    String s2 = new String(ch);// converting char array to string
    System.out.println(s1);
    System.out.println(s2);

  }
}
