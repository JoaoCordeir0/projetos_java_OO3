package Controller;

import Model.ClienteDAO;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cordeiro
 */
public class ClienteController {
    
    // Recebe os clientes do banco de dados e salva em um arquivo txt
    public void iniciaImportacao() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException
    {
        // Retorna uma coleção dos usuários cadastrados no banco
        ResultSet rs = ClienteDAO.getClientesDatabase();
        
        FileWriter file = null;
       
        file = new FileWriter("Clientes2023.txt", true);
        PrintWriter write = new PrintWriter(file);
        
        while(rs.next())
        {
            write.println(rs.getString("cpf"));
            write.println(rs.getString("nome"));
        }
        
        file.close();
    }    
}
