package chapterTwo;

import java.util.Scanner;
public class Exercise2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter first integer: ");
    int firstDigit = in.nextInt();
    System.out.print("Enter second integer: ");
    int secondDigit = in.nextInt();
    System.out.print("Enter third integer: ");
    int thirdDigit = in.nextInt();
    System.out.printf("Sum = %d%n", firstDigit + secondDigit + thirdDigit);
    System.out.printf("Average = %d%n", (firstDigit + secondDigit + thirdDigit)/3);
    System.out.printf("Product = %d%n", (firstDigit * secondDigit * thirdDigit));
    if(firstDigit < secondDigit && firstDigit < thirdDigit){
      System.out.printf("Minimum digit = %d%n", firstDigit);
    }
    if(secondDigit < firstDigit && secondDigit < thirdDigit){
      System.out.printf("Minimum digit = %d%n", secondDigit);
    }
    if(thirdDigit < secondDigit && thirdDigit < firstDigit){
      System.out.printf("Minimum digit = %d%n", thirdDigit);
    }
    if(firstDigit > secondDigit && firstDigit > thirdDigit){
      System.out.printf("Maximum digit = %d%n", firstDigit);
    }
    if(secondDigit > firstDigit && secondDigit > thirdDigit){
      System.out.printf("Maximum digit = %d%n", secondDigit);
    }
    if(thirdDigit > secondDigit && thirdDigit > firstDigit){
      System.out.printf("Maximum digit = %d%n", thirdDigit);
    }


    /* exercise 2.16
    System.out.print("Enter integer: ");
    int first = in.nextInt();
    int firstsqr = first * first;
    if (first > 100) {
      System.out.printf("%d > 100%n", first);
    }
    if (first == 100) {
      System.out.printf("%d == 100%n", first);
    }
    if (first != 100) {
      System.out.printf("%d != 100%n", first);
    }
    if (first < 100) {
      System.out.printf("%d < 100%n",  first);
    }
    if (firstsqr > 100) {
      System.out.printf("%d > 100%n", firstsqr);
    }
    if (firstsqr == 100) {
      System.out.printf("%d == 100%n", firstsqr);
    }
    if (firstsqr != 100) {
      System.out.printf("%d != 100%n", firstsqr);
    }
    if (firstsqr < 100) {
      System.out.printf("%d < 100%n", firstsqr);
    }
     */

    /* exercise 2.15
    System.out.print("Enter first integer: ");
    int first = in.nextInt();
    System.out.print("Enter second integer: ");
    int second = in.nextInt();
    double firstsqr = Math.pow(first, 2);
    double secondsqr = Math.pow(second, 2);
    double sqrsum = firstsqr + secondsqr;
    double sqrdiff = firstsqr - secondsqr;
    System.out.println("Square of first integer = " + firstsqr);
    System.out.println("Square of second integer = " + secondsqr);
    System.out.println("Sum of square of first and second integer = " + sqrsum);
    System.out.println("Difference of square of first and second integer = " + sqrdiff);
    */

    /* exercise 2.14
    int a,b,c,d;
    a = 1; b = 2; c = 3; d = 4;
    System.out.println(a+" "+b+" "+c+" "+d);
    System.out.print(a + " ");
    System.out.print(b + " ");
    System.out.print(c + " ");
    System.out.print(d);
    System.out.printf("%n%d %d %d %d", a,b,c,d);
    */

    /* exercise 2.13
    int p = 5;
    System.out.printf("%d%n", p + 2 * 4);
    System.out.printf("%d", p * 2 + 4);
     */


    /* exercise 2.10
    int x = 5, y = 1;
    System.out.printf("x = %d%n", x + 5);
    System.out.printf("Value of %d *%d is %d\n", x, y, (x * y) );
    System.out.printf("x is %d and y is %d", x, y);
    System.out.printf("%d is not equal to %d\n", (x + y), (x * y) );
    */

    /*
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
    double pph = in.nextDouble(); //pph stands for pay per hour
    System.out.print("Enter total hour worked: ");
    double thw = in.nextDouble(); //thw stands for total hour worked
    System.out.print("Enter overtime per hour: ");
    double oh = in.nextDouble(); //oh stands for overtime per hour
    System.out.print("Enter total overtime hour: ");
    double toh = in.nextDouble(); //toh stands for total overtime hour
    double grosspay = (pph * thw) + (oh * toh);
    System.out.println("Gross pay = " + grosspay);
     */
  }
}
