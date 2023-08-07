/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoajuridica;

/**
 *
 * @author joaoc
 */
public class PessoaFisica extends Pessoa{
    private String rg;
    
    public PessoaFisica(String rg){
        super(nome);
        this.rg = rg;
    }
    
    //Set 
    public void setRg(String rg){
        this.rg = rg;
    }
    
    //Get
    public String getRg(){
        return rg;
    }
}
