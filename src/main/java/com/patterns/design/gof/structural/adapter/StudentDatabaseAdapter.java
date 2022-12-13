package com.patterns.design.gof.structural.adapter;

public class StudentDatabaseAdapter extends StudentDatabase implements Database {
    @Override
    public void select() {
        saveStudent();
    }

    @Override
    public void insert() {
        loadStudent();
    }

    @Override
    public void update() {
        loadStudent();
    }

    @Override
    public void delete() {
        removeStudent();
    }
}
