package com.mycompany.projeto2_abstract;

/**
 *
 * @author joaoc
 */
public abstract class Conta {
    
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
       
    public abstract void imprimeExtratoDetalhado();
}
