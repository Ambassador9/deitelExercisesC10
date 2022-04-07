package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameOfChanceTest {

    @Test
    public void winOnFirstThrowWithSeven() {
        GameOfChance crapGame = new GameOfChance();
        int result = crapGame.rollDice();
        assertEquals(7, result);
    }

    @Test
    public void winOnFirstThrowWithEleven() {
        GameOfChance crapGame = new GameOfChance();
        int result = crapGame.rollDice();
        assertEquals(11, result);
    }
}
