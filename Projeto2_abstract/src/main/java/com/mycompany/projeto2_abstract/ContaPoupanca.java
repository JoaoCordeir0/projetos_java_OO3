package com.mycompany.projeto2_abstract;

/**
 *
 * @author joaoc
 */
public class ContaPoupanca extends Conta{
    
    private double taxaDeJuros;

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
    
    @Override
    public void imprimeExtratoDetalhado()
    {
        System.out.println("Extrato detalhado da conta");
        System.out.println("Juros -> " + this.taxaDeJuros);
        System.out.println("Saldo -> " + this.getTaxaDeJuros());
    }
}
