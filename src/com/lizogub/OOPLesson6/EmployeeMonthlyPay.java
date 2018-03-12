package com.lizogub.OOPLesson6;

public class EmployeeMonthlyPay extends Worker implements EmployeeInterface {

    public EmployeeMonthlyPay(String name) {
        super(name);
    }

    @Override
    public double getSalary() {
        return pay;
    }
}
