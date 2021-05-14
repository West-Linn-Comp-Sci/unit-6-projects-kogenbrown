public class Person {
    private int myAge;
    private String myName;
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
    public String toString() {
        return this.myName + ", (" + this.myAge + ")";
    }
}