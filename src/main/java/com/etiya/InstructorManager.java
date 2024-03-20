package com.etiya;

import java.util.List;

public class InstructorManager {
    List<Instructor> addInstructor(List<Instructor> instructors, Instructor instructor){
        instructors.add(instructor);
        return instructors;
    }
}
