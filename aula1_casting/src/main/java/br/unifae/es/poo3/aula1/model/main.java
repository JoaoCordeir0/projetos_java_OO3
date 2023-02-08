package br.unifae.es.poo3.aula1.model;

/**
 *
 * @author cordeiro
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Misteriosa1[] misterios = new Misteriosa1[2];

        misterios[0] = new Misteriosa2();
        misterios[1] = new Misteriosa3();

        for (Misteriosa1 misterio : misterios) {
            System.out.println("Chamando o metodo da classe "
                    + misterio.getClass().getName() + " com retorno "
                    + misterio.metodo1());
        }
    }

}
