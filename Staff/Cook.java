package edu.faf.oop.Staff;

import java.util.Random;

public class Cook extends Staff{

    private String cookType;
    private double cookMonthIncomeP;
    public Cook(String firstName, String lastName, double salary, int experience, String employmentDate,String itemId) {
        super(firstName, lastName, salary, experience, employmentDate,itemId);
    }

    public void setCookMonthIncomeP(Manager manager) {
        this.cookMonthIncomeP = manager.getMonthIncome() * 0.03;
    }
    public boolean preparingFood(){
        Random status = new Random();
        return status.nextBoolean();
    }
    public void workingStatus(){
        if(preparingFood()){
            System.out.println("Cook is preparing your order\n");
        } else {
            System.out.println("Cook is waiting for clients' orders\n");
        }
    }
    public boolean foodStatus() {
        Random rand = new Random();
        return rand.nextBoolean();
    }

    @Override
    public double getSalary() {
        return salary + experience*0.07*salary + cookMonthIncomeP;}
}
