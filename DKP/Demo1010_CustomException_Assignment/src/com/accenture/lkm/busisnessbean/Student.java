package com.accenture.lkm.busisnessbean;

public class Student {
	private Integer studId;
	private String studName;
	private Double studMark1;
	private Double studMark2;
	private Double studMark3;
	
	public Student() {
		super();
	}
	public Student(Integer studId, String studName, Double studMark1, Double studMark2, Double studMark3) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studMark1 = studMark1;
		this.studMark2 = studMark2;
		this.studMark3 = studMark3;
	}
	public Integer getStudId() {
		return studId;
	}
	public void setStudId(Integer studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public Double getStudMark1() {
		return studMark1;
	}
	public void setStudMark1(Double studMark1) {
		this.studMark1 = studMark1;
	}
	public Double getStudMark2() {
		return studMark2;
	}
	public void setStudMark2(Double studMark2) {
		this.studMark2 = studMark2;
	}
	public Double getStudMark3() {
		return studMark3;
	}
	public void setStudMark3(Double studMark3) {
		this.studMark3 = studMark3;
	}
	
}
