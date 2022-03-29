package chapterTwo;

import java.util.Scanner;

public class TwoPointThirty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number: ");
        int digit = in.nextInt();

        int firstSingleNumber = digit / 10000;
        int secondSingleNumber = (digit / 1000) % 10;
        int thirdSingleNumber =  (digit / 100) % 10;
        int fourthSingleNumber = (digit % 100) / 10;
        int fifthSingleNumber = digit % 10;

        System.out.printf("%d  %d  %d  %d  %d", firstSingleNumber, secondSingleNumber, thirdSingleNumber,
                fourthSingleNumber, fifthSingleNumber);
    }
}
