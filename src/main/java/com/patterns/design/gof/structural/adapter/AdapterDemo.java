package com.patterns.design.gof.structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        Database database = new StudentDatabaseAdapter();
        database.select();
        database.delete();
        database.update();
        database.select();
    }
}
