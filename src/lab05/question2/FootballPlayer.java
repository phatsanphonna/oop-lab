package lab05.question2;

import lab05.question1.Player;

public class FootballPlayer extends Player {
    private int playerNumber;
    private String position;

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isSamePosition(FootballPlayer p) {
        if ((p.getPosition().equals(this.getPosition())) &
                (p.getTeam().equals(this.getTeam()))) {
            return true;
        } else {
            return false;
        }
    }
}
