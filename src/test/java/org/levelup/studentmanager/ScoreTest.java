package org.levelup.studentmanager;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ScoreTest {
    @Test
    public void shouldGiveMark() throws Exception {
        Score score = new Score(78);
        assertThat(new Score(78), is(score));
    }

    @Test
    public void ShouldAddTwoScores() throws Exception {
        Score score1 = new Score(78);
        Score score2 = new Score(58);
        assertThat(score1.add(score2) ,is(new Score(136)));

    }
}
