package org.levelup.studentmanager;

import java.util.ArrayList;
import java.util.List;

public class Student {
    protected static final Integer ACCOMMODATION_FEE = 300000;
    protected static final Integer TUITION = 500000;
    private String name;
    private String studentNumber;
    List<Course> courseList = new ArrayList<Course>();


    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public boolean getIsResident() {
        return false;
    }

    public Integer getFees() {
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
