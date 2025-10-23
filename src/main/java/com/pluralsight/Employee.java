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

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

   public double getTotalPay(){
        return (getRegularHours() * payRate) + (getOvertimeHours() * 1.5 * payRate);
   }

   public float getRegularHours(){
        //tertiary operator - if the hoursworked should be 40, if its over 40 itll stop
        return (hoursWorked > 40) ? 40 : hoursWorked;
   }
   public float getOvertimeHours(){
        return (hoursWorked > 40) ? hoursWorked - 40 : 0;
   }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", payRate=" + payRate +
                ", hoursWorked=" + hoursWorked +
                ", getTotalPay=" + getTotalPay() +
                ", getRegularHours()=" + getRegularHours() +
                ", getOvertimeHours()=" + getOvertimeHours() +
                '}';
    }
}

