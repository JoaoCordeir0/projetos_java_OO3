package Model;

import Core.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cordeiro
 */
public class ClienteDAO {
    
    // Realiza o select de todos os clientes no banco de dados
    public static ResultSet getClientesDatabase() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
    {
        Connection conn = Database.createConexao();
        
        String sql = "SELECT cpf, nome FROM cliente";
        
        ResultSet rs = Database.execSelect(conn, sql);
                       
        return rs;
    }
    
}
