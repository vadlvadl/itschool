package com.lizogub.OOPLesson6;

public class EmployeeHourlyPay extends Worker implements EmployeeInterface {

    private double daysPerMonth = 20.8;
    private double hoursPerDay = 8;

    public EmployeeHourlyPay(String name) {
        super(name);
    }

    @Override
    public double getSalary() {
        return daysPerMonth * hoursPerDay * pay;
    }
}
