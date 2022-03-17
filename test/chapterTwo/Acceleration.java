package chapterTwo;

import java.util.Scanner;
public class Acceleration {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter starting velocity: ");
    float startVel = in.nextFloat();
    System.out.print("Enter ending velocity: ");
    float endVel = in.nextFloat();
    System.out.print("Enter time: ");
    float time = in.nextFloat();
    double accel = (endVel - startVel) / time;
    System.out.printf("The average acceleration is %.4f%n", accel);

  }

}