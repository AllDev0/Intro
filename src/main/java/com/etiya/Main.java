package com.etiya;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Course> courses;
    static List<Instructor> instructors;
    public static void main(String[] args) {
        courses = new ArrayList<>();
        instructors = new ArrayList<>();

        CourseInstructorManager courseInstructorManager = new CourseInstructorManager();
        CourseManager courseManager = new CourseManager();
        InstructorManager instructorManager = new InstructorManager();

        Course course1 = new Course(1);
        course1.setTitle("Introduction to Algorithms");
        course1.setProgrammingLanguage("C Programming Language");
        courses = courseManager.addCourse(courses, course1);
        courseManager.printCourseInfos(course1);

        Instructor instructor1 = new Instructor(1);
        instructor1.setName("Enes");
        instructor1.setAge(26);
        instructor1.setEmail("enesscann98@gmail.com");
        instructor1.setPhone("05012345678");
        instructors = instructorManager.addInstructor(instructors, instructor1);

        CourseInstructor courseInstructor1 = new CourseInstructor(course1.getId(), instructor1.getId());

    }
}