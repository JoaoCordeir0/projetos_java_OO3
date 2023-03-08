package aulagui.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*classe responsavel por persistir e recuperar os dados de um aluno*/

public class AlunoDAO {
    
    private List<Aluno> alunos = null;
    
    public AlunoDAO(){
        if(alunos==null){
            alunos = new ArrayList<>();
        }        
    }
    
    public boolean insere(Aluno aluno) throws IOException{
                       
        FileWriter file = new FileWriter("Alunos.txt", true);            
        PrintWriter write = new PrintWriter(file);
        write.println(aluno.getNome());
        write.println(aluno.getRa());                    
        write.close();
        return alunos.add(aluno);
    }
    
    public Aluno getAluno(String ra){
        Aluno procurado = null;
        //Dado o Ra, busque o aluno
        
        /*Metodo Ineficiente
        for(int i=0; i<alunos.size(); i++){
            if(alunos.get(i).getRa().equals(ra)){
                procurado = alunos.get(i);
            }   
        }*/
        
        /*Metodo Eficiente*/
        Iterator<Aluno> obj = alunos.iterator();
        while(obj.hasNext()){
            Aluno aluno = obj.next();
            if(aluno.getRa().equals(ra)){
                procurado = aluno;
            }
            
        }        
        return procurado;        
    }
    
    public List<Aluno> getAllAlunos(){
        return alunos;
    }    
}
