package chapterTwo;

import java.util.Scanner;

public class TwoPointSixteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int first = in.nextInt();
        int firstSquare = first * first;
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
        if (firstSquare > 100) {
            System.out.printf("%d > 100%n", firstSquare);
        }
        if (firstSquare == 100) {
            System.out.printf("%d == 100%n", firstSquare);
        }
        if (firstSquare != 100) {
            System.out.printf("%d != 100%n", firstSquare);
        }
        if (firstSquare < 100) {
            System.out.printf("%d < 100%n", firstSquare);
        }
    }
}
