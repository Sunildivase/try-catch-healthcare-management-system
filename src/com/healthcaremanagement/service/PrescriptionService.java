package com.healthcaremanagement.service;

import com.healthcaremanagement.model.Prescription;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PrescriptionService {

    private static Scanner scanner = new Scanner(System.in);

    private static HashMap<Integer, Prescription> prescriptions = new HashMap<>();

    void printPrescription(Prescription prescription){
        System.out.println(prescription);
    }

    public Prescription createPrescription(){

        try {
            System.out.println("please enter id");
            int prescriptionId = Integer.parseInt(scanner.nextLine());

            System.out.println("please enter person id");
            int personId = Integer.parseInt(scanner.nextLine());

            System.out.println("please enter prescription details");
            String prescriptionDetails = scanner.nextLine();

            Prescription prescription = new Prescription();
            prescription.setPrescriptionId(prescriptionId);
            prescription.setPersonId(personId);
            prescription.setPrescriptionDetails(prescriptionDetails);

            prescriptions.put(1, prescription);
        } catch (Exception e) {
            System.out.println("please enter valid input");
        }
        Prescription prescription = new Prescription();
        return prescription;
    }
    public void displayPrescription(){
        Set<Map.Entry<Integer, Prescription>> entrySet = prescriptions.entrySet();
        for(Map.Entry<Integer, Prescription> entry : entrySet){
            System.out.println("key: " +entry.getKey()+"| value: " +entry.getValue());
        }
    }
}
