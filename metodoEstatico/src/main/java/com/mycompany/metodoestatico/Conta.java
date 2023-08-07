/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodoestatico;

/**
 *
 * @author joaoc
 */
public class Conta {
    private static int ultimoID = 0;
    private int idConta = 0;
    private String numeroConta;
    private double saldo;
    
    public Conta(String numeroConta){
        this.numeroConta = numeroConta;
        saldo = 0;
        ultimoID++;
        idConta = ultimoID;
    }
    
    public int getIdConta(){
        return idConta;
    }
    
    public String getNumeroConta(){
        return numeroConta;
    }
    
    public static int getUltimoID(){
        return Conta.ultimoID;
    }
}
