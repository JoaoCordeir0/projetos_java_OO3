package com.mycompany.produtosempresa;

/**
 *
 * @author joaoc
 */
public class CriaProduto {
    private int codigo;
    private String desc;
    private double preco;

    public CriaProduto(int codigo, String desc, double preco) {
        this.codigo = codigo;
        this.desc = desc;
        this.preco = preco;
    }   

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getDesc() {
        return desc;
    }

    public double getPreco() {
        return preco;
    }

    public double getPorcentagem(double valorPorc){
        double newvalue = 0;
        newvalue = (preco / 100) * valorPorc;
        preco = newvalue + preco;        
        return preco;
    }
    
    @Override
    public String toString() {
        return "CriaProduto{" + "codigo=" + codigo + ", desc=" + desc + ", preco=" + preco + '}';
    }
    
    
}
