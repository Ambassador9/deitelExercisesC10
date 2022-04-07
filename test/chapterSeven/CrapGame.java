package chapterSeven;

import java.security.SecureRandom;

public class CrapGame {
    private static int sum;
    private static int point;
    private static final SecureRandom r = new SecureRandom();

    private static void rollDice() {
        int die1 = 1 + r.nextInt(6);
        int die2 = 1 + r.nextInt(6);
        sum = die1 + die2;
        System.out.println("dice result: " + sum);
    }

    private static void continueGame() {
        while(sum==2||sum==3||sum==4||sum==5||sum==6||sum==8||sum==9||sum==10||sum==11||sum==12) {
            rollDice();

            if(point == sum) {
                System.out.println("point = dice result = " + point);
                System.out.println("YOU WIN");
                break;
            } else {
                if (sum == 7) {
                    System.out.println("YOU LOSE");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        rollDice();

        if(sum == 7 || sum == 11) {
            System.out.println("YOU WIN");
        } else {
            if(sum == 2 || sum == 3 || sum == 12) {
                System.out.println("YOU LOSE");
            } else {
                point = sum;
                System.out.println("point = " + point);
                System.out.println("CONTINUE GAME");
                System.out.println();
                continueGame();
            }
        }
    }
}