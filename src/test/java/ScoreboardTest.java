import org.junit.Test;
import static org.junit.Assert.*;

public class ScoreboardTest {
    
    @Test(timeout = 1000)
    public void testScoreboardPlay1() {
        Scoreboard scoreboard = new Scoreboard("Team A", "Team B");
        scoreboard.recordPlay(1);
        scoreboard.recordPlay(0);
        scoreboard.recordPlay(3);

        String expected = "1-3 Team B";
        String message = "Check Scoreboard recordPlay() and getScore()";
        assertEquals(message,  expected, scoreboard.getScore());
    }

}
