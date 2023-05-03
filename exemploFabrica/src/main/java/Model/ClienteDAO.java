package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * Data Access Object (outro padrão de projeto)
 * Visa fornecer um entidade capaz de "cuidar" da forma como os objetos serão persistidos (em memória ou em banco, ou em arquivos)
 * e como eles serão recuperados dos mesmos
 * 
 * @author joaoc
 */
public class ClienteDAO {
 
    public void insert(Cliente cli) throws SQLException       
    {
        // Obter a conexão e gerar os comandos necessários 
        Connection conn = FabricaDeConexao.get(
                "jdbc:mysql://localhost:3306/banco",
                "root",
                ""
        );
        
        PreparedStatement comand = conn.prepareStatement(
                "insert into cliente (nome, cpf) values (?, ?)"
        );
        
        comand.setString(1, cli.getNome());
        comand.setString(2, cli.getCpf());
        
        comand.executeUpdate();
        FabricaDeConexao.close(conn, comand);        
    }    
}
