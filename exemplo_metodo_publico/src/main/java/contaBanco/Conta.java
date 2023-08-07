/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contaBanco;

/**
 *
 * @author Cordeiro
 */
public class Conta {
    private String numeroConta = "123344-56";
    private double saldo;
    
    public Conta(String nc, double valor){
        this.numeroConta = nc;
        this.saldo = valor;
    }
    
    public boolean diminuirSaldo(double valor){
        if(saldo < valor){
            return false;
        }
        saldo-=valor;
        return true;
    }
    public void setSaldo(double valor){
        saldo = valor;
    }
    public void aumentarSaldo(double valor){
        saldo+=valor;
    }
    public double getSaldo(){
       return saldo;
    }
    public String getNumeroconta(){
       return numeroConta;
    }
}
