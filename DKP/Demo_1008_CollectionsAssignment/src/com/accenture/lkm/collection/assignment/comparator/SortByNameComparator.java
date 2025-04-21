package com.accenture.lkm.collection.assignment.comparator;

import java.util.Comparator;

public class SortByNameComparator implements Comparator<Course> {

	@Override
	public int compare(Course o1, Course o2) {
		// TODO Auto-generated method stub
		return o1.getCourseName().compareTo(o2.getCourseName());
	}

	//TODO
	
	//Override compare method to sort based on course name

}
