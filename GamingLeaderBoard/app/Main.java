package GamingLeaderBoard.app;
import GamingLeaderBoard.model.*;
import GamingLeaderBoard.service.Leaderboard;
import GamingLeaderBoard.exception.*;

public class Main {
    public static void main(String[] args) {

        Leaderboard lb = new Leaderboard();

        Player p1 = new Player(1, "Alice");
        Player p2 = new Player(2, "Bob");
        Player p3 = new ProPlayer(3, "Charlie");

        lb.addPlayer(p1);
        lb.addPlayer(p2);
        lb.addPlayer(p3);

        try {
            lb.updateScore(1, 100);
            lb.updateScore(2, 150);
            lb.updateScore(3, 120);

            // Exception cases
            lb.updateScore(4, 100); // Player not found
            lb.updateScore(2, -50); // Invalid score

        } catch (InvalidScoreException | PlayerNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        lb.displayLeaderboard();
    }
}
