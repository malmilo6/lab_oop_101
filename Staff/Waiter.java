package edu.faf.oop.Staff;
import edu.faf.oop.Person.Customer;
import edu.faf.oop.Staff.Cook;

import java.util.Random;


public class Waiter extends Staff{
    private double tipsForToday;
    private int clientsServed;
    private double waiterMonthIncomeP;
    public Waiter(String firstName, String lastName, double salary,
                  int experience, String employmentDate, double tips, String itemId) {
        super(firstName,lastName,salary,experience,employmentDate,itemId);
        tipsForToday = tips;

    }
    @Override
    public double getSalary() {
        return salary + experience*0.06*salary + waiterMonthIncomeP;
    }

    public void setWaiterMonthIncomeP(Manager manager) {
        this.waiterMonthIncomeP = manager.getMonthIncome()*0.03;
    }

    public void workingStatus() {
        String[] actions = new String[4];
        actions[0] = "Waiter is Busy\n";
        actions[1] = "Waiter is Serving the client\n";
        actions[2] = "Waiter is Free\n";
        actions[3] = "Waiter is very BUSY. Scrolling TikTok\n";
        Random randInt = new Random();
        int x = randInt.nextInt(1,4);
        System.out.println(actions[x-1]);
    }

    public void receiveTips(Customer customer) {
        Random randInt = new Random();
        tipsForToday += randInt.nextInt(20);
    }

    public double servingTime() {
        Random randTime = new Random();
        return 5.0 + randTime.nextDouble(15.0);

    }

    public boolean customerMood(Cook cook){
        if(servingTime() < 10 && !cook.foodStatus()) {
            return true;
        } else
            return false;
    }
}
