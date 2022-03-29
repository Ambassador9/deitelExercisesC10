package chapterTwo;

import java.util.Scanner;

public class TwoPointFifteen {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int first = in.nextInt();
        System.out.print("Enter second integer: ");
        int second = in.nextInt();
        double firstSquare = Math.pow(first, 2);
        double secondSquare = Math.pow(second, 2);
        double squareSum = firstSquare + secondSquare;
        double squareDifference = firstSquare - secondSquare;
        System.out.println("Square of first integer = " + firstSquare);
        System.out.println("Square of second integer = " + secondSquare);
        System.out.println("Sum of square of first and second integer = " + squareSum);
        System.out.println("Difference of square of first and second integer = " + squareDifference);
    }
}
