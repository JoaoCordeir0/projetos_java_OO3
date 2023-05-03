package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Exemplifica o padrão do livro GoF (Grup of Four - Design Patterns)
 * 
 * No caso específico, o padrão é o Factory, que simplesmente menciona uma solução
 * de criar uma entidade. Á parte que pode "cuidar" da criação dos objetos importantes 
 * para uma aplicação
 * 
 * @author joaoc
 */

public class FabricaDeConexao {
    
    public static Connection get(String url, String user, String password) throws ClassNotFoundException, SQLException
    {
        // Toda fabrica no mínimo tem um método get
        // Para gerar a instância (objeto)
        Connection conn = null;
        
        Class.forName("com.mysql.cj.jdbc.Driver");            
        conn = DriverManager.getConnection(url, user, password);
                
        return conn;
    }
    
    // Esta fabrica possibilita a geração de várias conexões 
    // Cabe a esta fabrica tentar encerrar as conexões geradas
    
    public static void close(Connection conn) throws SQLException
    {             
        conn.close();        
    }
    
    public static void close(Connection conn, Statement comand) throws SQLException
    {        
        comand.close();
        conn.close();     
    }
}
