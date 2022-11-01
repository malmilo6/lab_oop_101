package edu.faf.oop.Staff;

import java.util.Random;

public class Security extends Staff {

    public Security(String firstName, String lastName, double salary, int experience, String employmentDate, String itemId) {
        super(firstName, lastName, salary, experience, employmentDate, itemId);
    }

    private double secMonthIncomeP;
    @Override
    public void workingStatus() {
        boolean status;
        Random bool = new Random();
        status = bool.nextBoolean();

        if (status) {
            System.out.println("Security is sleeping...Zzzz\n");
        } else {
            System.out.println("Security is on eye!\n");
        }
    }

    public void setSecMonthIncomeP(Manager manager) {
        this.secMonthIncomeP = manager.getMonthIncome() * 0.02;
    }

    @Override
    public double getSalary(){
        return salary + experience*0.05*salary + secMonthIncomeP;
    }

    public boolean badCustomer() {
        boolean status;
        Random bool = new Random();
        status = bool.nextBoolean();

        System.out.println("Security is trying to catch running customer");
        if (status) {
            System.out.println("Customer is caught\n");
        } else {
            System.out.println("Successful escape\n ");
        }
        return status;
    }
}
