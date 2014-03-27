package org.levelup.studentmanager;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StudentTest {

    @Test
    public void shouldHaveAttributesCreatedWith(){
    Student student = new Student("Emily", "209019847", true);
    assertThat(student.getName(), is("Emily"));
    assertThat(student.getStudentNumber(), is("209019847"));
    assertTrue(student.getIsResident());
    }

    @Test
    public void shouldGetOnlyTuitionIfNotResident() throws Exception {
        Student student = new Student("Emily", "209019847", false);
        assertThat(student.getFees(), is(500000));

    }

    @Test
    public void shouldReturnBothTuitionAndAccomodationFeeIfResident() throws Exception {
        Student student = new Student("Emily", "209019847", true);
        assertThat(student.getFees(), is(800000));
    }
}