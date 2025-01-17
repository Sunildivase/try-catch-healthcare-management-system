package com.healthcaremanagement.service;

import com.healthcaremanagement.model.Person;

import java.util.*;

public class PersonService {

    private static Scanner scanner = new Scanner(System.in);

    private static HashMap<String , Person> persons = new HashMap<>();

    void printPerson(Person person){
        System.out.println(person);
    }

    public Person createPerson() {

        try {
            System.out.println("please enter id");
            int personId = Integer.parseInt(scanner.nextLine());

            System.out.println("please enter the type");
            String type = scanner.nextLine();

            System.out.println("please enter first name");
            String firstName = scanner.nextLine();

            System.out.println("please enter lastname");
            String lastName = scanner.nextLine();

            System.out.println("please enter age");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("please enter gender");
            String gender = scanner.nextLine();

            System.out.println("please enter contact number");
            String contactNo = scanner.nextLine();

            System.out.println("please enter alternate number");
            String alternateNumber = scanner.nextLine();

            System.out.println("please enter address");
            String address = scanner.nextLine();

            Person person = new Person();
            person.setPersonId(personId);
            person.setType(type);
            person.setFirstName(firstName);
            person.setLastName(lastName);
            person.setAge(age);
            person.setGender(gender);
            person.setContactNo(contactNo);
            person.setAlternateMobile(alternateNumber);
            person.setAddress(address);

            persons.put(String.valueOf(1),person);

        } catch (Exception e) {
            System.out.println("please enter valid inputs");
        }

        Person person = new Person();
        return person;

    }
    public void displayPerson(){
     Set<Map.Entry<String ,Person>> entrySet = persons.entrySet();
     for(Map.Entry<String ,Person> entry : entrySet){
         System.out.println("key: "+entry.getKey()+" "+"value: "+ entry.getValue());
     }
    }
}
