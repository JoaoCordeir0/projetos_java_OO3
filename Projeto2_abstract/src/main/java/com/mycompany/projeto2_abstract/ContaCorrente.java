package com.mycompany.projeto2_abstract;

/**
 *
 * @author joaoc
 */
public class ContaCorrente extends Conta{
    
    private double limiteDoChequeEspecial;
    
    public double getlimiteDoChequeEspecial()
    {
        return limiteDoChequeEspecial;
    }

    public void setLimiteDoChequeEspecial(double limiteDoChequeEspecial) {
        this.limiteDoChequeEspecial = limiteDoChequeEspecial;
    }
    
    @Override
    public void imprimeExtratoDetalhado()
    {
        System.out.println("Extrato detalhado da conta");
        System.out.println("Juros -> " + this.limiteDoChequeEspecial);
        System.out.println("Saldo -> " + this.getSaldo());
    }
}
