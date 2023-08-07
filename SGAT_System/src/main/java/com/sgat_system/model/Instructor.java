/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sgat_system.model;

/**
 *
 * @author joao.cordeiro
 */
public class Instructor {
    
    private int idInstructor;
    private String nameInstructor;
    private String cpfInstructor;
    private String emailInstructor;
    private String phoneInstructor;       

    public Instructor(int idInstructor, String nameInstructor, String cpfInstructor, String emailInstructor, String phoneInstructor) {
        this.idInstructor = idInstructor;
        this.nameInstructor = nameInstructor;
        this.cpfInstructor = cpfInstructor;
        this.emailInstructor = emailInstructor;
        this.phoneInstructor = phoneInstructor;
    }

    public int getIdInstructor() {
        return idInstructor;
    }

    public String getNameInstructor() {
        return nameInstructor;
    }

    public String getCpfInstructor() {
        return cpfInstructor;
    }

    public String getEmailInstructor() {
        return emailInstructor;
    }

    public String getPhoneInstructor() {
        return phoneInstructor;
    }

    public void setIdInstructor(int idInstructor) {
        this.idInstructor = idInstructor;
    }

    public void setNameInstructor(String nameInstructor) {
        this.nameInstructor = nameInstructor;
    }

    public void setCpfInstructor(String cpfInstructor) {
        this.cpfInstructor = cpfInstructor;
    }

    public void setEmailInstructor(String emailInstructor) {
        this.emailInstructor = emailInstructor;
    }

    public void setPhoneInstructor(String phoneInstructor) {
        this.phoneInstructor = phoneInstructor;
    }        
}
