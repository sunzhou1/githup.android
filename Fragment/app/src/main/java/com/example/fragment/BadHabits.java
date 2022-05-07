package com.example.fragment;

import java.io.Serializable;

public class BadHabits implements Serializable {
    String title;
    String time;
    boolean isSovle;

    public BadHabits(String title, String time, boolean isSovle) {
        this.title = title;
        this.time = time;
        this.isSovle = isSovle;
    }

    @Override
    public String toString() {
        return "BadHabits{" +
                "title='" + title + '\'' +
                ", time='" + time + '\'' +
                ", isSovle=" + isSovle +
                ", imageId=" + imageId +
                '}';
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    int imageId;


    public boolean isSovle() {
        return isSovle;
    }

    public void setSovle(boolean sovle) {
        isSovle = sovle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public BadHabits() {
    }

    public BadHabits(String title, String time) {
        this.title = title;
        this.time = time;
    }
}
