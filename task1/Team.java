package task1;
import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int goals;
    private int points;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
        this.goals = 0;
        this.points = 0;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
