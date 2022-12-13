package com.patterns.design.gof.structural.adapter;

public interface Database {
    void select();
    void insert();
    void update();
    void delete();
}
