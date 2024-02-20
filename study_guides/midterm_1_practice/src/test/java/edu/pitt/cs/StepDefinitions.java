package edu.pitt.cs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {
    RockPaperScissors rps;
    ScoreBoard sb;
    Player p1;
    Player p2;

    @Then("the scoreboard should display {string}")
    public void theScoreboardShouldDisplay(String scoreboardToString) {
        assertEquals(scoreboardToString, sb.toString());
    }

    @Given("an RPS game")
    public void anRPSGame() {
        p1 = Mockito.mock(Player.class);
        p2 = Mockito.mock(Player.class);

        Mockito.when(p1.throwHand()).thenReturn(Hand.PAPER);
        Mockito.when(p2.throwHand()).thenReturn(Hand.PAPER);

        sb = new ScoreBoard();

        rps = new RockPaperScissors(p1, p1, sb);
    }

    @When("the game is played for {int} rounds")
    public void theGameIsPlayedForRounds(int rounds) {
        rps.play(rounds);
    }
}
