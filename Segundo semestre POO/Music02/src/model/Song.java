


        /*
         * To change this license header, choose License Headers in Project Properties.
         * To change this template file, choose Tools | Templates
         * and open the template in the editor.
         */
        package model;

        import java.util.Objects;

        /**
 *
 * @author Diego Alexander Guerrero Campos
 */
public class Song {
    //Attributes
    int id;
    private String name_song;
    private String cultural_types;
    private String musical_genre;
    private int release_date;
    private int time;
    private boolean qualification;

    //Constructors

    public Song(int id, String name_song, String cultural_types, String musical_genre, int release_date, int time, boolean qualification) {
        this.id = id;
        this.name_song = name_song;
        this.cultural_types = cultural_types;
        this.musical_genre = musical_genre;
        this.release_date = release_date;
        this.time = time;
        this.qualification = qualification;
    }


    //Setter & Getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_song() {
        return name_song;
    }

    public void setName_song(String name_song) {
        this.name_song = name_song;
    }

    public String getCultural_types() {
        return cultural_types;
    }

    public void setCultural_types(String cultural_types) {
        this.cultural_types = cultural_types;
    }

    public String getMusical_genre() {
        return musical_genre;
    }

    public void setMusical_genre(String musical_genre) {
        this.musical_genre = musical_genre;
    }

    public int getRelease_date() {
        return release_date;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isQualification() {
        return qualification;
    }

    public void setQualification(boolean qualification) {
        this.qualification = qualification;
    }


    //toString


    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name_song='" + name_song + '\'' +
                ", cultural_types='" + cultural_types + '\'' +
                ", musical_genre='" + musical_genre + '\'' +
                ", release_date=" + release_date +
                ", time=" + time +
                ", qualification=" + qualification +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return id == song.id &&
                release_date == song.release_date &&
                time == song.time &&
                qualification == song.qualification &&
                name_song.equals(song.name_song) &&
                cultural_types.equals(song.cultural_types) &&
                musical_genre.equals(song.musical_genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name_song, cultural_types, musical_genre, release_date, time, qualification);
    }
}