package guru.qa;

public class Main {

    public static void main(String[] args) {

        Artist guf = new Artist(1, 1000, true);
        Artist eminem = new Artist(2, 324125, false);
        Artist daveGrohl = new Artist(3, 24219, false);

        Album album1 = new Album("Album 1");
        Album album2 = new Album("Album 2");
        Album album3 = new Album("Album 3");

        guf.addAlbum(album1);
        guf.addAlbum(album2);
        guf.addAlbum(album3);

        guf.printAlbums();
        guf.resurrect();
        guf.checkIfAllive();

    }
}
