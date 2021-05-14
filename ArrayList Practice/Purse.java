import java.util.ArrayList;

public class Purse {
    private ArrayList<Coin> coins;
    public Purse() {
        coins = new ArrayList<Coin>();
    }
    public void add(Coin aCoin) {
        coins.add(aCoin);
    }
    public double getTotal() {
        double sum = 0;
        for(Coin v:coins) sum+=v.getValue();
        return sum;
    }
    public int count(Coin aCoin) {
        int c = 0;
        for(Coin x:coins) if (aCoin.equals(x)) c++;
        return c;
    }
    public String findSmallest() {
        Coin min = coins.get(0);
        for(Coin c:coins) if(c.getValue()<min.getValue()) min=c;
        return min.getName();
    }
    public String toString() {
        return "Purse with " + coins.size() + " coins.";
    }
}