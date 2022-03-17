package chapterTwo;

import java.util.Scanner;
public class PoundToKilo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number in pounds: ");
    float num = in.nextFloat();
    double kilo = num * 0.454;
    System.out.println(num + " pounds is " + kilo + " Kilograms.");

  }

}