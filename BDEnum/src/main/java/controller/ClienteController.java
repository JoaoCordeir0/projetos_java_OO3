/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import model.ClienteFisico;
import model.Sexo;
import persist.ClienteDAO;

/**
 *
 * @author cris
 */
public class ClienteController {

    private ClienteDAO dao = null;
    
    public ClienteController (){
           dao =new ClienteDAO();
    }
    
    public void insereClienteFisico(String nome,
            String rg, String cpf, String sexo)
            throws ClassNotFoundException, SQLException{
         
        //instanciar o cliente físico com seus dados
        
         ClienteFisico cliente = 
                 new ClienteFisico(rg, cpf, 
                         sexo.equals("feminino")?Sexo.FEMININO:Sexo.MASCULINO,
                         nome);
         //chamada da inserção em DAO
         dao.insere(cliente);
    }
    
}
