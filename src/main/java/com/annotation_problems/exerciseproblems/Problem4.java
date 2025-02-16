/*
Exercise 4: Create a Custom Annotation and Use It
✅ Problem Statement:
Create a custom annotation @TaskInfo to mark tasks with priority and assigned person.
🔹 Steps to Follow:
Define an annotation @TaskInfo with fields priority and assignedTo.
Apply this annotation to a method in TaskManager class.
Retrieve the annotation details using Reflection API.
*/

package com.annotation_problems.exerciseproblems;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

// Step 1: Define Custom Annotation
@Retention(RetentionPolicy.RUNTIME) // Make it available at runtime
@Target(ElementType.METHOD) // Can only be applied to methods
@interface TaskInfo {
    String priority();
    String assignedTo();
}

// Step 2: Use Annotation in TaskManager Class
class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "John Doe")
    public void completeTask() {
        System.out.println("Completing high-priority task...");
    }
}

// Step 3: Retrieve Annotation Details Using Reflection
public class Problem4 {
    public static void main(String[] args) {
        try {
            Method method = TaskManager.class.getMethod("completeTask");

            if (method.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
                System.out.println("Task Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
            }

            // Call the method to see its output
            TaskManager manager = new TaskManager();
            manager.completeTask();
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found.");
        }
    }
}