public class UpdatePoints {
    private String playerName;
    private int oldPoints;
    private int newPoints;

    public UpdatePoints(String playerName,int oldPoints,int NewPoints){
        this.playerName=playerName;
        this.oldPoints=oldPoints;
        this.newPoints=newPoints;

    }
    public String getPlayerName(){
        return playerName;
    }
    public int getOldPoints(){
        return oldPoints;
    }
    public int getNewPoints(){
        return newPoints;
    }
}
