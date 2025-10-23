package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return (getRegularHours() * payRate + (getOvertimeHours() * 1.5 * payRate));
    }
    public double getRegularHours(){
        return (hoursWorked > 40) ? 40 : hoursWorked;
    }
    public float getOvertimeHours(){
        return (hoursWorked > 40) ? hoursWorked - 40 : 0;
    }

    private double punchInTime = 0;

    public void punchIn(double time){
        this.punchInTime = time;
    }


}
