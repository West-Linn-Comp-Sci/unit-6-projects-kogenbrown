import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class MusicLibraryClient {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("First", "one Guy", 10, 42.5);
        Album a2 = new Album("This Music", "Some Band", 9, 36);
        Album a3 = new Album("Play", "People", 12, 39.1);
        Album a4 = new Album("I Ain't Marching Anymore", "Phil Ochs", 15, 53.5);
        Album a5 = new Album("The New Abnormal", "The Strokes", 9, 45);
        Album a6 = new Album("Minecraft Volume Alpha", "C418", 24, 60);
        Album a7 = new Album("Fuzzybrain", "Dayglow", 10, 37);
        Album a8 = new Album("OK Computer", "Radiohead", 12, 53.5);
        Album a9 = new Album("The Stranger", "Billy Joel", 9, 42.5);
        Album a10 = new Album("BALLADS 1","Joji",12, 35);

        myLibrary.add(a1);
        myLibrary.add(a2);
        myLibrary.add(a4);
        myLibrary.add(a5);
        myLibrary.add(a6);
        myLibrary.add(a7);
        myLibrary.add(a8);
        myLibrary.add(a9);
        myLibrary.add(a10);

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.doubleSize();

        System.out.println(myLibrary);
        System.out.println("Using linear search to find album BALLADS 1");
        System.out.println("Album BALLADS 1 found at index " + myLibrary.linearSearchTitle("BALLADS 1"));
        System.out.println("Using linear search to find artist Billy Joel");
        System.out.println("Artist Billy Joel found at index " + myLibrary.linearSearchArtist("Billy Joel"));
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.remove(1);
        myLibrary.add(a3);
        System.out.println(myLibrary);
        myLibrary.sortByTitle();
        System.out.println("Sorting by title");
        System.out.println(myLibrary);
        System.out.println("Using binary search to find album OK Computer");
        System.out.println("Found album OK Computer at index " +myLibrary.binarySearchTitle("OK Computer"));

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        System.out.println("Sorting by Artist");
        myLibrary.sortByArtist();
        System.out.println(myLibrary);

        System.out.println();
        System.out.println("Using binary search to find artist Phil Ochs");
        System.out.println("Artist Phil Ochs found at index " + myLibrary.binarySearchArtist("Phil Ochs"));


    }
}