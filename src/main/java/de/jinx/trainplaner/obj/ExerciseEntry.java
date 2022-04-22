package de.jinx.trainplaner.obj;

public class ExerciseEntry {
    private String date;
    private int sets;
    private int reps;

    public ExerciseEntry(String date, int sets, int reps) {
        this.date = date;
        this.sets = sets;
        this.reps = reps;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }
}
