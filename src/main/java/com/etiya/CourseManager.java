package com.etiya;

import java.util.List;

public class CourseManager {
    List<Course> addCourse(List<Course> courses, Course course){
        courses.add(course);
        return courses;
    }

    void printCourseInfos(Course course){
        System.out.println("Course ID : " + course.getId());
        System.out.println("Course Title : " + course.getTitle());
        System.out.println("Course Code : " + course.getCode());
        System.out.println("Course Programming Language : " + course.getProgrammingLanguage());
    }
}
