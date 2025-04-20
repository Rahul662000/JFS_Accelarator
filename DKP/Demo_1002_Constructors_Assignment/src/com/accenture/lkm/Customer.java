package com.accenture.lkm;

public class Customer {

    private int custId;
    private String custName;
    private int age;

    public Customer(int custId, String custName, int age) {
        this.custId = custId;
        this.custName = custName;
        this.age = age;
    }

    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Customer Name : " + custName);
        System.out.println("Customer ID : " + custId);
        System.out.println("Customer Age : " + age);
    }



}
