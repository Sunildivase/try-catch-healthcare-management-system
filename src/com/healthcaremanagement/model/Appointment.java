package com.healthcaremanagement.model;

import java.util.Objects;

public class Appointment {
    private int appointmentId;
    private int PersonId;
    private int doctorId;
    private int hospitalId;
    private int deptId;

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId=" + appointmentId +
                ", PersonId=" + PersonId +
                ", doctorId=" + doctorId +
                ", hospitalId=" + hospitalId +
                ", deptId=" + deptId +
                '}';
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getPersonId() {
        return PersonId;
    }

    public void setPersonId(int personId) {
        PersonId = personId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return getAppointmentId() == that.getAppointmentId() && getPersonId() == that.getPersonId() && getDoctorId() == that.getDoctorId() && getHospitalId() == that.getHospitalId() && getDeptId() == that.getDeptId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAppointmentId(), getPersonId(), getDoctorId(), getHospitalId(), getDeptId());
    }
}
