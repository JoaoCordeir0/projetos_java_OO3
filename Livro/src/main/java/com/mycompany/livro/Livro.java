/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livro;

/**
 *
 * @author joaoc
 */
public class Livro {
    private int codigo;
    private String titulo;
    private int quantidade;
    private String autor;
    
    //Construtor
    public Livro(int cod, String title, int qtd, String aut){
        this.codigo = cod;
        this.titulo = title;   
        this.quantidade = qtd;
        this.autor = aut;
    }
    
    //Sobre carga
     public Livro(int cod, String title, int qtd){
        this.codigo = cod;
        this.titulo = title;   
        this.quantidade = qtd;        
    }
     
    //Seta valores 
    public void setCodigo(int cod){
        codigo = cod;        
    }
    public void setTitulo(String title){
        titulo = title;
    }
    public void setAutor(String aut){
        autor = aut;
    }    
    
    //Chama valores
    public int getCodigo(){
        return codigo;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public String getAutor(){
        return autor;
    }
    
    //Metodos
    public void Emprestar(int qtd){
        if(quantidade >= qtd){
            quantidade = quantidade - qtd;
                System.out.println("Livro emprestado");
        }else{
            System.out.println("Nao possuimos essa quantidade de livros");
        } 
    }
    public void Devolucao(int dev){
        quantidade = quantidade + dev;
            System.out.println("Livro devolvido. Total no estoque ->" + quantidade);
    }
}   
