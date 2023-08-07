package com.sgat_system.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joao.cordeiro
 */
public class ListUserAuth {
    
    private static List<UserAuth> userAuth;
    
    private ListUserAuth(){}
    
    public static List<UserAuth> getInstance()
    {
        if(userAuth == null)
        {
            userAuth = new ArrayList<>();
        }
        return userAuth;
    }    
}
