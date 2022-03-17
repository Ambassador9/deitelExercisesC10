package chapterTwo;

import java.util.Scanner;
public class Exercise28 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // exercise 2.8a
    System.out.print("Enter an integer:");

    // exercise 2.8b
    int b = 5;
    int c = 10;
    int a = b * c;
    System.out.println("a = " + a);

    // exercise 2.8c
    // sample payroll calculation
    System.out.print("Enter pay per hour: ");
    double pph = input.nextDouble(); //pph stands for pay per hour
    System.out.print("Enter total hour worked: ");
    double thw = input.nextDouble(); //thw stands for total hour worked
    System.out.print("Enter overtime per hour: ");
    double oh = input.nextDouble(); //oh stands for overtime per hour
    System.out.print("Enter total overtime hour: ");
    double toh = input.nextDouble(); //toh stands for total overtime hour
    double grosspay = (pph * thw) + (oh * toh);
    System.out.println("Gross pay = " + grosspay);
  }
}