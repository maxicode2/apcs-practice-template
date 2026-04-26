public class Scoreboard {
    boolean team1Active = true;
    int team1Score = 0;
    int team2Score = 0;

    String team1;
    String team2;

    public Scoreboard(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void recordPlay(int score) {
        if(score == 0) team1Active = !team1Active;
        else if(team1Active) team1 += score;
        else team2 += score;
    }

    public String getScore() {
        return team1Score + "-" + team2Score + "-" + (team1Active ? team1 : team2);
    }

}
