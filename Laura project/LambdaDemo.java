// Predicate lambda expression example from Java : The complete Reference 10th edition book
/**Represents a lambda expression demo.
 * @author LauraPaul
 */
public class LambdaDemo {
  interface NumericTest {
    boolean test(int n);
  }

  /**Represents lambda expression that tests if a number is even.
   * @author LauraPaul
   */
  public static void lambdaDemo2() {

    
    NumericTest isEven = (n) -> (n % 2) == 0;
    if (isEven.test(8)) {
      System.out.println("8 is even");
    }
    if (!isEven.test(9)) {
      System.out.println("9 is not even");
    }

  }
}
