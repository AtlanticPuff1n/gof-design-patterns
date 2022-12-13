package com.patterns.design.gof.behavioral.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        String studentCode = "1F245";
        String[] subjects = {"Math, Theory Probability, Statistics, Optimization Methods, Network"};
        Student student = new Student(studentCode, subjects);

        Iterator iterator = student.getIterator();
        System.out.println("Student Code: " + student.getCode());
        System.out.println("Subjects: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "\t");
        }
    }
}
