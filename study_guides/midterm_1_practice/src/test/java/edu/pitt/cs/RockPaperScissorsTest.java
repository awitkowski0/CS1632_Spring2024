package edu.pitt.cs;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class RockPaperScissorsTest {
    /**
     * Preconditions: Create a Player p1 that always throws PAPER.
     *                Create a Player p2 that always throws ROCK.
     *                Create a ScoreBoard sb.
     *                Create a RockPaperScissors game rps using p1, p2, sb.
     * Execution steps: Call rps.play(5).
     * Postconditions: 5 p1 wins, 0 p2 wins, and 0 draws are posted to ScoreBoard sb.
     */
    @Test
    public void testPapervsRock5() {
        // create two players that always throw paper & rock
        Player p1 = Mockito.mock(Player.class);
        Player p2 = Mockito.mock(Player.class);

        Mockito.when(p1.throwHand()).thenReturn(Hand.PAPER);
        Mockito.when(p2.throwHand()).thenReturn(Hand.ROCK);

        ScoreBoard sb = new ScoreBoard();
        RockPaperScissors rps = new RockPaperScissors(p1, p2, sb);

        // play 5 rounds
        rps.play(5);

        // expected string is p1,p2,draw
        String wins = sb.toString();

        // 5 p1 wins, 0 p2 wins, and 0 draws
        assertEquals("(5:0:0)", wins);
    }
}
