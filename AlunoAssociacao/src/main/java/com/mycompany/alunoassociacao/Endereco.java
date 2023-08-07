/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alunoassociacao;

/**
 *
 * @author joaoc
 */
public class Endereco {
    private String rua;
    private int numero;
    private String complemento;
    private String cep;

    public Endereco(String rua, int numero, String complemento, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCep() {
        return cep;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + ", cep=" + cep + '}';
    }
    
    
}
