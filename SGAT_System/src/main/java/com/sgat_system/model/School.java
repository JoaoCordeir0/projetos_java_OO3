package com.sgat_system.model;

/**
 *
 * @author joao.cordeiro
 */
public class School {
    
    private int idSchool; 
    private String nameSchool;
    private String phoneSchool;
    private String emailSchool;
    private String ufSchool;
    private String citySchool;
    private String neightborhoodSchool;
    private String streetSchool;
    private int numberSchool;

    public School(int idSchool, String nameSchool, String phoneSchool, String emailSchool, String ufSchool, String citySchool, String neightborhoodSchool, String streetSchool, int numberSchool) {
        this.idSchool = idSchool;
        this.nameSchool = nameSchool;
        this.phoneSchool = phoneSchool;
        this.emailSchool = emailSchool;
        this.ufSchool = ufSchool;
        this.citySchool = citySchool;
        this.neightborhoodSchool = neightborhoodSchool;
        this.streetSchool = streetSchool;
        this.numberSchool = numberSchool;
    }

    //Gets
    public int getIdSchool() {
        return idSchool;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public String getPhoneSchool() {
        return phoneSchool;
    }

    public String getEmailSchool() {
        return emailSchool;
    }

    public String getUfSchool() {
        return ufSchool;
    }

    public String getCitySchool() {
        return citySchool;
    }

    public String getNeightborhoodSchool() {
        return neightborhoodSchool;
    }

    public String getStreetSchool() {
        return streetSchool;
    }

    public int getNumberSchool() {
        return numberSchool;
    }

    // Sets
    public void setIdSchool(int idSchool) {
        this.idSchool = idSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public void setPhoneSchool(String phoneSchool) {
        this.phoneSchool = phoneSchool;
    }

    public void setEmailSchool(String emailSchool) {
        this.emailSchool = emailSchool;
    }

    public void setUfSchool(String ufSchool) {
        this.ufSchool = ufSchool;
    }

    public void setCitySchool(String citySchool) {
        this.citySchool = citySchool;
    }

    public void setNeightborhoodSchool(String neightborhoodSchool) {
        this.neightborhoodSchool = neightborhoodSchool;
    }

    public void setStreetSchool(String streetSchool) {
        this.streetSchool = streetSchool;
    }

    public void setNumberSchool(int numberSchool) {
        this.numberSchool = numberSchool;
    }

          
}
