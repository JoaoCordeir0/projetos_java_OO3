package com.sgat_system.model;

/**
 *
 * @author joao.cordeiro
 */
public class UserAuth {
    
    private int idLogged;
    private String nameLogged;

    public UserAuth(int idLogged, String nameLogged) {
        this.idLogged = idLogged;
        this.nameLogged = nameLogged;
    }

    public int getIdLogged() {
        return idLogged;
    }

    public String getNameLogged() {
        return nameLogged;
    }

    public void setIdLogged(int idLogged) {
        this.idLogged = idLogged;
    }

    public void setNameLogged(String nameLogged) {
        this.nameLogged = nameLogged;
    }            
}
