package com.accenture.lkm.collection.assignment.comparator;

import java.util.ArrayList;
import java.util.List;

public class CourseComparatorTester {
	public static void main(String[] args) {

		// TODO

		List<Course> courseList = new ArrayList<>();

		courseList.add(new Course(201, "Java", 40, 5000));
		courseList.add(new Course(202, "Python", 35, 4500));
		courseList.add(new Course(203, "Web Development", 50, 6000));
		courseList.add(new Course(204, "Data Science", 60, 8000));

		CourseService service = new CourseService();
		
		service.printAllCoursesFeesSorted(courseList);
		System.out.println();

		service.printAllCoursesNamesSorted(courseList);
		// Create an ArrayList to store transaction objects

		// Create courses and add them to the ArrayList

		// Call print method of service class which prints transactions corresponding to
		// the account number

	}
}
