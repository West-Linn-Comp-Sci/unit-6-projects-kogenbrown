public class Album {
    private String name, artist;
    private int tracks;
    private double playTime;
    public Album(String n, String a, int t, double pt) {
        name = n;
        artist = a;
        tracks = t;
        playTime = pt;
    }
    public Album() {
        name = "Empty Album Slot";
        artist = "";
        tracks = 0;
        playTime = 0;
    }
    public String toString() {
        if(name.equals("")) return null;
        return artist + " - " + name;
    }
    public String getTitle() {
        return name;
    }
    public String getArtist() {
        return artist;
    }
}