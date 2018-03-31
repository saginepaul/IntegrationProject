
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
  

  // Laura Paul - Integration Project

	// Operators Exercise from HackerRank

	public static void calculator() {
		Scanner in = new Scanner(System.in);
		double meal_cost = in.nextDouble();
		int tip_percent = in.nextInt();
		int tax_percent = in.nextInt();
		in.close();
		// ((double) is the return type;
		double tip = meal_cost * ((double) tip_percent / 100);
		double tax = meal_cost * ((double) tax_percent / 100);
		double result = meal_cost + tip + tax;
		int totalCost = (int) Math.round(result);
		System.out.println("The total meal cost is " + totalCost + " dollars.");
	}

	// Primitive data types examples

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
		//String anotherPalindrome = "Hollywood. O roar again!";
		//aChar = anotherPalindrome.charAt(9);
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
  public byte getBinary () {
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
	// string methods example from javatpoint.com

	public static void demoStrings() {
		String s1 = "java";// creating string by java string literal
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		String s2 = new String(ch);// converting char array to string
		String s3 = new String("example");// creating java string by new keyword
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
