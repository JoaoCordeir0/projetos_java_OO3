/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produtos;

/**
 *
 * @author Cordeiro
 */
public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    
    //Construtor em java 
    public Produto(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;       
    }
    
    public void setCodigo(int cod){
        codigo = cod;
    }
        
    public void setDescricao(String desc){
       descricao = desc;
    }
    
    public void setPreco(double prec){
       preco = prec;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public int getCodigo(){
        return codigo;
    }
       
    public void AumentaPreco(double porc){
        preco = preco+(preco*porc/100);                
    }
    
    public double getPreco(){
        return preco;
    }
}
