package br.unifae.es.poo3.aula1.model;

/**
 *
 * @author cordeiro
 */
public class Misteriosa2 extends Misteriosa1{

    private int dado2;

    public Misteriosa2() {
        dado2 = 30;
    }

    public int metodo1() {
        return super.metodo1() * dado2 * 2;
    }
}
