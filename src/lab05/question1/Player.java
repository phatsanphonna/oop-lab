package lab05.question1;

public class Player {
    private String name;
    private String team;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeam() {
        return this.team;
    }

    public boolean isSameTeam(Player p) {
        return this.getTeam() == p.getTeam();
    }
}
