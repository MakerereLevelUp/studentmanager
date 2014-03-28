package org.levelup.studentmanager;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ResidentStudentTest {
    @Test
    public void FeesShouldIncludeTutionAndAccommodation(){
        Student resident = new ResidentStudent("Musa", "3900292");
        assertThat(resident.getFees(), is(800000));
    }
}
