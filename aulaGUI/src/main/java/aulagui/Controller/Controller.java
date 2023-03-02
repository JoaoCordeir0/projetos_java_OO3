package aulagui.Controller;

import aulagui.model.AlunoDAO;
import aulagui.model.Aluno;
import java.util.List;

/**
 *
 * @author Cordeiro
 */
public class Controller {
    
    private static AlunoDAO dao = new AlunoDAO();
    
    public static boolean grava(String nome, String ra)
    {
        Aluno aluno = new Aluno(nome, ra);
        
        try
        {
            return dao.insere(aluno);
        }
        catch(Exception e)
        {
            System.out.println("Erro -> " + e);
            return false;
        }
    }
     
    public static List<Aluno> getAlunos() {
        return dao.getAllAlunos();
    }
    
}
