package br.com.exercicio_lambda;

/**
 *
 * @author Cordeiro
 */
public class Aluno {
    String nome;
    String ra;

    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    // Gets
    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }
    
    // Sets
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }        

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", ra=" + ra + '}';
    }
}
