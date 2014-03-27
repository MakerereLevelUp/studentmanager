package org.levelup.studentmanager;

public class Course {
    private String name;
    private Score score;

    public Course(String name, Score score) {
        this.name = name;
        this.score = score;
    }


    public String makeCourse() {
        return name;
    }

    public Score getScore() {
        return score;
    }
}