package com.accenture.lkm.collection.assignment.comparator;

import java.util.Comparator;

public class SortByFeesComparator implements Comparator<Course> {

	@Override
	public int compare(Course o1, Course o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getCourseFee(), o2.getCourseFee());
	}

	//TODO
	
	//Override compare method to sort based on course fees

}
