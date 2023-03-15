package br.com.auladb.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cordeiro
 */
public class AulaDB {

    public static void main(String[] args) {
        
        Statement comand = null;
        Connection conn = null;                
        
        try 
        {
            // Subir o driver para oso - MYSQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Tentar conectar
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/aula_database",
                    "root",
                    "1234"
            );

            //Inserção no banco            
            comand = conn.createStatement();

            for (int c = 0; c < 1000; c++) {
                comand.executeUpdate(
                        "INSERT INTO Aluno (nome, ra) VALUES ('João Victor Cordeiro " + c + "', '" + c + "')"
                );
            }            
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(AulaDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try 
            {
                comand.close();
                conn.close();
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(AulaDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
