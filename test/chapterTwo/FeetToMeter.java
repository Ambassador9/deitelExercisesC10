package chapterTwo;

import java.util.Scanner;
public class FeetToMeter {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a value for feet: ");
    float feet = in.nextFloat();
    double meter = feet * 0.305;
    System.out.println(feet + " feet is " + meter + " meters.");

  }

}