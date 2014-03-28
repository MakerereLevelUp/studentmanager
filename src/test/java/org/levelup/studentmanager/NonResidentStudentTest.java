
package org.levelup.studentmanager;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NonResidentStudentTest {
    @Test
    public void FeesShouldBeOnlyTution(){
        Student noresident = new NonResidentStudent("Musa", "3900292");
        assertThat(noresident.getFees(), is(500000));
    }
}
