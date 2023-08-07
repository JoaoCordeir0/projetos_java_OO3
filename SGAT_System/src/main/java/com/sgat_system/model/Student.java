package com.sgat_system.model;

/**
 *
 * @author joaoc
 */
public class Student {
    
    private int idStudent;
    private String nameStudent;
    private String birthDateStudent;
    private String cpfStudent;
    private String emailStudent;
    private String phoneStudent;
    private double valueStudent;
    private int parcelsStudent;
    private String registerDate;

    public Student(int idStudent, String nameStudent, String birthDateStudent, String cpfStudent, String emailStudent, String phoneStudent, double valueStudent, int parcelsStudent, String registerDate) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.birthDateStudent = birthDateStudent;
        this.cpfStudent = cpfStudent;
        this.emailStudent = emailStudent;
        this.phoneStudent = phoneStudent;
        this.valueStudent = valueStudent;
        this.parcelsStudent = parcelsStudent;
        this.registerDate = registerDate;
    }

    // Gets
    public int getIdStudent() {
        return idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public String getBirthDateStudent() {
        return birthDateStudent;
    }

    public String getCpfStudent() {
        return cpfStudent;
    }

    public String getEmailStudent() {
        return emailStudent;
    }

    public String getPhoneStudent() {
        return phoneStudent;
    }

    public double getValueStudent() {
        return valueStudent;
    }

    public int getParcelsStudent() {
        return parcelsStudent;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    //Sets
    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void setBirthDateStudent(String birthDateStudent) {
        this.birthDateStudent = birthDateStudent;
    }

    public void setCpfStudent(String cpfStudent) {
        this.cpfStudent = cpfStudent;
    }

    public void setEmailStudent(String emailStudent) {
        this.emailStudent = emailStudent;
    }

    public void setPhoneStudent(String phoneStudent) {
        this.phoneStudent = phoneStudent;
    }

    public void setValueStudent(double valueStudent) {
        this.valueStudent = valueStudent;
    }

    public void setParcelsStudent(int parcelsStudent) {
        this.parcelsStudent = parcelsStudent;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }
}
