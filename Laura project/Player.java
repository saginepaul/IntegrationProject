import java.util.Scanner;

class Solution {

  public static void SolutionPlayer() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int x = 1; x < 11; x++) {
      System.out.println("" + n + " x " + x + " = " + (n * x));

    }
  }
}
