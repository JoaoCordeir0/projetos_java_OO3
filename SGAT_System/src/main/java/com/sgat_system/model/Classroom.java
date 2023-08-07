package com.sgat_system.model;

/**
 *
 * @author joaoc
 */
public class Classroom {
    
    private int idClass;
    private String nameStudentClass;
    private String nameInstructorClass;
    private String categoryClass;
    private String dayClass;
    private String timeClass;
    private String NameSchool;

    public Classroom(int idClass, String nameStudentClass, String nameInstructorClass, String categoryClass, String dayClass, String timeClass, String NameSchool) {
        this.idClass = idClass;
        this.nameStudentClass = nameStudentClass;
        this.nameInstructorClass = nameInstructorClass;
        this.categoryClass = categoryClass;
        this.dayClass = dayClass;
        this.timeClass = timeClass;
        this.NameSchool = NameSchool;
    }

    //Gets
    public int getIdClass() {
        return idClass;
    }

    public String getNameStudentClass() {
        return nameStudentClass;
    }

    public String getNameInstructorClass() {
        return nameInstructorClass;
    }

    public String getCategoryClass() {
        return categoryClass;
    }

    public String getDayClass() {
        return dayClass;
    }

    public String getTimeClass() {
        return timeClass;
    }

    public String getNameSchool() {
        return NameSchool;
    }

    //Sets
    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    public void setNameStudentClass(String nameStudentClass) {
        this.nameStudentClass = nameStudentClass;
    }

    public void setNameInstructorClass(String nameInstructorClass) {
        this.nameInstructorClass = nameInstructorClass;
    }

    public void setCategoryClass(String categoryClass) {
        this.categoryClass = categoryClass;
    }

    public void setDayClass(String dayClass) {
        this.dayClass = dayClass;
    }

    public void setTimeClass(String timeClass) {
        this.timeClass = timeClass;
    }

    public void setNameSchool(String NameSchool) {
        this.NameSchool = NameSchool;
    }  
}
