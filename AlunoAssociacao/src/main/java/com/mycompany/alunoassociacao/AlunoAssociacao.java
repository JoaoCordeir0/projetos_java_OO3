/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.alunoassociacao;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class AlunoAssociacao {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);              
        
        String nome, rua, cep, comp;
        char sexo;
               
        System.out.println("==== ALUNO ====");
        
        System.out.println("Forneça o nome -> ");
            nome = ler.next();
        System.out.println("Forneça o RA -> ");
            int ra = ler.nextInt();
        System.out.println("Forneça o sexo -> ");
            sexo = ler.next().charAt(0);
        ler.nextLine();
            
        System.out.println("==== ENDEREÇO =====");
        
        System.out.println("Digite o nome da rua -> ");
            rua = ler.nextLine();
        System.out.println("Digite o numero -> ");
            int num = ler.nextInt();
        ler.nextLine();
        System.out.println("Digite o complemento -> ");
            comp = ler.nextLine();
        System.out.println("Digite o CEP -> ");
            cep = ler.next();
         
        Endereco end = new Endereco(rua, num, comp, cep);
        Aluno aluno = new Aluno(nome, ra, sexo, end);
        
        System.out.println(aluno.toString());
       
    }
}
