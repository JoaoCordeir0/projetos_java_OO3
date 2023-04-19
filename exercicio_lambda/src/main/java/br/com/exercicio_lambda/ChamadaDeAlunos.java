package br.com.exercicio_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Cordeiro
 */
public class ChamadaDeAlunos {
    
    private List<Aluno>alunos;

    public ChamadaDeAlunos(){
        alunos = new ArrayList();
        
        alunos.add(new Aluno("João", "27099-5"));
        alunos.add(new Aluno("Victor", "27099-5"));
        alunos.add(new Aluno("Cordeiro", "27099-5"));
    }    
    
    public void imprimeAlunos()
    {
        // Ordenando a coleção de alunos 
        Collections.sort(alunos, (a1, a2) -> {
                    return -1* a1.getNome().compareToIgnoreCase(a2.getNome()); 
        }); 
        
        for(Aluno aluno:alunos)
        {
            System.out.println(aluno);
        }
    }
}
