package com.sgat_system.controller;

import com.sgat_system.model.ListUserAuth;
import com.sgat_system.model.ListUsers;
import com.sgat_system.model.UserAuth;

/**
 *
 * @author joao.cordeiro
 */
public class AuthController {
        
    public boolean validateAuth(String cpf, String password)
    {
        for (int c = 0; c < ListUsers.getInstance().size(); c++)
        {
            // Valid CPF and password
            if (ListUsers.getInstance().get(c).getCpf().equals(cpf) && ListUsers.getInstance().get(c).getPassword().equals(password))
            {                                                                
                UserAuth userLogged = new UserAuth(ListUsers.getInstance().get(c).getId(), ListUsers.getInstance().get(c).getName());
        
                ListUserAuth.getInstance().add(userLogged);                                                
                        
                return true;
            }
        }  
        
        return false;
    }        
    
    public String getNameLogged()
    {
        if (!ListUserAuth.getInstance().isEmpty())
        {                                    
            return ListUserAuth.getInstance().get(ListUserAuth.getInstance().size() - 1).getNameLogged();
        }              
        return "Null";
    }
    
    public boolean recoveryPassword()
    {
        // Recovery Password
        return true;
    }
}
