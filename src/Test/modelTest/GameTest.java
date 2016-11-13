package Test.modelTest;

import Mastermind.model.Game;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @After
    public void tearDown() throws Exception {
        game = null;
    }

    @Test
    public void shouldCreateDefaultBoardSizeOfFive() {
        int actual = game.getRowLength();
        int expected = 5;

        assertEquals(actual, expected);
    }
}
