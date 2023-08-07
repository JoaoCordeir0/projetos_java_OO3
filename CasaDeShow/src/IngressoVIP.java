/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaoc
 */
public class IngressoVIP extends IngressoComum{
     private int nCadeira;

    public IngressoVIP(int nCadeira, int bebida, String dia, String nome, float preco) {
        super(ingresso, bebida, diaShow, nomeCantor, preco);
        this.nCadeira = nCadeira;
    }

    public int getnCadeira() {
        return nCadeira;
    }

    public void setnCadeira(int nCadeira) {
        this.nCadeira = nCadeira;
    }
    
    public boolean calculaPreco() {
        super.calculaPreco();
       
        if(bebida == 3){
            System.out.println("\nPreco"+(preco+100));
                return true;
        }
        return false;
    }
}
