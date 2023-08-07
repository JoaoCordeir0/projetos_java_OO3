/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancoitau;

/**
 *
 * @author joaoc
 */
public class ContaEspecial extends Conta{
    private double limite;
    
    //Seta variaveis 
    public void setLimite(double l){
        this.limite = l;
    }
    
    //Return 
    public double getLimite(){
        return limite;
    }
}
