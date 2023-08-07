package com.sgat_system.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaoc
 */
public class ListUsers {
    
    private static List<Users> users;
    
    private ListUsers(){}
    
    public static List<Users> getInstance()
    {
        if(users == null)
        {
            users = new ArrayList<>();
        }
        return users;
    }    
}
