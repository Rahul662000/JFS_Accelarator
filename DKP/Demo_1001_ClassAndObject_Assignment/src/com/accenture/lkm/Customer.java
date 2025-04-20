package com.accenture.lkm;

public class Customer {

    
    private int custId;
    private String custName; 
    private int custAge;
    public int getCustId() {
        return custId;
    }
    public void setCustId(int custId) {
        this.custId = custId;
    }
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public int getCustAge() {
        return custAge;
    }
    public void setCustAge(int custAge) {
        this.custAge = custAge;
    }

    public void display(){
        System.out.println("Customer Name : " + custName);
        System.out.println("Customer Id : " + custId);
        System.out.println("Customer Age : " + custAge );
    }

}
