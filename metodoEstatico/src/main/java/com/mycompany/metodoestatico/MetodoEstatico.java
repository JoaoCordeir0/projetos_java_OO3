/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.metodoestatico;

/**
 *
 * @author joaoc
 */
public class MetodoEstatico {

    public static void main(String[] args) {
        Conta conta1, conta2;
        conta1 = new Conta("123456-x");
        conta2 = new Conta("654321-x");
        
        System.out.println("Conta 1 - numero: " + conta1.getNumeroConta() + "--ID: " + conta1.getIdConta());
        System.out.println("Conta 2 - numero: " + conta2.getNumeroConta() + "--ID: " + conta2.getIdConta());
        
        System.out.println("Valor do ultimo ID: " + Conta.getUltimoID());
    }
}
