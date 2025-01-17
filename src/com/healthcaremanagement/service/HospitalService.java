package com.healthcaremanagement.service;

import com.healthcaremanagement.model.Hospital;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HospitalService {

    private static Scanner scanner = new Scanner(System.in);

    private Map<Integer, Hospital> hospitals = new HashMap<>();

    void printHospital(Hospital hospital){
        System.out.println(hospital);
    }

    public Hospital createHospital() {

        try{

        System.out.println("please enter id ");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital name ");
        String hospitalName = scanner.nextLine();

        System.out.println("please enter hospital address ");
        String hospitalAddress = scanner.nextLine();

        System.out.println("please enter contact number");
        String contactNo = scanner.nextLine();

        System.out.println("please enter email id");
        String emailId = scanner.nextLine();

        Hospital hospital = new Hospital();
        hospital.setHospitalId(hospitalId);
        hospital.setHospitalName(hospitalName);
        hospital.setHospitalAddress(hospitalAddress);
        hospital.setContactNo(contactNo);
        hospital.setEmailId(emailId);

        hospitals.put(1, hospital);
    }
    catch(Exception e){

        System.out.println("please enter valid inputs");
    }
        Hospital hospital = new Hospital();
        return hospital;

    }
    public void displayHospital(){

        Set<Map.Entry<Integer,Hospital>> entrySet = hospitals.entrySet();
        for(Map.Entry<Integer,Hospital> hospitalEntry : entrySet){
            System.out.println("key :"+hospitalEntry.getKey()+"| value: "+hospitalEntry.getValue());
        }
    }
}
