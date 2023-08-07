/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.array;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class Array {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Funcionario[] funcionario = new Funcionario[3];
        
        int registro;
        String nome;
        String cargo;
        double saldo;       
        
        for(int i=0; i<3; i++){
            System.out.println("Digite o numero do registro do "+ "[" + (i + 1) + "]" +" funcionario ->");
                registro = ler.nextInt();
            System.out.println("Digite o nome do "+ "[" + (i + 1) + "]" +" funcionario -> ");
                nome = ler.next();
            System.out.println("Digite o cargo do "+ "[" + (i + 1) + "]" +" funcionario -> ");
                cargo = ler.next(); 
            System.out.println("Digite o salario do "+ "[" + (i + 1) + "]" +" funcionario -> ");
                saldo = ler.nextDouble();
                   
            funcionario[i] = new Funcionario(registro, nome, cargo, saldo);
        }
        for(Funcionario c:funcionario){
            System.out.println("Registro do "+ "[" + c + "]" +" funcionario -> " + c.getNumRegistro());
            System.out.println("Nome do "+ "[" + c + "]" +" funcionario -> " + c.getNome());
            System.out.println("Cargo do "+ "[" + c + "]" +" funcionario -> " + c.getNome());
            System.out.println("Saldo do "+ "[" + c + "]" +" funcionario -> " + c.getSalario());
        }
    }
}
