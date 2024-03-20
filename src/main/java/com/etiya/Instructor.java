package com.etiya;

public class Instructor extends Person{
    public Instructor(int id, String name, int age, String email, String phone) {
        super(id, name, age, email, phone);
    }

    public Instructor(int id) {
        super(id);
    }
}
