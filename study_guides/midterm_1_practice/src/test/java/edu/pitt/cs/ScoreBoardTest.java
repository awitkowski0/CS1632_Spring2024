package edu.pitt.cs;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class ScoreBoardTest {
    ScoreBoard sb;

    @Before
    public void setUp() {
        sb = new ScoreBoard();
        sb = Mockito.mock(ScoreBoard.class);


    }

    @Test
    public void testP1Win() {
        sb.p1Win();
        assertEquals("(1:0:0)", sb.toString());
    }

    @Test
    public void testP2Win() {
        sb.p2Win();
        assertEquals("(0:1:0)", sb.toString());
    }

    @Test
    public void testDraw() {
        sb.draw();
        assertEquals("(0:0:1)", sb.toString());
    }
}
