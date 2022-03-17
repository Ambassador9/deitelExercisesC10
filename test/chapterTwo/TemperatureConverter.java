package chapterTwo;

import java.util.Scanner;
public class TemperatureConverter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a degree in celsius: ");
    double celsius = input.nextDouble();
    double fahrenheit = (9.0/5) * celsius + 32;
    System.out.print(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
  }
}