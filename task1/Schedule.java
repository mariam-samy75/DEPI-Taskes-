package task1;

import java.util.ArrayList;

public class Schedule {
    private ArrayList<Team> teams;
    private ArrayList<Match> matches;

    public Schedule() {
        this.teams = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void addMatch(Match match) {
        matches.add(match);
    }

    // تحديث أهداف ونقاط الفرق بناءً على المباريات
    public void updateStatistics() {
        for (Match match : matches) {
            int team1Goals = 0;
            int team2Goals = 0;

            for (Goal goal : match.getGoals()) {
                if (goal.getPlayer().getTeam().equalsIgnoreCase(match.getTeam1().getName())) {
                    team1Goals++;
                } else if (goal.getPlayer().getTeam().equalsIgnoreCase(match.getTeam2().getName())) {
                    team2Goals++;
                }
            }

            // تحديث الأهداف الكلية
            match.getTeam1().setGoals(match.getTeam1().getGoals() + team1Goals);
            match.getTeam2().setGoals(match.getTeam2().getGoals() + team2Goals);

            // حساب النقاط (3 للفائز، 1 للتعادل)
            if (team1Goals > team2Goals) {
                match.getTeam1().setPoints(match.getTeam1().getPoints() + 3);
            } else if (team2Goals > team1Goals) {
                match.getTeam2().setPoints(match.getTeam2().getPoints() + 3);
            } else {
                match.getTeam1().setPoints(match.getTeam1().getPoints() + 1);
                match.getTeam2().setPoints(match.getTeam2().getPoints() + 1);
            }
        }
    }

    // ترتيب الفرق حسب النقاط ثم الأهداف
    public void rankTeams() {
        teams.sort((t1, t2) -> {
            if (t2.getPoints() != t1.getPoints()) {
                return Integer.compare(t2.getPoints(), t1.getPoints());
            }
            return Integer.compare(t2.getGoals(), t1.getGoals());
        });
    }

    // عرض جدول النتائج والترتيب
    public void displayResultsTable() {
        System.out.println("--- Standings Table ---");
        for (Team team : teams) {
            System.out.println("Team: " + team.getName() + " | Points: " + team.getPoints() + " | Goals: " + team.getGoals());
        }
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }
}