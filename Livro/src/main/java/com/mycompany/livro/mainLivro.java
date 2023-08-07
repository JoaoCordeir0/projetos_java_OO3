/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.livro;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class mainLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Livro livro1 = new Livro(4343, "Mente empreendedora", 5, "João Victor Cordeiro");
        
        System.out.println("Livros Cadastrado ->");
        System.out.println("Codigo = "+ livro1.getCodigo()+ "\nTitulo = "+ livro1.getTitulo()+ "\nQuantidade"+ livro1.getQuantidade()+ "\nAutor = " + livro1.getAutor());
        
        System.out.println("\n");
        int acao;
        
        do{           
            System.out.println("Cadastrar um livro digite [1]");
            System.out.println("Ver os livros cadastrados [2]");
            System.out.println("Pegar um livro emprestado [3]");
            System.out.println("Devolver um livro         [4]");
            System.out.println("Para sair                 [0]");
                acao = ler.nextInt();

            if(acao == 1){
                 System.out.println("Digite o codigo do livro ->");
                    int cod = ler.nextInt();
                 System.out.println("Digite o titulo do livro ->");
                    String title = ler.next();
                 System.out.println("Digite o nome do autor ->");
                    String aut = ler.next();
                 livro1.setCodigo(cod);
                 livro1.setTitulo(title);
                 livro1.setAutor(aut);
            }else if(acao == 2){
                System.out.println("Codigo = "+ livro1.getCodigo()+ "\nTitulo = "+ livro1.getTitulo()+ "\nQuantidade"+ livro1.getQuantidade()+ "\nAutor = " + livro1.getAutor());
            }else if(acao == 3){
                System.out.println("Quantos livros você vai pegar emprestado? ->");;
                    int empresta = ler.nextInt();
                    livro1.Emprestar(empresta);
            }else if(acao == 4){
                System.out.println("Quantos livros você vai devolver? ->");;
                    int dev = ler.nextInt();
                    livro1.Devolucao(dev);
            }
        }while(acao != 0);
    }
    
}
