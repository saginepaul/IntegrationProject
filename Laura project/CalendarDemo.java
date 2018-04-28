
//Local time and date display example from Java : The complete Reference 10th edition book

import java.util.Calendar;

public class CalendarDemo {

  /**Return the local date and time.
   * @author Laura Paul
   */
  public static void dateTimeDisplay() {
    String[] months = { "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December" };
    Calendar calendar = Calendar.getInstance();

    // Display current time and date
    System.out.print("Date : ");
    System.out.print(months[calendar.get(Calendar.MONTH)]);
    System.out.print(" " + calendar.get(Calendar.DATE) + " ");
    System.out.println(calendar.get(Calendar.YEAR));

    System.out.print("Time : ");
    System.out.print(calendar.get(Calendar.HOUR) + ":");
    System.out.print(" " + calendar.get(Calendar.MINUTE) + ": ");
    System.out.println(calendar.get(Calendar.SECOND));

  }
}
