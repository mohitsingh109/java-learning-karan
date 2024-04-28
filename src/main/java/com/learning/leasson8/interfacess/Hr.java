package com.learning.leasson8.interfacess;

public class Hr extends Person implements AccountDetails {

    private String accountNumber;

    private Double salary;

    public Hr(String name, String emailId, String accountNumber, Double salary) {
        super(name, emailId);
        this.accountNumber = accountNumber;
        this.salary = salary;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override // same as abstract function
    public Double getSalary() {
        return salary;
    }
}
