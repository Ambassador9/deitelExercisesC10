package chapterTwo;

import java.util.Scanner;
public class CompoundValue {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the monthly saving amount: ");
    float saving = in.nextFloat();
    double firstMonth = saving * (1 + 0.00417);
    double secondMonth = (saving + firstMonth) * (1 + 0.00417);
    double thirdMonth = (saving + secondMonth) * (1 + 0.00417);
    double fourthMonth = (saving + thirdMonth) * (1 + 0.00417);
    double fifthMonth = (saving + fourthMonth) * (1 + 0.00417);
    //double sixthMonth = (saving + fifthMonth) * (1 + 0.00417);
    double sixthMonth = 100 * 6 * (1 + 0.00417);
    sixthMonth = (int) sixthMonth;
    System.out.printf("After the sixth month, the account value is $%.2f%n", sixthMonth);

  }

}