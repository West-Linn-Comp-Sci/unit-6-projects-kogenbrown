import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListPractice {

    public void removeZeros(ArrayList<Integer> list) {
        for(int i=0;i<list.size();i++) {
            if(list.get(i)==0) list.remove(i--); 
        }
    }

    public int countLetters(ArrayList<String> list) {
        int sum=0;
        for(String s:list) sum+=s.length();
        return sum;
    }

    public int findPosition(int keyValue, ArrayList<Integer> list) {
        for(int i = 0;i<list.size();i++) if(list.get(i)==keyValue) return i;
        return -1;
    }

    public ArrayList<String> parseIntoArrayList(String s) {
        ArrayList<String> out = new ArrayList<String>();
        for(int i=0;i<s.length();i++) out.add(String.valueOf(s.charAt(i)));
        return out;
    }

    public String findMin(ArrayList<Person> list) {
        Person min = list.get(0);
        for(Person p:list) if(p.getAge()<min.getAge()) min=p;
        return min.getName();
    }
}

class Person {
    private int myName, myAge;
    public Person(int a, String n) {
        this.myAge=a;
        this.myName=n;
    }
    public int getAge() {
        return this.myAge;
    }
    public String getName() {
        return this.myName;
    }
}

class Coin {
    private double myValue;
    private String myName;
    public Coin(double value; String name) {
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

class Purse {
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
        return c.getName();
    }
}