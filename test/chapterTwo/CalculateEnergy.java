package chapterTwo;

import java.util.Scanner;
public class CalculateEnergy {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the amount of water in kilograms: ");
    float waterAmt = in.nextFloat();
    System.out.print("Enter the initial temperature: ");
    float initialTemp = in.nextFloat();
    System.out.print("Enter the final temperature: ");
    float finalTemp = in.nextFloat();
    double energy = waterAmt * (finalTemp - initialTemp) * 4184;
    System.out.printf("The energy needed is %.1f%n", energy);

  }

}