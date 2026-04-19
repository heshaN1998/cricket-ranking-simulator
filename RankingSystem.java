import java.util.*;
public class RankingSystem {
    private Map<String ,Player> players;
    private Stack<UpdatePoints> history;
    private Queue<String> updateQueue;

    public RankingSystem(){
        players=new HashMap<>();
        history=new Stack<>();
        updateQueue=new LinkedList<>();
        }

        public void addPlayer(String name,String team,String type,int points){
            if(players.containsKey(name.trim().toLowerCase())){
                System.out.println("Player already exists");
                return;
            }
            Player player=new Player(name,team,type.toUpperCase(),points);
            players.put(name.toUpperCase(), player);
            System.out.println("added Player successfully");
            
        }
        public void showAllPlayers(){
            System.out.println("****All Players****");
            for(Player p:players.values()){
                System.out.println(p);
            }
        }
    }
