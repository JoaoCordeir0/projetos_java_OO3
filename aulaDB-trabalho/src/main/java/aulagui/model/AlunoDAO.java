package aulagui.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*classe responsavel por persistir e recuperar os dados de um aluno*/

public class AlunoDAO {
    
    private List<Aluno> alunos = null;
    
    public AlunoDAO(){
        if(alunos==null){
            FileReader file = null;
            try {
                alunos = new ArrayList<>();
                file = new FileReader("Alunos.txt");
                Scanner leitor = new Scanner(file);
                /*
                while (leitor.hasNext())
                {
                dado += leitor.nextLine() + '#';
                }
                String[] valores = dado.split("#");
                
                for (int c = 0; c < valores.length; c=c+2)
                {
                Aluno aluno = new Aluno(valores[c], valores[c + 1]);

                alunos.add(aluno);
                }
                */
                
                // Enquanto houver dados no arquivo
                while (leitor.hasNext())
                {
                    String nome = leitor.nextLine();
                    String ra = leitor.nextLine();
                    Aluno aluno = new Aluno(nome, ra);
                    alunos.add(aluno);
                }   leitor.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    file.close();
                } catch (IOException ex) {
                    Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
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
