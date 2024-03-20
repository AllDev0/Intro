package com.etiya;

import java.util.List;

public class CourseInstructorManager {
    Course findCourseById(List<Course> courses, int courseId){
        for (Course course : courses){
            if (course.getId() == courseId){
                return course;
            }
        }
        return null;
    }

    Instructor findInstructorById(List<Instructor> instructors, int instructorId){
        for (Instructor instructor : instructors){
            if (instructor.getId() == instructorId){
                return instructor;
            }
        }
        return null;
    }
}
