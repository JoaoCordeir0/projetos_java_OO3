/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaoc
 */
public class IngressoComum {
    int ingresso;
    private int bebida;
    private String diaShow;
    private String nomeCantor;
    private float preco;
    
    public IngressoComum(int ing, int beb, String dShow, String nCantor, float prec){
        this.ingresso = ing;
        this.bebida = beb;
        this.diaShow = dShow;
        this.nomeCantor = nCantor;
        this.preco = prec;
    }
    
    //Sets do codigo
    public void setIngresso(int ingresso) {
        this.ingresso = ingresso;
    }

    public void setBebida(int bebida) {
        this.bebida = bebida;
    }

    public void setDiaShow(String diaShow) {
        this.diaShow = diaShow;
    }

    public void setNomeCantor(String nomeCantor) {
        this.nomeCantor = nomeCantor;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    //Gets do codigo    
    public int getIngresso() {
        return ingresso;
    }

    public int getBebida() {
        return bebida;
    }

    public String getDiaShow() {
        return diaShow;
    }

    public String getNomeCantor() {
        return nomeCantor;
    }

    public float getPreco() {
        return preco;
    }
    
     public boolean calculaPreco(){
        if(bebida ==1){
            System.out.println("\nPreço"+(preco+10));
            return true;
        }
       else
            if(bebida == 2){
                System.out.println("\nPreco"+(preco+18));
                return true;
            }      
        return false;
    }

}
