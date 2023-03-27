package auladb.Controller;

import auladb.Model.AlunoDAO;
import auladb.Model.Aluno;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Cordeiro
 */
public class Controller {
    
    private static AlunoDAO dao = new AlunoDAO();
    
    public static boolean grava(String nome, String ra) throws IOException, ClassNotFoundException, SQLException
    {
        Aluno aluno = new Aluno(nome, ra);
        
        return dao.insere(aluno);
    }
     
    public static List<Aluno> getAlunos() {
        return dao.getAllAlunos();
    }
    
}
