package chapterThree;

import java.util.Scanner;

public class Flipper {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a digit: ");
        int digit = in.nextInt();
        if(digit == 1) {
            System.out.println(0);
        }
        if(digit == 0) {
            System.out.println(1);
        }

    }
}
