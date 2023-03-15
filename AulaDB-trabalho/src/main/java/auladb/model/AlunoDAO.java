package auladb.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/*classe responsavel por persistir e recuperar os dados de um aluno*/
public class AlunoDAO {

    private List<Aluno> alunos = null;

    Statement comand = null;
    Connection conn = null;

    public AlunoDAO() {

        ResultSet rs;

        try {
            // Subir o driver para oso - MYSQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Tentar conectar
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/aula_database",
                    "root",
                    "1234"
            );

            if (alunos == null) {
                //Inserção no banco            
                comand = conn.createStatement();

                rs = comand.executeQuery(
                        "SELECT * FROM Aluno"
                );

                while (rs.next()) {
                    Aluno aluno = new Aluno(rs.getString("nome"), rs.getString("ra"));
                    alunos.add(aluno);
                }
            }
            comand.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean insere(Aluno aluno) throws ClassNotFoundException, SQLException {

        // Subir o driver para oso - MYSQL
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Tentar conectar
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/aula_database",
                "root",
                "1234"
        );

        comand.executeUpdate(
                "INSERT INTO Aluno (nome, ra) VALUES ('" + aluno.getNome() + "', '" + aluno.getRa() + "')"
        );

        comand.close();
        conn.close();
        
        return true;
    }

    //public Aluno getAluno(String ra){}
    public List<Aluno> getAllAlunos() {
        return alunos;
    }
}
