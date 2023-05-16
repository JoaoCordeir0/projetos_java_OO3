/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cris
 */
public class FabricaDeConexao {
    
    public static Connection getConexao() throws ClassNotFoundException, SQLException{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbenum",
                "root", "");
       return conexao;
    }
    
    public static void fechaConexao(Connection con) throws SQLException{
        con.close();
    }        
}
