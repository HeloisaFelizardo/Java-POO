package com.example.demo;

public class MainProgram {

    public static void main(String[] args) {
        ExerciseManagement management = new ExerciseManagement();
        Exercise exercise1 = new Exercise("New exercise 1");
        Exercise exercise2 = new Exercise("New exercise 2");

        management.add(exercise1.getName());
        management.markAsCompleted(exercise1.getName());
        management.add(exercise2.getName());
        management.markAsCompleted(exercise2.getName());

        System.out.println("Exercise List: " + management.exerciseList()); 
        
        int progress = partsCompleted(management);
        System.out.println("Progress: " + progress);
    }

      public static int partsCompleted(ExerciseManagement management) {
        int completedCount = 0;
        for (String exercise : management.exerciseList()) {
            if (management.isCompleted(exercise)) {
                completedCount++;
            }
        }
        return completedCount;
    }
}