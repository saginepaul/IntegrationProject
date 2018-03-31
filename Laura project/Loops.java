// for loops and for-each loop examples from Java : The complete Reference 10th edition book

public class Loops {
  private int num;
  private boolean isPrime;
  
  
  
  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public boolean isPrime() {
    return isPrime;
  }

  public void setPrime(boolean isPrime) {
    this.isPrime = isPrime;
  }

// for loops -- example
public void Forloops() {
 

  num=11;

  if(num<2)isPrime=false;else isPrime=true;

  for(
  int i = 2;i<=num/i;i++)
  {
    if ((num % i) == 0) {
      isPrime = false;
      break;
    }
  }if(isPrime)System.out.println("Prime");else System.out.println("Not Prime ");

}

// for-each loop -- examples
public void ForEachLoops () {
 int nums [] = {1,2,3,4,5,6,7,8,9,10};
 int sum = 0; 
 
 // use for-each style for to display and sum the values
 for (int x : nums ) {
   System.out.println ("Value is : " +x);
   sum += x;
 }
 System.out.println ("Summation: " +sum);
}

}

/* Notes for access and create static fields and methods
 Static belonging to the class not the object*/
