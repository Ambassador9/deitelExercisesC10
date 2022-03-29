package chapterTwo;

import java.util.Scanner;
public class Exercise2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.printf("The character %c has the value %d%n", 'Z', ((int) 'Z'));



    /* 2.28
    System.out.print("Enter the radius: ");
    int radius = in.nextInt();
    System.out.printf("Diameter is %d%n", 2 * radius);
    System.out.printf("Circumference is %f%n", 2 * Math.PI * radius);
    System.out.printf("Area is %f%n", 2 * Math.PI * radius * radius);

     */

    /* 2.27
    System.out.println("* * * * * * * *");
    System.out.println(" * * * * * * * *");
    System.out.println("* * * * * * * *");
    System.out.println(" * * * * * * * *");
    System.out.println("* * * * * * * *");
    System.out.println(" * * * * * * * *");
    System.out.println("* * * * * * * *");
    System.out.println(" * * * * * * * *");

     */


    /* 2.26
    System.out.println("Enter first digit: ");
    int firstDigit = in.nextInt();
    System.out.println("Enter second digit: ");
    int secondDigit = in.nextInt();
    int triple = firstDigit * 3;
    int doubled = secondDigit * 2;
    int result = triple % doubled;

    if(result == 0) {
      System.out.printf("The renainder after division = %d%n", result);
    }

     */


    /* 2.25
    System.out.println("Enter a digit: ");
    int digit = in.nextInt();
    if(digit%3 == 0) {
      System.out.printf("%d is divisible by 3", digit);
    }

     */

    /* 2.24
    System.out.println("Enter first digit: ");
    int firstDigit = in.nextInt();
    System.out.println("Enter second digit: ");
    int secondDigit = in.nextInt();
    System.out.println("Enter third digit: ");
    int thirdDigit = in.nextInt();
    System.out.println("Enter fourth digit: ");
    int fourthDigit = in.nextInt();
    System.out.println("Enter fifth digit: ");
    int fifthDigit = in.nextInt();
    int minimum = 0;
    int maximum = 0;

    if(minimum < firstDigit) minimum = firstDigit;
    if(secondDigit < minimum) minimum = secondDigit;
    if(thirdDigit < minimum) minimum = thirdDigit;
    if(fourthDigit < minimum) minimum = fourthDigit;
    if(fifthDigit < minimum) minimum = fifthDigit;

    if(firstDigit > maximum) maximum = firstDigit;
    if(secondDigit > maximum) maximum = secondDigit;
    if(thirdDigit > maximum) maximum = thirdDigit;
    if(fourthDigit > maximum) maximum = fourthDigit;
    if(fifthDigit > maximum) maximum = fifthDigit;

    System.out.printf("Minimum number = %d%n", minimum);
    System.out.printf("Maximum number = %d%n", maximum);

     */


    /* 2.18 (not complete)
    System.out.printf(" ********%n " +
            "*      *%n *      *%n *      *%n *      *%n *      *%n *      *%n *      *%n" +
                      " ********");
    System.out.printf("     ***%n  " +
                      "*       *%n " +
                      "*         *%n *         *%n *         *%n *         *%n *         *%n  " +
                      "*       *%n     " +
                      "***%n");

     */


    /* 2.17
    System.out.print("Enter first integer: ");
    int firstDigit = in.nextInt();
    System.out.print("Enter second integer: ");
    int secondDigit = in.nextInt();
    System.out.print("Enter third integer: ");
    int thirdDigit = in.nextInt();
    System.out.printf("Sum = %d%n", firstDigit + secondDigit + thirdDigit);
    System.out.printf("Average = %d%n", (firstDigit + secondDigit + thirdDigit)/3);
    System.out.printf("Product = %d%n", (firstDigit * secondDigit * thirdDigit));

    int maximum = 0;
    int minimum = 0;
    if(minimum < firstDigit) minimum = firstDigit;
    if(secondDigit < minimum) minimum = secondDigit;
    if(thirdDigit < minimum) minimum = thirdDigit;
    System.out.printf("Minimum digit = %d%n", minimum);

    if(firstDigit > maximum) maximum = firstDigit;
    if(secondDigit > maximum) maximum = secondDigit;
    if(thirdDigit > maximum) maximum = thirdDigit;
    System.out.printf("Maximum digit = %d%n", maximum);

     */


  }
}
