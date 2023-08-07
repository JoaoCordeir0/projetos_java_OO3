package com.sgat_system.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaoc
 */
public class ListClassroom {
    private static List<Classroom> classroom;
    
    private ListClassroom(){}
    
    public static List<Classroom> getInstance()
    {
        if(classroom == null)
        {
            classroom = new ArrayList<>();
        }
        return classroom;
    }
}
