package com.accenture.lkm.inheritance;

public class Tester {

	public static void main(String[] args) {
		        
		        // Creating Developer object and setting values
		        Developer dev = new Developer();
		        dev.setEmpId(101);
		        dev.setEmpName("Alice Johnson");
		        dev.setAge(28);
		        dev.setProjectName("Banking App");
		        dev.setProjectDuratoin("6 months");

		        // Creating Manager object and setting values
		        Manager mgr = new Manager();
		        mgr.setEmpId(201);
		        mgr.setEmpName("Robert Smith");
		        mgr.setAge(40);
		        mgr.setNoOfProjectsManaged(5);

		        // Display Developer details
		        System.out.println("=== Developer Details ===");
		        System.out.println("ID: " + dev.getEmpId());
		        System.out.println("Name: " + dev.getEmpName());
		        System.out.println("Age: " + dev.getAge());
		        System.out.println("Project Name: " + dev.getProjectName());
		        System.out.println("Project Duration: " + dev.getProjectDuratoin());

		        // Display Manager details
		        System.out.println("\n=== Manager Details ===");
		        System.out.println("ID: " + mgr.getEmpId());
		        System.out.println("Name: " + mgr.getEmpName());
		        System.out.println("Age: " + mgr.getAge());
		        System.out.println("Projects Managed: " + mgr.getNoOfProjectsManaged());

		
		}
}

