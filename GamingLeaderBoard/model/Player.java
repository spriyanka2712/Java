package GamingLeaderBoard.model;

public class Player {
    private int id;
    private String name;
    private int totalScore;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
        this.totalScore = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void addScore(int score) {
        totalScore += score;
    }

    public int calculateBonus() {
        return 0;
    }
}
