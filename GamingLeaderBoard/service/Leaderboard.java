package GamingLeaderBoard.service;
import GamingLeaderBoard.model.Player;
import GamingLeaderBoard.exception.InvalidScoreException;
import GamingLeaderBoard.exception.PlayerNotFoundException;

import java.util.*;
public class Leaderboard {
    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player p) {
        players.add(p);
    }

    public Player findPlayer(int id) throws PlayerNotFoundException {
        for (Player p : players) {
            if (p.getId() == id) {
                return p;
            }
        }
        throw new PlayerNotFoundException("Player with ID " + id + " not found!");
    }

    public void updateScore(int playerId, int score)
            throws InvalidScoreException, PlayerNotFoundException {

        if (score < 0) {
            throw new InvalidScoreException("Score cannot be negative!");
        }

        Player p = findPlayer(playerId);
        p.addScore(score + p.calculateBonus());
    }

    public void displayLeaderboard() {
        players.sort((a, b) -> b.getTotalScore() - a.getTotalScore());

        System.out.println("\n--- Leaderboard ---");
        for (Player p : players) {
            System.out.println(p.getName() + " : " + p.getTotalScore());
        }
    }
}
