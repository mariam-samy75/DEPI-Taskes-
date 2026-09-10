
    package task1;

public class Goal {
    private String matchId;
    private Player player; 
    private int minute;    

    public Goal(String matchId, Player player, int minute) {
        this.matchId = matchId;
        this.player = player;
        this.minute = minute;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}

