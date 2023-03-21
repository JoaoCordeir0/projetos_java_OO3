package br.com.auladb.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joaoc
 */
public class RecuperaDB {

    public static void main(String[] args) {
        Connection conn = null;
        Statement comand = null;
               
        try {                     
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Tentar conectar
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/aula_database_java",
                    "root",
                    ""
            );
            
            // Prepara a String sql
            comand = conn.createStatement();
            
            ResultSet rs = comand.executeQuery(
                    "SELECT id, nome, ra FROM aluno"
            );
            
            while(rs.next())
            {
                System.out.println("Id-> " + rs.getInt(1));
                System.out.println("Nome-> " + rs.getString(2));
                System.out.println("Ra-> " + rs.getString(3));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RecuperaDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                comand.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(AulaDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
