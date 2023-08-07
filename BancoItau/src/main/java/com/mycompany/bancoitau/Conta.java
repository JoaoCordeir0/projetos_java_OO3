/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancoitau;

/**
 *
 * @author joaoc
 */
public class Conta{
    protected String numeroConta;
    protected double saldo;
    
    //Seta variaveis 
    public void setNumeroConta(String numConta){
        this.numeroConta = numConta;
    }
    public void setSaldo(double s){
        this.saldo = s;
    }
    
    //Return 
    public String getNumeroConta(){
        return numeroConta;
    }
    public double getSaldo(){
        return saldo;
    }
}