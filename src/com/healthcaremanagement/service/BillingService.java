package com.healthcaremanagement.service;

import com.healthcaremanagement.model.Billing;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Set;

public class BillingService {

    private static Scanner scanner =new Scanner(System.in);

    private static HashMap<Integer, Billing> billings = new HashMap<>();

    void printBilling(Billing billing){
        System.out.println(billing);
    }

    public Billing createBilling(){

        try {
            System.out.println("please enter bill id");
            int billId = Integer.parseInt(scanner.nextLine());

            System.out.println("please enter bill");
            int bill = Integer.parseInt(scanner.nextLine());

            System.out.println("please enter total bill");
            int totalBill = Integer.parseInt(scanner.nextLine());

            System.out.println("please enter person id");
            int personId = Integer.parseInt(scanner.nextLine());

            Billing billing = new Billing();
            billing.setBillId(billId);
            billing.setBill(bill);
            billing.setTotalBill(totalBill);
            billing.setPersonId(personId);

            billings.put(1, billing);
        } catch (Exception e) {
            System.out.println("please enter valid input");
        }
        Billing billing = new Billing();
        return billing;
    }
    public void displayBilling(){
        Set<Map.Entry<Integer,Billing>> entrySet = billings.entrySet();
        for(Map.Entry<Integer,Billing> billingEntry:entrySet){
            System.out.println("key: "+billingEntry.getKey()+ "value: "+billingEntry.getValue());
        }

    }
}
