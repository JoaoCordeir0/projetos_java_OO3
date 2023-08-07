/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancoitau;

/**
 *
 * @author joaoc
 */
public class ContaPoupanca extends Conta{
    private int diaAniversario;
    
    //Seta variaveis
    public void setDia(int d){
        this.diaAniversario = d;
    }
    
    //Return 
    public int getDiaAniversario(){
        return diaAniversario;
    }
}
