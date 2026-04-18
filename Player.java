public class Player {

    private String name;
    private String team;
    private String type;
    private int points;
    
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
   

}