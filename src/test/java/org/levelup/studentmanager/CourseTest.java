package org.levelup.studentmanager;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CourseTest {
    @Test
    public void shouldCreateCourse() throws Exception {
        Course course = new Course("Programming methodology", new Score(43));
        assertThat("Programming methodology", is(course.makeCourse()));

    }

    @Test
    public void shouldReturnMarkAttachedToCourseUnit() throws Exception {
        Course course = new Course("Programming methodology", new Score(43));
        assertThat(new Score(43), is(course.getScore()));

    }
}
