package com.sgat_system.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaoc
 */
public class ListStudent {
    private static List<Student> student;
    
    private ListStudent(){}
    
    public static List<Student> getInstance()
    {
        if(student == null)
        {
            student = new ArrayList<>();
        }
        return student;
    }    
}
