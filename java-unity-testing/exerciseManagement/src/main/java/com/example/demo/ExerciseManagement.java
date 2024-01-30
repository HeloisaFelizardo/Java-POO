package com.example.demo;

import java.util.ArrayList;

public class ExerciseManagement {
	private final ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        exercises.forEach(exercise -> {
            list.add(exercise.getName());
        });
        return list;
    }

    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }

    public void markAsCompleted(String exercise) {
        exercises.stream().filter(ex -> (ex.getName().equals(exercise))).forEachOrdered(ex -> {
            ex.setCompleted(true);
        });
    }

    public boolean isCompleted(String exercise) {
        for (Exercise ex : exercises) {
            if (ex.getName().equals(exercise)) {
                return ex.isCompleted();
            }
        }
        return false;
    }
}
