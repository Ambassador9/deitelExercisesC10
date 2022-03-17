package chapterTwo;

import java.util.Scanner;
public class NumberOfYears {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number of minutes: ");
    float minute = in.nextFloat();
    double years = minute / (60*24*365);
    years = (int) years;
    double days = (minute % (60*24*365)) / (60*24);
    days = (int) days;
    System.out.printf("%.0f minutes is approximately %.0f years and %.0f days", minute, years, days);

  }

}