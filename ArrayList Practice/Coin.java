public class Coin {
    private double myValue;
    private String myName;
    public Coin(double value, String name) {
        this.myValue=value;
        this.myName=name;
    }
    public double getValue() {
        return this.myValue;
    }
    public String getName() {
        return this.myName;
    }
    public boolean equals(Coin aCoin) {
        return(this.myName.equals(aCoin.getName())&&this.myValue==aCoin.getValue());
    }
}