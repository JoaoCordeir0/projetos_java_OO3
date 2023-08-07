package com.sgat_system.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joao.cordeiro
 */
public class ListInstructor {
    private static List<Instructor> instructor;
    
    private ListInstructor(){}
    
    public static List<Instructor> getInstance()
    {
        if(instructor == null)
        {
            instructor = new ArrayList<>();
        }
        return instructor;
    }
}
