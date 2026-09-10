package task1;

import java.util.ArrayList;

public class Match {
    private Team team1;
    private Team team2;
    private ArrayList<Goal> goals; 

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.goals = new ArrayList<>();
    }

   
    public void addGoal(Goal goal) {
        this.goals.add(goal);
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public ArrayList<Goal> getGoals() {
        return goals;
    }
}