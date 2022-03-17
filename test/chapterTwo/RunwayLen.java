package chapterTwo;

import java.util.Scanner;
public class RunwayLen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter speed: ");
    float speed = in.nextFloat();
    System.out.print("Enter acceleration: ");
    float accel = in.nextFloat();
    double length = (speed * speed) / (2 * accel);
    System.out.printf("%.3f%n The minimum runway length for this airplane is ", length);

  }

}