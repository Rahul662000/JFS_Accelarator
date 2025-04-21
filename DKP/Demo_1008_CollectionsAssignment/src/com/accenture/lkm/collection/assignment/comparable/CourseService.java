package com.accenture.lkm.collection.assignment.comparable;

import java.util.Collections;
import java.util.List;

public class CourseService {

	public void printAllCoursesSorted(List<Course> courses) {
		// Sort using Comparable implementation
		Collections.sort(courses);

		// Print course name and fee
		System.out.println("Courses sorted by Fee:");
		courses.forEach(course -> 
			System.out.println("Course: " + course.getCourseName() + ", Fee: ₹" + course.getCourseFee()));
	}
}
