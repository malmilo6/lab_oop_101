package edu.faf.oop.Person;

import java.util.Random;

public class Customer extends Person {
    private final String gender;
    private final double money;
    private String customerType;
    public double payedAmount;
    public Customer(String name, String gender, String itemId) {
        super(name, itemId);
        this.gender = gender;
        this.money = setRandomMoney();
    }

    public void identifyType() {
        if(age < 15) {
            customerType = "child";
        }
        if(age > 50) {
            customerType = "senior";
        }
        else
            customerType = "adult";
    }

    public String getCustomerType() {
        return customerType;
    }
    public String getGender() {
        return gender;
    }
    public double getMoney() {
        return money;
    }

    public double setRandomMoney()
    {
        Random random = new Random();
        return random.nextDouble(80-10) + 10;
    }

}
