package org.example;

public class Student {
    private Class_ class_;
    private long id;
    private String name;

    public Class_ getClass_() {
        return class_;
    }

    public void setClass_(Class_ class_) {
        this.class_ = class_;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    public Student(long id, String name, Class_ class_) {
        this.class_ = class_;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "class_=" + class_ +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
