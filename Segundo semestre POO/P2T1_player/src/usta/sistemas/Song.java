package usta.sistemas;

import java.util.Calendar;

/*
Author: Santiago Hernandez Molina
Date: Oct 06 2020
Description: This Class contain the attributes of Song
 */
public class Song {


    /*
attributes of the Class
     */
    private int id;
    private String name;
    private Calendar releaseDate;
    private int duration;

    public Song() {
    }

    public Song(int id, String name, Calendar releaseDate, int duration) {

        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.duration = duration;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;

    }

    public Calendar getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(Calendar releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
