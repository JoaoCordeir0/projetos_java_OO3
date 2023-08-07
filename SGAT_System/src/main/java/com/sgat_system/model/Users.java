package com.sgat_system.model;

/**
 *
 * @author joaoc
 */
public class Users {
    
    private int id; 
    private String name;
    private String cpf;
    private String birthDate;
    private String email;
    private String phone;
    private String password;
    public Object getId;
    
    // Construct 
    public Users(int id, String name, String cpf, String birthDate, String email, String phone, String password)
    {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    // Sets
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        
    // Gets
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }    
}
