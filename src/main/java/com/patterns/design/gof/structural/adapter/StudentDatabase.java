package com.patterns.design.gof.structural.adapter;

public class StudentDatabase {
    public void saveStudent(){
        System.out.println("Saving...");
    }

    public void updateStudent(){
        System.out.println("Updating...");
    }

    public void loadStudent(){
        System.out.println("Loading...");
    }

    public void removeStudent() {
        System.out.println("Removing...");
    }
}
