package br.com.aulatransaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cordeiro
 */
public class AulaTransaction {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/aula_database_java",
                    "root",
                    ""
            );

            // Alterar o controle da transação para que isso seja feito pelo programador
            conn.setAutoCommit(false);

            // A partir desete ponto o programador deve dizer quando as alterações no banco ocorrerão
            PreparedStatement query = conn.prepareStatement(
                    "update conta set saldo = saldo + ? where idConta = ?"
            );
            try
            {
                // Tentar fazer os comandos serem excutados e controlar o exito dos mesmo
                
                // Tentar retirar da conta o 2 valor de 600 reais
                query.setDouble(1, -600);
                query.setDouble(2, 3);
                
                // Tenta realizar a alteração
                query.executeUpdate();
                
                // Tentar adicionar o valor de 600 reais na conta 1
                query.setDouble(1, 600);
                query.setDouble(2, 2);
                
                // Tenta realizar a alteração
                query.executeUpdate();
                
                // Mantém as alterações no banco
                conn.commit();
            }
            catch (Exception ex)
            {
                // Caso algum comando não possa ser executado, qualquer alteração no banco deve ser desfeita
                conn.rollback();
            }
            finally 
            {
                // Independente de ter sido alterado ou não o banco, deve ser feito o fechamento da conexão e a volta do controle de transação
                conn.setAutoCommit(true);
                conn.close();
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AulaTransaction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
