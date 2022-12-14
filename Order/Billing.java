package edu.faf.oop.Order;

import edu.faf.oop.Person.Customer;
import edu.faf.oop.Staff.Security;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Billing extends Order{

    private final String date;
    private final String paymentType;
    LocalDateTime now = LocalDateTime.now();


    public Billing(long orderNumber, String paymentType, String itemId) {
        super(orderNumber,itemId);
        this.paymentType = paymentType;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        this.date = dtf.format(now);
    }

    public void releaseBill(Customer customer, Security security){
        customer.identifyType();
        if(customer.getMoney() >= totalPrice) {
            String check = customer.getCustomerType();
            double discountedPrice;
            if (check.equals("child")) {
                discountedPrice = totalPrice - totalPrice * 0.08;
                totalPrice = discountedPrice;
            }
            if (check.equals("senior")) {
                discountedPrice = totalPrice - totalPrice * 0.1;
                totalPrice = discountedPrice;
            }
            System.out.println("Customer asked for a bill.\n");
            customer.payedAmount = totalPrice;
            System.out.println("Bill ID - " + generateIntId() + "\n");
            System.out.println("Ordered food - " + getOrderedFood() + "\n");
            System.out.println("Amount to be payed - " + totalPrice + "\n");
            System.out.println("Payment Type - " + paymentType + "\n");
            System.out.println("Date - " + date + "\n");
        }
        else {
            System.out.println("No enough money");
            System.out.println("Customer is trying to leave the restaurant....");
            if (security.badCustomer()) {
                System.out.println("Manager is calling the police\n");
            }
        }


    }
}
