package com.accenture.lkm.collection.assignment.comparator;

import java.util.Collections;
import java.util.List;

public class CourseService {

	// Method which helps to print courses sorted based on course fee

	public void printAllCoursesFeesSorted(List<Course> courses) {

		// TODO
		Collections.sort(courses, new SortByFeesComparator());
		System.out.println("Courses sorted by Fee:");
		courses.forEach(c -> 
			System.out.println("Course: " + c.getCourseName() + ", Fee: ₹" + c.getCourseFee()));


		// Sort the collection by calling Collections.sort method by passing comparator
		// object

		// Print course name and fee using foreach method

	}

	public void printAllCoursesNamesSorted(List<Course> courses) {

		// TODO
		Collections.sort(courses, new SortByNameComparator());
		System.out.println("Courses sorted by Name:");
		courses.forEach(c -> 
			System.out.println("Course: " + c.getCourseName() + ", Fee: ₹" + c.getCourseFee()));


		// Sort the collection by calling Collections.sort method

		// Print course name and fee using foreach method

		// Sort the collection by calling Collections.sort method by passing comparator
		// object

		// Print course name and fee using foreach method

	}

}
