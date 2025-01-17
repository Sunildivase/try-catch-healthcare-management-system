package com.healthcaremanagement.model;

import java.util.Objects;

public class Hospital {

    private int hospitalId;
    private String hospitalName;
    private String hospitalAddress;
    private String contactNo;
    private String emailId;

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalId=" + hospitalId +
                ", hospitalName='" + hospitalName + '\'' +
                ", hospitalAddress='" + hospitalAddress + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return getHospitalId() == hospital.getHospitalId() && Objects.equals(getHospitalName(), hospital.getHospitalName()) && Objects.equals(getHospitalAddress(), hospital.getHospitalAddress()) && Objects.equals(getContactNo(), hospital.getContactNo()) && Objects.equals(getEmailId(), hospital.getEmailId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHospitalId(), getHospitalName(), getHospitalAddress(), getContactNo(), getEmailId());
    }
}
