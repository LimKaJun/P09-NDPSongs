package sg.edu.rp.c346.id20026955.p09_ndpsongs;

import java.io.Serializable;

public class song implements Serializable {

    private int id;
    private String title;
    private String singers;
    private int yearReleased;
    private int stars;

    public song(String title, String singers, int yearReleased, int stars) {
        this.title = title;
        this.singers = singers;
        this.yearReleased = yearReleased;
        this.stars = stars;
    }

    public song(int id, String title, String singers, int yearReleased, int stars) {
        this.id = id;
        this.title = title;
        this.singers = singers;
        this.yearReleased = yearReleased;
        this.stars = stars;
    }

    public int getId() {
        return id;
    }

    public song setId(int id) {
        this.id = id;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSingers(String singers) {
        this.singers = singers;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getTitle() {
        return title;
    }

    public String getSingers() {
        return singers;
    }

    public int getYear() {
        return yearReleased;
    }

    public int getStars() {
        return stars;
    }
}