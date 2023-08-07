/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoajuridica;

/**
 *
 * @author joaoc
 */
public class PessoaJuridica extends Pessoa{
    private String cnpj;
    
    public PessoaJuridica(String cnpj){
        super(nome);
        this.cnpj = cnpj;
    }
    
    //Set 
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    //Get
    public String getCnpj(){
        return cnpj;
    }
}
