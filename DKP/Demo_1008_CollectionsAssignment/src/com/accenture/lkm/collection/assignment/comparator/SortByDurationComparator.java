package com.accenture.lkm.collection.assignment.comparator;

import java.util.Comparator;

public class SortByDurationComparator implements Comparator<Course> {

	@Override
	public int compare(Course arg0, Course arg1) {
		// TODO Auto-generated method stub
		return Integer.compare(arg0.getCourseDurationInHours(), arg1.getCourseDurationInHours());

	}

	//TODO
	
	//Override compare method to sort based on course duration

}
