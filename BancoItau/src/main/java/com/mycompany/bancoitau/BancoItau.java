/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bancoitau;

/**
 *
 * @author joaoc
 */
public class BancoItau {

    public static void main(String[] args) {
        Conta joao = new Conta();
        ContaEspecial victor = new ContaEspecial();
        ContaPoupanca cordeiro = new ContaPoupanca();
        
        joao.setNumeroConta("123456-78");
        joao.setSaldo(500);
        
        victor.setNumeroConta("9128412-01");
        victor.setSaldo(1000);
        victor.setLimite(200);
        
        cordeiro.setNumeroConta("112123-23");
        cordeiro.setSaldo(1500);
        cordeiro.setDia(5);
        
        System.out.println("Conta normal => ");
        System.out.println("Numero da conta ->" + joao.getNumeroConta());
        System.out.println("Saldo da conta -> " + joao.getSaldo());
             
        System.out.println("\nConta Especial => ");
        System.out.println("Numero da conta ->" + victor.getNumeroConta());
        System.out.println("Saldo da conta -> " + victor.getSaldo());
        System.out.println("Limite da conta -> " + victor.getLimite());
        
        System.out.println("\nConta Poupança => ");
        System.out.println("Numero da conta ->" + cordeiro.getNumeroConta());
        System.out.println("Saldo da conta -> " + cordeiro.getSaldo());
        System.out.println("Dia da conta -> " + cordeiro.getDiaAniversario());
    }
}
