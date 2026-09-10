package task1;

import task1.Schedule;
import task1.Team;

public class Main {
    public static void main(String[] args) {
        Schedule schedule = new Schedule();

        // إضافة الـ 6 فرق المذكورة في التكليف
        Team t1 = new Team("Team A");
        Team t2 = new Team("Team B");
        Team t3 = new Team("Team C");
        Team t4 = new Team("Team D");
        Team t5 = new Team("Team E");
        Team t6 = new Team("Team F");

        schedule.addTeam(t1);
        schedule.addTeam(t2);
        schedule.addTeam(t3);
        schedule.addTeam(t4);
        schedule.addTeam(t5);
        schedule.addTeam(t6);

        // إضافة لاعبين إلى الفرق
        t1.addPlayer(new Player("Ahmed", "Team A"));
        t1.addPlayer(new Player("Mohamed", "Team A"));
        t2.addPlayer(new Player("Ali", "Team B"));
        t2.addPlayer(new Player("Hassan", "Team B"));
        t3.addPlayer(new Player("Omar", "Team C"));
        t3.addPlayer(new Player("Karim", "Team C"));
        t4.addPlayer(new Player("Salim", "Team D"));
        t4.addPlayer(new Player("Nasser", "Team D"));
        t5.addPlayer(new Player("Hamza", "Team E"));
        t5.addPlayer(new Player("Rashid", "Team E"));
        t6.addPlayer(new Player("Samir", "Team F"));
        t6.addPlayer(new Player("Faisal", "Team F"));

        // إضافة مباريات وأهداف
        // المباراة الأولى: Team A vs Team B
        Match match1 = new Match(t1, t2);
        match1.addGoal(new Goal("match1", t1.getPlayers().get(0), 15));
        match1.addGoal(new Goal("match1", t1.getPlayers().get(1), 35));
        match1.addGoal(new Goal("match1", t2.getPlayers().get(0), 50));
        schedule.addMatch(match1);

        // المباراة الثانية: Team C vs Team D
        Match match2 = new Match(t3, t4);
        match2.addGoal(new Goal("match2", t3.getPlayers().get(0), 20));
        match2.addGoal(new Goal("match2", t4.getPlayers().get(1), 40));
        match2.addGoal(new Goal("match2", t4.getPlayers().get(0), 60));
        schedule.addMatch(match2);

        // المباراة الثالثة: Team E vs Team F
        Match match3 = new Match(t5, t6);
        match3.addGoal(new Goal("match3", t5.getPlayers().get(0), 25));
        match3.addGoal(new Goal("match3", t5.getPlayers().get(1), 45));
        match3.addGoal(new Goal("match3", t6.getPlayers().get(0), 55));
        match3.addGoal(new Goal("match3", t6.getPlayers().get(1), 70));
        schedule.addMatch(match3);

        // تحديث الإحصائيات وطباعة الجدول
        schedule.updateStatistics();
        schedule.rankTeams();
        schedule.displayResultsTable();
    }
}