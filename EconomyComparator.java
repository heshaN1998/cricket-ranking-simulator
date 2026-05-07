import java.util.Comparator;

public class EconomyComparator implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {

        if (a.getEconomy() > b.getEconomy()) {
            return 1;
        }
        else if (a.getEconomy() < b.getEconomy()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}