package edu.faf.oop;

import edu.faf.oop.LogIn.CustomerAccount;
import edu.faf.oop.Menu.Menu;
import edu.faf.oop.Order.Billing;
import edu.faf.oop.Person.Customer;
import edu.faf.oop.Staff.Cook;
import edu.faf.oop.Staff.Manager;
import edu.faf.oop.Staff.Security;
import edu.faf.oop.Staff.Waiter;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        Waiter waiter = new Waiter("Andrew","Kurek",500.0,2,
                "12/11/2019",15,"234AFS");
        CustomerAccount acc = new CustomerAccount("56234");
        Manager manager = new Manager("Steve","China",850.0,8,"09/12/2015","23r3rdA");
        Cook cook = new Cook("Tisha","Brown",700.0,7,"09/01/2018","*797DFAd");
        Security Security = new Security("Ray", "Goodson", 600.0, 12, "09/01/2015", "*797DFAd");

        manager.manageEmployeeAdd(cook);
        manager.manageEmployeeAdd(waiter);
        manager.manageEmployeeAdd(Security);

        Menu menu = new Menu("Classic menu","32234");
        Billing bill = new Billing(1010101,"CC","234AFA24");

        int counter = 1;
        while(true){
            int monthAttend;
            Random random = new Random();
            monthAttend = random.nextInt(1000-400)+400;

            for(int i = 0; i < monthAttend; i++) {
                Customer customer = new Customer("Average customer","undetermined","666999");
                manager.showStatus();
                waiter.workingStatus();
                cook.workingStatus();
                Security.workingStatus();
                bill.createOrder(menu);
                bill.releaseBill(customer, Security);
                acc.rateService(waiter,cook);

                if(waiter.customerMood(cook))
                {
                    System.out.println("---------Previous Customer invited his friends---------\n");
                    int inviteCustomer;
                    inviteCustomer = random.nextInt(10-5) + 5;
                    for(int j = 0; j < inviteCustomer; j++){
                        System.out.println("\n================NEW INVITED CLIENT================\n");
                        Customer invitedCustomer = new Customer("Average customer","undetermined","666999");
                        manager.showStatus();
                        waiter.workingStatus();
                        cook.workingStatus();
                        Security.workingStatus();
                        bill.createOrder(menu);
                        bill.releaseBill(invitedCustomer, Security);
                        acc.rateService(waiter,cook);
                        manager.setMonthIncome(customer.payedAmount);

                    }
                }
                manager.setMonthIncome(customer.payedAmount);
                Thread.sleep(10);
                System.out.println("\n================NEW CLIENT================\n");
            }

            System.out.println( "Months passed : " + counter );

            waiter.setExperience(1);
            manager.setExperience(1);
            manager.getExperience();
            Security.setExperience(1);
            cook.setExperience(1);

            waiter.setWaiterMonthIncomeP(manager);
            Security.setSecMonthIncomeP(manager);
            cook.setCookMonthIncomeP(manager);

            counter++;
            double sal = waiter.getSalary();
            System.out.println("==============================================\n");
            System.out.println("================MONTHLY SALARY================\n");
            System.out.println("Waiter Salary " +  waiter.getSalary() + "\n");
            System.out.println("Cook Salary " +  cook.getSalary() + "\n");
            System.out.println("Security Salary " +  Security.getSalary() + "\n");
            System.out.println("Manager Salary " + manager.getSalary() + "\n");

            System.out.println("Total month income - " + manager.getMonthIncome() + "\n");
            System.out.println("==============================================\n");

            manager.resetMonthIncome();
            Thread.sleep(10);

        }
    }
}