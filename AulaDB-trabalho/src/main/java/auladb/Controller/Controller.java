package auladb.Controller;

import auladb.model.AlunoDAO;
import auladb.model.Aluno;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Cordeiro
 */
public class Controller {
    
    private static AlunoDAO dao = new AlunoDAO();
    
    public static boolean grava(String nome, String ra) throws IOException
    {
        Aluno aluno = new Aluno(nome, ra);
        
        return dao.insere(aluno);
    }
     
    public static List<Aluno> getAlunos() {
        return dao.getAllAlunos();
    }
    
}
