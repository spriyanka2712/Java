package GamingLeaderBoard.model;

public class ProPlayer extends Player {

    public ProPlayer(int id, String name) {
        super(id, name);
    }

    @Override
    public int calculateBonus() {
        return 50;
    }
}
