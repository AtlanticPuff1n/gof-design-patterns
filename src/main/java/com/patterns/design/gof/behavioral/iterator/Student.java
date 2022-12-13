package com.patterns.design.gof.behavioral.iterator;

public class Student implements Collection{
    private String code;
    private String[] subjects;

    public Student(String code, String[] subjects) {
        this.code = code;
        this.subjects = subjects;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public Iterator getIterator() {
        return new StudentIterator();
    }

    public class StudentIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < subjects.length;
        }

        @Override
        public Object next() {
            return subjects[index++];
        }
    }
}
