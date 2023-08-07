/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadora_qualidadesoftware;

/**
 *
 * @author joaoc
 */
public class Start {

    public static void main(String[] args) {
        
        Calculadora c = new Calculadora();
        System.out.println("*****SOMA******");
        System.out.println(c.somar(5, 5));
        System.out.println(c.somar(5,10));
        System.out.println("******SUBTRAÇÃO******");
        System.out.println(c.subtrair(25,5));

    }
}
