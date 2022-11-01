package edu.faf.oop.LogIn;

import edu.faf.oop.Staff.Cook;
import edu.faf.oop.Staff.Waiter;

public class CustomerAccount extends LogIn{

    public boolean isServed = false;

    public CustomerAccount(String itemId) {
        super(itemId);
        customerId = "Customer";
        customerPassword = "CPassword";
    }

    public boolean checkLogIn()
    {
        if(inputId.equals(customerId) && inputPassword.equals(customerPassword)) {
            logInStatus = "Staff";
            System.out.println("Welcome, Dear Customer");
            return true;
        }
        else {
            System.out.println("Unrecognized user");
            return false;
        }
    }

    public void rateService(Waiter waiter, Cook cook) {
        if(waiter.servingTime() < 10 ) {
            System.out.println("Customer serving rate : Good service...\n");
        } else {
            System.out.println("Customer serving rate : Satisfactory service...\n");
        }
        if(waiter.servingTime() > 10 && !cook.foodStatus()) {
            System.out.println("Customer kitchen rate : Satisfactory food... \n");
        } else {
            System.out.println("Customer kitchen rate : Tasty food!");
        }
    }
}
