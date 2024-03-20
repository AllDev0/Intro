package com.etiya;

public class Student extends Person{
    public Student(int id, String name, int age, String email, String phone) {
        super(id, name, age, email, phone);
    }

    public Student(int id) {
        super(id);
    }
}
