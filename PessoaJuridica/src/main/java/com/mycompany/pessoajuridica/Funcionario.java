/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoajuridica;

/**
 *
 * @author joaoc
 */
public class Funcionario extends PessoaFisica {
    private int cartao;
    
    //Set 
    public void setCartao(int cartao){
        this.cartao = cartao;
    }
    
    //Get
    public int getCartao(){
        return cartao;
    }
}
