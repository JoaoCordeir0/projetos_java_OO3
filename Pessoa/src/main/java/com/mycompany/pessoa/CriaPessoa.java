/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pessoa;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class CriaPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Pessoa pes[] = new Pessoa[3];
        
        int op, i=0, j, codigo, buscaCod, acao;
        String nome, prof;
               
        do{
            System.out.println("-------- Menu principal -------");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Alterar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Consultar");
            System.out.println("5 - Imprimir");
            System.out.println("6 - Sair");
            
            System.out.println("Digite uma opção: ");
                op = ler.nextInt();
                
            switch(op){
                case 1:
                    System.out.println("Digite o nome -> ");
                        nome = ler.next();
                    System.out.println("Digite o codigo -> ");
                        codigo = ler.nextInt();
                    System.out.println("Digite a profissão -> ");
                        prof = ler.next();
                    
                    while(i<3 && pes[i] != null){
                        i++;
                    }
                    if(i<3){
                        pes[i] = new Pessoa(codigo, nome, prof);
                        System.out.println("Pessoa cadastrada com sucesso!");
                    } else {
                        System.out.println("Vetor cheio");
                    }
                        
                    break;
                case 2:
                    System.out.println("Digite o codigo para buscar "); 
                        buscaCod = ler.nextInt();
                        
                    for(j=0; j<i; j++){
                        if(buscaCod == pes[j].getCodigo()){
                            System.out.println("Alterar o nome ou a profissão? [1 = nome] [2 = profissão]");
                                acao = ler.nextInt();
                            switch(acao){
                                case 1:
                                    System.out.println("Digite o nome -> ");    
                                        nome = ler.next();
                                    pes[j].setNome(nome);
                                    break;
                                case 2:
                                    System.out.println("Digite o profissão -> ");    
                                        prof = ler.next();
                                    pes[j].setNome(prof);
                                    break;                            
                            }
                        }
                    }
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
            } 
                
        }while(op != 6);        
    }
    
}
