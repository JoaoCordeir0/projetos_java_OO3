/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Cliente;
import model.ClienteFisico;
import model.ClienteJuridico;

/**
 *
 * @author cris
 */
public class ClienteDAO {
    
    public void insere(Cliente cliente) throws ClassNotFoundException, SQLException{
        
        //preparar a conexao e comandos para gravar
        //os dados no banco de dados
        
        Connection conexao = FabricaDeConexao.getConexao();
        
        PreparedStatement comando = null;
        //Para o comando de inserção, há que se testar
        //o tipo de cliente
        if(cliente instanceof ClienteFisico){
            comando = conexao.prepareStatement(
            "insert into cliente(nome,rg,cpf,sexo,tipo) values(?,?,?,?,?)");
            
            //colocando os dados lidos do cliente
            comando.setString(1,cliente.getNome());
            comando.setString(2,((ClienteFisico)cliente).getRg());
            comando.setString(3,((ClienteFisico)cliente).getCpf());
            comando.setString(4,((ClienteFisico)cliente).getSexo().toString());
            comando.setInt(5,1); //1 será fisico e 2 - juridico
        }
        else{
          comando = conexao.prepareStatement(
            "insert into cliente(nome,cnpj,tipo) values(?,?,?)");
            
            //colocando os dados lidos do cliente
            comando.setString(1,cliente.getNome());
            comando.setString(2,((ClienteJuridico)cliente).getCnpj());
            comando.setInt(3,2); //1 será fisico e 2 - juridico
            
        }
        //executar no banco o comando
        comando.executeUpdate();
        
        //encerrar o recursos
        comando.close();
        FabricaDeConexao.fechaConexao(conexao);
    }
    
}
