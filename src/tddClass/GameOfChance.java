package tddClass;

import java.security.SecureRandom;

public class GameOfChance {
    SecureRandom r = new SecureRandom();

    public int rollDice() {
        int die1 = 1 + r.nextInt(6);
        int die2 = 1 + r.nextInt(6);
        int sum = die1 + die2;
        return sum;
    }
}
