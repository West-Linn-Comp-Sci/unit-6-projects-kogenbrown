public class MusicLibrary {
    private int numAlbumSlots, numAlbums;
    private Album[] albums;
    private boolean isAlphabetizedByTitle = false, isAlphabetizedByArtist = false;
    public MusicLibrary() {
        albums = new Album[10];
        numAlbumSlots = albums.length;
        numAlbums = 0;
    }
    public void add(Album a) {
        if(numAlbumSlots > numAlbums) {
            albums[numAlbums] = a;
            System.out.println("Added " + a + " to music library");
            isAlphabetizedByTitle = false;
            isAlphabetizedByArtist = false;
            numAlbums += 1;
        }
    }
    public void remove(int index) {
        Album[] temp = new Album[numAlbumSlots];
        for (int i = 0; i < numAlbumSlots; i++) {
            if(i<numAlbumSlots-1) {
                if(i < index) {
                    temp[i] = albums[i];
                } else if (i >= index) {
                    temp[i] =albums[i+1];
                }
            }
        }
        System.out.println("Removed album " + albums[index] + " (index " + index + ")");
        albums=temp;
        numAlbums--;
    }
    public void doubleSize() {
        numAlbumSlots*=2;
        Album[] temp = new Album[albums.length];
        for(int i = 0; i < albums.length; i++) {
            temp[i] = albums[i];
        }
        albums = new Album[numAlbumSlots];
        for(int i = 0; i < numAlbumSlots/2; i++) {
            albums[i] = temp[i];
        }
        System.out.println("Doubled number of album slots");
    }
    public String toString() {
        String out = "Number of album slots: " + numAlbumSlots + "\n";
        for(int i = 0; i < numAlbums; i++) {
            out = out + "Album" + " " + i + ": " + albums[i] + "\n";
        }
        return out;
    }
    public int linearSearchTitle (String target) {
        for (int i = 0; i < numAlbums; i++) {
            if(albums[i].getTitle().equals(target)) {
                return i;
            }
        }
        return -1;
    }
    public int linearSearchArtist (String target) {
        for (int i = 0; i < numAlbums; i++) {
            if(albums[i].getArtist().equals(target)) {
                return i;
            }
        }
        return -1;
    }
    public int binarySearchTitle (String target) {
        int low = 0, high = numAlbums - 1, middle = (low + high) /2;
        if(isAlphabetizedByTitle) {
            while(!albums[middle].getTitle().equalsIgnoreCase(target) && low <= high) {
                if (target.compareToIgnoreCase(albums[middle].getTitle())<0)
                    high = middle - 1;
                else
                    low = middle  + 1;
                middle = (low + high)/2;
            }
            if(albums[middle].getTitle().equalsIgnoreCase(target))
                return middle;
            else
                return -1;
        }
        return -2;
    }
    public int binarySearchArtist (String target) {
        int low = 0, high = numAlbums - 1, middle = (low + high) /2;
        if(isAlphabetizedByArtist) {
            while(!albums[middle].getArtist().equalsIgnoreCase(target) && low <= high) {
                if (target.compareToIgnoreCase(albums[middle].getArtist())<0)
                    high = middle - 1;
                else
                    low = middle  + 1;
                middle = (low + high)/2;
            }
            if(albums[middle].getArtist().equalsIgnoreCase(target))
                return middle;
            else
                return -1;
        }
        return -2;
    }
    /*public void sortByTitle() {
        int min;
        Album temp;
        for(int i = 0; i < numAlbums - 1; i++) {
            min = i;
            for(int scan = i + i; scan < numAlbums; scan++) {
                if(albums[scan].getTitle().compareToIgnoreCase(albums[min].getTitle()) <= 0)
                    min = scan;
            }
            temp = albums[min];
            albums[min] = albums[i];
            albums[i] = temp;
        }
        isAlphabetizedByTitle=true;
    }*/
    public void sortByArtist() {
        for(int i = 1; i<numAlbums;i++) {
            Album key = albums[i];
            int position = i;
                while (position > 0 && albums[position - 1].getArtist().compareToIgnoreCase(key.getArtist()) > 0) {
                albums[position] = albums[position-1];
                position--;
            }
            albums[position] = key;
        }
        isAlphabetizedByArtist=true;
    }
    public void sortByTitle() {
        for(int i = 1; i<numAlbums;i++) {
            Album key = albums[i];
            int position = i;
            while (position > 0 && albums[position - 1].getTitle().compareToIgnoreCase(key.getTitle()) > 0) {
                albums[position] = albums[position-1];
                position--;
            }
            albums[position] = key;
        }
        isAlphabetizedByTitle=true;
    }
}