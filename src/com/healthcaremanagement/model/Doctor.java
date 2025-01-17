package com.healthcaremanagement.model;

import java.util.Objects;

public class Doctor {

    private int doctorId;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String contactNo;
    private String speciality;
    private int experience;

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", speciality='" + speciality + '\'' +
                ", experience=" + experience +
                '}';
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return getDoctorId() == doctor.getDoctorId() && getAge() == doctor.getAge() && getExperience() == doctor.getExperience() && Objects.equals(getFirstName(), doctor.getFirstName()) && Objects.equals(getLastName(), doctor.getLastName()) && Objects.equals(getGender(), doctor.getGender()) && Objects.equals(getContactNo(), doctor.getContactNo()) && Objects.equals(getSpeciality(), doctor.getSpeciality());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDoctorId(), getFirstName(), getLastName(), getAge(), getGender(), getContactNo(), getSpeciality(), getExperience());
    }
}
