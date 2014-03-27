package org.levelup.studentmanager;

public class Score {
    private int value;

    public Score(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Score score = (Score) o;

        if (value != score.value) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value;
    }

    public Score add(Score score) {
        return new Score(this.value+ score.value);
    }
}
