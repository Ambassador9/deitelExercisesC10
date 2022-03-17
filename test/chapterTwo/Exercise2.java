package chapterTwo;

import java.util.Scanner;
public class Exercise2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter interger: ");
    int first = in.nextInt();
    double firstsqr = Math.pow(first, 2);
    if (first > 100) {
      System.out.printf("%.0f > 100%t", first);
    }
    if (first == 100) {
      System.out.printf("%.0f == 100%t", first);
    }
    if (first != 100) {
      System.out.printf("%.0f != 100", first);
    }
    if (first < 100) {
      System.out.printf("%.0f < 100", first);
    }
    if (firstsqr > 100) {
      System.out.printf("%.0f > 100", firstsqr);
    }
    if (firstsqr == 100) {
      System.out.printf("%.0f == 100", firstsqr);
    }
    if (firstsqr != 100) {
      System.out.printf("%.0f != 100", firstsqr);
    }
    if (firstsqr < 100) {
      System.out.printf("%.0f < 100", firstsqr);
    }

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
  }
}
