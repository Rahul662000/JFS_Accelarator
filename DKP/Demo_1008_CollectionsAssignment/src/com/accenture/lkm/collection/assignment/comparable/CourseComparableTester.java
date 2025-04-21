package com.accenture.lkm.collection.assignment.comparable;

import java.util.ArrayList;
import java.util.List;

public class CourseComparableTester {

	public static void main(String[] args) {
		
		// Create list of courses
		List<Course> courseList = new ArrayList<>();

		// Add Course objects
		courseList.add(new Course(101, "Java", 40, 5000));
		courseList.add(new Course(102, "Python", 35, 4500));
		courseList.add(new Course(103, "Web Development", 50, 6000));
		courseList.add(new Course(104, "Data Science", 60, 8000));

		// Call service to print sorted list
		CourseService service = new CourseService();
		service.printAllCoursesSorted(courseList);
	}
}
