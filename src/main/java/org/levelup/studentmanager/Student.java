package org.levelup.studentmanager;

public class Student {
    private static final int ACCOMMODATION_FEE = 300000;
    private String name;
    private String studentNumber;
    private boolean isResident;
    private final int TUITION = 500000;

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
        else   return TUITION;
    }
}
