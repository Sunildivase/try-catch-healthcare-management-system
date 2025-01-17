package com.healthcaremanagement.service;

import com.healthcaremanagement.model.Doctor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DoctorService {
    private static Scanner scanner = new Scanner(System.in);

    private Map<Integer, Doctor> doctors = new HashMap<>();

    void printDoctor(Doctor doctor) {
        System.out.println(doctor);
    }

    public Doctor createDoctor() {

        try {
            System.out.println("please enter id ");
            int doctorId = Integer.parseInt(scanner.nextLine());

            System.out.println("please enter first name");
            String firstName = scanner.nextLine();

            System.out.println("please enter last name");
            String lastName = scanner.nextLine();

            System.out.println("please enter age");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("please enter gender");
            String gender = scanner.nextLine();

            System.out.println("please enter contact number");
            String contactNo = scanner.nextLine();

            System.out.println("please enter speciality");
            String speciality = scanner.nextLine();

            System.out.println("please enter experience");
            int experience = Integer.parseInt(scanner.nextLine());


            Doctor doctor = new Doctor();
            doctor.setDoctorId(doctorId);
            doctor.setFirstName(firstName);
            doctor.setLastName(lastName);
            doctor.setAge(age);
            doctor.setGender(gender);
            doctor.setContactNo(contactNo);
            doctor.setSpeciality(speciality);
            doctor.setExperience(experience);

            doctors.put(1, doctor);

        }catch (Exception e){
            System.out.println("please enter valid inputs");
        }
        Doctor doctor = new Doctor();
        return doctor;
    }

    public void displayDoctor() {
        Set<Map.Entry<Integer, Doctor>> entrySet = doctors.entrySet();
        for (Map.Entry<Integer, Doctor> doctorEntry : entrySet) {
            System.out.println("key: " + doctorEntry.getKey() + "| value: " + doctorEntry.getValue());
        }
    }
}
