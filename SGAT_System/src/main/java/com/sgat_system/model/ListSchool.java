package com.sgat_system.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joao.cordeiro
 */
public class ListSchool {
    private static List<School> school;
    
    private ListSchool(){}
    
    public static List<School> getInstance()
    {
        if(school == null)
        {
            school = new ArrayList<>();
        }
        return school;
    } 
}
