import java.util.Comparator;

public class StrikeRateComparator implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {

        if (b.getStrikeRate() > a.getStrikeRate()) {
            return 1;
        }
        else if (b.getStrikeRate() < a.getStrikeRate()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}