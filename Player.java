public class Player {

    private String name;
    private String team;
    private String type;
    private int points;

    private int runs;
private int ballsFaced;

private int runsGiven;
private int ballsBowled;
    
    public Player(String name,String team,String type,int points){
        this.name=name;
        this.team=team;
        this.type=type;
        this.points=points;
    }
    public String getName(){
        return name;
    }
    public String getTeam(){
        return team;
    }
    public String getType(){
        return type;
    }
    public int getPoints(){
        return points;
    }
    public void setPoints(int points){
        this.points=points;
    }

    @Override
    public String toString(){
        return name + " | " + team +" | " + type +" | ponits: "+points;
    }
   public void setBattingStats(int runs, int ballsFaced) {
    this.runs = runs;
    this.ballsFaced = ballsFaced;
}

public void setBowlingStats(int runsGiven, int ballsBowled) {
    this.runsGiven = runsGiven;
    this.ballsBowled = ballsBowled;
}
public double getStrikeRate() {

    if (ballsFaced == 0) {
        return 0;
    }

    return (runs * 100.0) / ballsFaced;
}
public double getEconomy() {

    if (ballsBowled == 0) {
        return 0;
    }

    double overs = ballsBowled / 6.0;

    return runsGiven / overs;
}

}