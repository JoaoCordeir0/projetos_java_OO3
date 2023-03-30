package br.com.aulatransaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cordeiro
 */
public class Ex_Transaction {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement comand = null;
        
        Scanner read = new Scanner(System.in);
        
        Double valueSac;
        String numAccountSac, numAgencySac, numAccountDep, numAgencyDep;
        
        System.out.println("Digite o valor que será sacado -> ");
        valueSac = read.nextDouble();
        System.out.println("Informe o número da conta -> ");
        numAccountSac = read.next();
        System.out.println("Informe a âgencia ->");
        numAgencySac = read.next();
        
        System.out.println("\n\nDigite o numero da conta que receberá a transferência");
        numAccountSac = read.next();
        System.out.println("Informe a âgencia ->");
        numAgencySac = read.next();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/aula_database_java",
                    "root",
                    ""
            );
                        
            // Valida se a conta do saque possui saldo
            comand = conn.prepareStatement("select * from conta where numeroConta = ?");
            comand.setString(1, numAccountSac);

            ResultSet rs = comand.executeQuery();
                       
            if (rs.getDouble(4) > valueSac)
            {
                // faz o saque
            }
            else 
            {
                // não faz o saque
            }
            
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
