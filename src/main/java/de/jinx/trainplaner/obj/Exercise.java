package de.jinx.trainplaner.obj;

import java.util.List;

public class Exercise {
    //Attributes
    int id;
    String name;
    String info;
    //Refrence Attributes
    List<MuscleGroups> targetedMuscles;
    List<ExerciseEntry> entries;

    public Exercise(int id, String name, String info, List<MuscleGroups> targetedMuscles, List<ExerciseEntry> entries) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.targetedMuscles = targetedMuscles;
        this.entries = entries;
    }
    public Exercise(int id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.targetedMuscles = null;
        this.entries = null;
    }

    //Getter & Setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public List<MuscleGroups> getTargetedMuscles() {
        return targetedMuscles;
    }

    public void setTargetedMuscles(List<MuscleGroups> targetedMuscles) {
        this.targetedMuscles = targetedMuscles;
    }

    public List<ExerciseEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<ExerciseEntry> entries) {
        this.entries = entries;
    }
}
