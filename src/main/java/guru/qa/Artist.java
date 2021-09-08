package guru.qa;

import java.util.ArrayList;
import java.util.List;

public class Artist {
    private int id;
    private String name;
    private boolean isFavorite;
    private int listeners;
    private List<Album> albums = new ArrayList<>();
    private boolean isDead;

    public Artist(int id, int listeners, boolean isDead) {
        this.id = id;
        this.listeners = listeners;
        this.isDead = isDead;
    }

    void addAlbum(Album album) {
        albums.add(album);
    }

    void resurrect() {
        this.isDead = false;
    }

    void printAlbums() {
        for (Album album : albums) {
            System.out.println(album.getName());
        }
    }

    void checkIfAllive() {
        if (!isDead) {
            System.out.println("Артист жив");
        } else {
            System.out.println("Сожалеем");
        }
    }
}
