package com.mycompany.classeabstrata;

/**
 *
 * @author joaoc
 */
public class ClasseAbstrata {

    public static void main(String[] args) {
       
        Cachorro toto = new Cachorro();
        
        toto.setNome("Totó");
        toto.setPeso(10);
        
        System.out.println("O cachorro -> " + toto.getNome() + " pesa -> " + toto.getPeso() + "kg");
        toto.fazerBarulho();
        toto.enterraOsso();
        
        Galinha ga = new Galinha();
        
        ga.setNome("Galinha");
        ga.setPeso(4);
        
        System.out.println("O cachorro -> " + ga.getNome() + " pesa -> " + ga.getPeso() + "kg");
        ga.fazerBarulho();
        ga.botar();
    }
}
