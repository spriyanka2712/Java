package GamingLeaderBoard.model;

public class Score {
    private Player player;
    private int score;

    public Score(Player player, int score) {
        this.player = player;
        this.score = score;
    }

    public Player getPlayer() {
        return player;
    }

    public int getScore() {
        return score;
    }
}
