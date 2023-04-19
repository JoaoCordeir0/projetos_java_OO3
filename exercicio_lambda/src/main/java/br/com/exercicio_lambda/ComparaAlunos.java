package br.com.exercicio_lambda;

import java.util.Comparator;

/**
 *
 * @author Cordeiro
 */
public class ComparaAlunos implements Comparator<Aluno>{
    
    public int compare(Aluno a1, Aluno a2)
    {
        return a1.getNome().compareToIgnoreCase(a2.getNome());
    }
}
