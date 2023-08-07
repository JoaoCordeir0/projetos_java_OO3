/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contaassociacao;

/**
 *
 * @author joaoc
 */
public class Conta {
    private int numero;
    private double saldo;
    private Pessoa pes;  

    public Conta(int numero, double saldo, Pessoa pes) {
        this.numero = numero;
        this.saldo = saldo;
        this.pes = pes;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setPes(Pessoa pes) {
        this.pes = pes;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Pessoa getPes() {
        return pes;
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", saldo=" + saldo + ", pes=" + pes + '}';
    }
    
}
