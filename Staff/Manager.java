package edu.faf.oop.Staff;

import java.util.ArrayList;
import java.util.Random;

public class Manager extends Staff {

    private double monthIncome;
    private final ArrayList<Staff> employeeList = new ArrayList<>();

     public int monthCounter = 0;
    public Manager(String firstName, String lastName, double salary, int experience, String employmentDate,String itemId) {
        super(firstName, lastName, salary, experience, employmentDate,itemId);

    }

    public void manageEmployeeAdd(Staff staff){
        employeeList.add(staff);
    }
    public void manageEmployeeRemove(Staff staff){
        employeeList.remove(staff);
    }

    public void workingStatus() {
        boolean status;
        Random bool = new Random();
        status = bool.nextBoolean();

        if(status){
            System.out.println("Manager is hiring new staff\n");
        }
        else {
            System.out.println("Manager fired somebody(\n");
        }
    }

    public void showStatus(){
        boolean status;
        Random bool = new Random();
        status = bool.nextBoolean();
        if(status) {
            workingStatus();
        }
    }

    public void setMonthIncome(double income) {
        this.monthIncome += income;
    }
    public double getMonthIncome() {
        return this.monthIncome;
    }
    public void resetMonthIncome() {
        this.monthIncome = 0;
    }

    @Override
    public double getSalary() {
        return salary + experience*0.1*salary + 0.05*monthIncome;
    }
}
