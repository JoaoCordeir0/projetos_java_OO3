/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Produtos;

import java.util.Scanner;

/**
 *
 * @author Cordeiro
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciando variaveis no construtor
        Produto produto1 = new Produto(4444, "Notebook");
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o codigo:");
            int codigo = ler.nextInt();
        System.out.println("Digite a descricao:");
            String descricao = ler.next(); 
        System.out.println("Digite o preco:");
            double preco = ler.nextDouble();
        
        produto1.setCodigo(codigo);
        produto1.setDescricao(descricao);
        produto1.setPreco(preco);
                
        System.out.println("------NOTEBOOK------");
        System.out.println("Codigo = "+produto1.getCodigo()+"\nDescrição: "+produto1.getDescricao()+"\nPreço = "+produto1.getPreco());
        
        produto1.AumentaPreco(20);                              
        
    }
    
}