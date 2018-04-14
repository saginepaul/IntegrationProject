// Predicate lambda expression example from Java : The complete Reference 10th edition book
public class LambdaDemo {
  interface NumericTest {
    boolean test(int n);
  }

  public static void LambdaDemo2() {

    // Lambda expression that tests if a number is even.
    NumericTest isEven = (n) -> (n % 2) == 0;
    if (isEven.test(8))
      System.out.println("8 is even");
    if (!isEven.test(9))
      System.out.println("9 is not even");

  }
}
