/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.contaassociacao;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class ContaAssociacao {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Pessoa pes[] = new Pessoa[50];
        Conta account[] = new Conta[50];
        
        int op, op2, op3, i, count, qtdpessoa=0, pos, exclui, consulta, numConta;
        String nome, rg, cpf;
        double saldo;
        
        do{
            System.out.println("[1] ler pessoa.");
            System.out.println("[2] ler conta.");
            System.out.println("[3] Sair");
                op = ler.nextInt();
                
            switch(op){
               case 1:
                   do{
                        System.out.println("[1] Cadastrar pessoa");
                        System.out.println("[2] Alterar pessoa");
                        System.out.println("[3] Excluir");
                        System.out.println("[4] Consultar pessoa");
                        System.out.println("[5] Imprimir");
                        System.out.println("[6] Sair");
                             op2 = ler.nextInt();
                        switch(op2){
                            case 1:
                                System.out.println("Digite o nome -> ");
                                    nome = ler.next();
                                System.out.println("Digite o rg -> ");
                                    rg = ler.next();
                                System.out.println("Digite cpf -> ");
                                    cpf = ler.next();  
                                
                                i = 0;
                                while(i<50 && pes[i] != null){
                                    i++;
                                }
                                if(i<50){
                                    pes[i] = new Pessoa(nome, rg, cpf);
                                    qtdpessoa++;
                                    System.out.println("Pessoa cadastrada com sucesso.");                                    
                                } else {
                                    System.out.println("Vetor cheio, pessoa não cadastrada.");
                                }
                                break;
                            case 2:
                                if(qtdpessoa > 0){
                                   System.out.println("\n--[ALTERAR]---");
                                   System.out.println("Digite a posição do vetor:");
                                   pos = ler.nextInt();
                                   
                                   if(pes[pos] != null){
                                       System.out.println("\n Dados Cadastrados:");
                                       System.out.println(pes[pos].toString());
                                       System.out.println("\nQual campo deseja alterar?");
                                       System.out.println("1 - Nome");
                                       System.out.println("2 - CPF");
                                       System.out.println("3 - RG");
                                       op3 = ler.nextInt();
                                       
                                       switch(op3){
                                           case 1:
                                               System.out.println("Digite o novo nome: ");
                                               pes[pos].setNome(ler.next());
                                               break;                                               
                                           case 2:
                                               System.out.println("Digite o novo CPF: ");
                                               pes[pos].setCpf(ler.next());
                                               break;                                               
                                           case 3:
                                               System.out.println("Digite o novo RG: ");
                                               pes[pos].setRg(ler.next());
                                               break;                                            
                                       }
                                       System.out.println("Alteração efetuada com sucesso!");
                                   } else {
                                       System.out.println("Nao existe pessoa nao existe1");
                                   }
                                }                               
                                break;
                            case 3:
                                if(qtdpessoa > 0){                                    
                                    System.out.println("Digite a posição para excluir -> ");
                                    exclui = ler.nextInt();
                                    if(exclui >= 0){
                                        pes[exclui] = null;
                                        System.out.println("Pessoa deletada");
                                    }else{
                                        System.out.println("Pessoa não excluida");
                                    }                                    
                                }                  
                                break;
                            case 4:
                                if(qtdpessoa > 0){                                    
                                    System.out.println("Digite a posição para excluir -> ");
                                    consulta = ler.nextInt();
                                    if(consulta >= 0){
                                        System.out.println("Dados -> " + pes[consulta].toString());
                                    }else{
                                        System.out.println("Pessoa não encontrada");
                                    }                                    
                                }      
                                break;
                            case 5:                                
                                for(count=0; count<qtdpessoa; count++){
                                    System.out.println(pes[count].toString());
                                }
                                break;                            
                        }
                   }while(op2 != 6);
                   break;
                case 2:
                   do{
                        System.out.println("[1] Cadastrar pessoa");
                        System.out.println("[2] Alterar pessoa");
                        System.out.println("[3] Excluir");
                        System.out.println("[4] Consultar pessoa");
                        System.out.println("[5] Imprimir");
                        System.out.println("[6] Sair");
                            op = ler.nextInt();
                        switch(op){
                            case 1:
                                System.out.println("Digite o numero da conta -> ");
                                    numConta = ler.nextInt();
                                System.out.println("Digite o saldo -> ");
                                    saldo = ler.nextDouble();                               
                                
                                System.out.println("==== Pessoa ====");
                                
                                int resp = 0;
                                
                                do{
                                    System.out.println("Escolha uma posiçao do vetor -> ");
                                    pos = ler.nextInt();
                                    if(pes[pos] != null){
                                        System.out.println("-> " + pes[pos].toString());
                                    }
                                }while(resp != 1);
                                
                                i = 0;
                                while(i < 50 && account[i] != null){
                                    i++;
                                }
                                if(i < 50){
                                    account[i] = new Conta(numConta, saldo, pes[pos]);
                                    qtdpessoa++;
                                    System.out.println("Conta cadastrada com sucesso! ");
                                }
                                break;
                        }
                   }while(op != 6);                   
                   break;              
           }
        }while(op != 3);
    }
}
