package com.mycompany.produtosempresa;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class ProdutosEmpresa {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        CriaProduto produto[] = new CriaProduto[100];
        
        int op, i=0, cod;
        String desc;
        double preco, porc, resultPreco;
        
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
                    System.out.println("Digite o codigo -> ");
                        cod = ler.nextInt();
                    System.out.println("Digite a descrição -> ");
                        desc = ler.next();
                    System.out.println("Digite o preço -> ");
                        preco = ler.nextDouble();
                    
                    while(i<100 && produto[i] != null){
                        i++;
                    }
                    if(i<100){
                        produto[i] = new CriaProduto(cod, desc, preco);
                    }
                    break;
                case 2:                                        
                    while(i<100 && produto[i] != null){
                        i++;
                    }
                    if(i<100){
                        System.out.println("Digite o codigo para alterar o preço -> ");
                            cod = ler.nextInt();
                        if(cod == produto[i].getCodigo()){
                            System.out.println("Informe o novo preço -> ");
                                preco = ler.nextDouble();
                            System.out.println("Informe a porcentagem adicional");
                                porc = ler.nextDouble();
                            
                            resultPreco = produto[i].getPorcentagem(porc);
                            produto[i].setPreco(resultPreco);
                        }                            
                    }                       
                    break;
                case 3:
                    while(i<100 && produto[i] != null){
                        i++;
                    }
                    if(i<100){
                        System.out.println("Digite o codigo para excluir -> ");
                            cod = ler.nextInt();
                        if(cod == produto[i].getCodigo()){
                            produto[i] = null;
                        }                            
                    }     
                    break;                    
                case 4:
                    while(i<100 && produto[i] != null){
                        i++;
                    }
                    if(i<100){
                        System.out.println("Digite o codigo para consultar -> ");
                            cod = ler.nextInt();
                        if(cod == produto[i].getCodigo()){
                            System.out.println("Produto da empresa " + i + " - " + produto[i].toString());
                        }                            
                    }     
                    break;
                case 5:
                    while(i<100 && produto[i] != null){
                        i++;
                    }
                    if(i<100){                     
                        System.out.println("Produto da empresa " + i + " - " + produto[i].toString());;;                                               
                    }     
                    break;                                
            }            
        }while(op != 4);
    }
}
