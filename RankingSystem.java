import java.util.*;
import java.util.jar.Attributes.Name;
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
        
        public void showBattingRanking(){
            ArrayList<Player> batters=new ArrayList<>();
            for(Player p:players.values()){
                if (p.getType().equals("BATTER")) {
                    batters.add(p);
                }

            }
            batters.sort((a,b)->b.getPoints()-a.getPoints());
            System.out.println("****\n ICC BATTING RANKINGS****");
            for(int i=0;i<batters.size();i++){
                System.out.println((i+1) + "."+batters.get(i));
            }
        }

        public void showBawlingRankings(){
            ArrayList<Player> bawlers=new ArrayList<>();

            for(Player p:players.values()){
                if(p.getType().equals("BAWLER")){
                    bawlers.add(p);
                }
            }
            bawlers.sort((a,b)-> b.getPoints()-a.getPoints());
            System.out.println("****\n ICC BAWLING RANKINGS****");
            for(int i=0;i<bawlers.size();i++){
                System.out.println((i+1)+ ". "+bawlers.get(i));
            }
        }

        public void updatePlayerPoints(String name,int newPoints){
            Player player=players.get(name.toLowerCase());
            if (name==null) {
                System.out.println("player not found");
                return;
            }
            int oldPoints=player.getPoints();
            player.setPoints(newPoints);

            history.push(new UpdatePoints(player.getName(), oldPoints, oldPoints));
            System.out.println("player points updated seccussfully");

        }
        
        public void undoUpdates(){
            if (history.isEmpty()) {
                System.out.println("No updates to undo");
                return;
            }
            UpdatePoints last=history.pop();
            Player player=players.get(last.getPlayerName().toLowerCase());

            if(player!=null){
                player.setPoints(last.getOldPoints());
                System.out.println("Restored.undo successfully"+player.getName()+" poin restored"+last.getOldPoints());
            }

        }






    }
