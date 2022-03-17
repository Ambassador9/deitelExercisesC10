package chapterThree;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //two digit palindrome
        System.out.print("Enter first digit: ");
        int twoDigitPalindrome1 = in.nextInt();
        System.out.print("Enter second digit: ");
        int twoDigitPalindrome2 = in.nextInt();

        if(twoDigitPalindrome1 == twoDigitPalindrome2) {
            System.out.printf("%d%d is a palindrome %n", twoDigitPalindrome1, twoDigitPalindrome2);
        }

        //three digit palindrome
        System.out.print("Enter first digit: ");
        int threeDigitPalindrome1 = in.nextInt();
        System.out.print("Enter second digit: ");
        int threeDigitPalindrome2 = in.nextInt();
        System.out.print("Enter third digit: ");
        int threeDigitPalindrome3 = in.nextInt();

        if(threeDigitPalindrome1 == threeDigitPalindrome3) {
            System.out.printf("%d%d%d is a palindrome %n", threeDigitPalindrome1, threeDigitPalindrome2, threeDigitPalindrome3);
        }
    }
}
