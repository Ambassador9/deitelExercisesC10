package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomQuiz {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();

        int countRightAnswer = 0;
        int countWrongAnswer = 0;


        for(int i=1; i<=10; ++i) {

            double firstDigit = rand.nextInt(10);
            double secondDigit = 1 + rand.nextInt(10);
            double result = 0;
            int randomNumber = 1 + rand.nextInt(4);

            switch(randomNumber) {
                case (1):
                    result = firstDigit + secondDigit;
                    System.out.printf("%.0f + %.0f = ? %n", firstDigit, secondDigit);
                    break;
                case (2):
                    result = firstDigit - secondDigit;
                    System.out.printf("%.0f - %.0f = ? %n", firstDigit, secondDigit);
                    break;
                case (3):
                    result = firstDigit * secondDigit;
                    System.out.printf("%.0f * %.0f = ? %n", firstDigit, secondDigit);
                    break;
                case (4):
                    result = firstDigit / secondDigit;
                    System.out.printf("%.0f / %.0f = ? %n", firstDigit, secondDigit);
                    break;
            }

            double userAnswer = in.nextDouble();
            if(userAnswer == result){
                countRightAnswer = ++countRightAnswer;
            } else {
                if(userAnswer != result) {
                    countWrongAnswer = ++countWrongAnswer;
                }
            }
        }

        System.out.printf("The number of right answers = %d%n", countRightAnswer);
        System.out.printf("The number of wrong answers = %d%n", countWrongAnswer);
        System.out.printf("The adjusted score = %d%n", countRightAnswer - countWrongAnswer);
    }
}