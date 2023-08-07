/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contaBanco;

/**
 *
 * @author Cordeiro
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta = new Conta("67554-3", 30.800);
        double valorDep = 2000;
        double valorSaque = 123.45;
        
        conta.aumentarSaldo(valorDep);
                
        if(!conta.diminuirSaldo(valorSaque)){
            System.out.println("Saldo insuficiente para saque");
        }
        else
        {
            System.out.println("Saque de "+valorSaque +" efetuado com sucesso");
        }
        
        System.out.println("Numero da conta = "+ conta.getNumeroconta());        
        System.out.println("Saldo = "+ conta.getSaldo());

    }
    
}
