package org.levelup.studentmanager;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private static final int ACCOMMODATION_FEE = 300000;
    private static final int TUITION = 500000;
    private String name;
    private String studentNumber;
    private boolean isResident;
    List<Course> courseList = new ArrayList<Course>();


    public Student(String name, String studentNumber, boolean isResident) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.isResident = isResident;
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public boolean getIsResident() {
        return isResident;
    }

    public int getFees() {
        if (isResident) return TUITION + ACCOMMODATION_FEE;
        return TUITION;
    }

    public Score getTotalScore() {
        Integer totalValue = 0;
        for(Course course: courseList) {
            totalValue += course.getScore().getValue();
        }
        return new Score(totalValue);
    }

    public void sitForCourseExams() {
        courseList.add(new Course("BSE", new Score(87)));
        courseList.add(new Course("BIS", new Score(23)));
        courseList.add(new Course("DBMS", new Score(57)));
        courseList.add(new Course("BIT", new Score(45)));
    }
}
