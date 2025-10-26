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

    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOvertimeHours() * 1.5 * payRate);
    }

    public float getRegularHours() {
        //tertiary operator - if the hoursworked should be 40, if its over 40 itll stop
        return (hoursWorked > 40) ? 40 : hoursWorked;
    }

    public float getOvertimeHours() {
        return (hoursWorked > 40) ? hoursWorked - 40 : 0;
    }

    public double punchInTime = 0;

    public void punchIn(double time) {
        this.punchInTime = time;
    }
        public void punchIn(){
        LocalTime localTime = LocalTime.now();
        this.punchInTime = localTime.getHour() + ((double) localTime.getMinute() / 60);
}
    public void punchOut(){
//        LocalTime lt = LocalTime.now();
//        double punchOutAsDouble =  lt.getHour() + ((double) lt.getMinute() / 60);
//        this.hoursWorked += (float) (punchOutAsDouble - this.punchInTime);
//
        LocalTime lt = LocalTime.now();
        this.hoursWorked += (float) ( lt.getHour() + ((double) lt.getMinute() / 60) - this.punchInTime);

    }

    public void punchTimeCard(double checkInTime, double checkOutTime){
        this.hoursWorked += (float) (checkOutTime - checkInTime);
    }

    public void logHours(float hours){
        this.hoursWorked += hours;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", payRate=" + payRate +
                ", hoursWorked=" + hoursWorked +
                ", getTotalPay()=" + getTotalPay() +
                ". getRegularHours()=" + getRegularHours() +
                ", getOvertimeHours()=" + getOvertimeHours() +
                '}';
    }
}

//vehicle first, does not have a dependency (shape of a thing)
//dealership class - leave a lot of things empty - null. should be empty , part wont work until later phase
//file manager class after - 2 mthods , can decide if static or instance members - inside method reads from file/ create save to save info from the file and save it to the file
// phase 2 build file manager
//phase 3 - user interface, one method for eac hmenu item, will start empty , do display first to test out what youve got
//init loads date from file manager
//displayVehicle() will show you all
//get one filter done first to show youve got the pattern down
//working through bugs
//going back and filling out bugs / pieces youve missed
//refrence capstone, previous workshops
//datafile will be a csv file
//