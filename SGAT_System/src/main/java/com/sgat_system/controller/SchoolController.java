package com.sgat_system.controller;

import com.sgat_system.model.ListSchool;
import com.sgat_system.model.PrimaryKey;
import com.sgat_system.model.School;

/**
 *
 * @author joao.cordeiro
 */
public class SchoolController implements PrimaryKey {
    
    public boolean registerSchool(int id, String name, String phone, String email, String uf, String city, String neigh, String street, int number)
    {
        School school = new School(id, name, phone, email, uf, city, neigh, street, number);
        
        if (!ListSchool.getInstance().isEmpty())
        {
            ListSchool.getInstance().set(0, school);    
            return true;
        }                              
        else 
        {
            return ListSchool.getInstance().add(school);
        }
    }
    
    public String getNameSchool()
    {
        if (!ListSchool.getInstance().isEmpty())
        {      
            return ListSchool.getInstance().get(ListSchool.getInstance().size() - 1).getNameSchool();
        }
        return "Sgat - System";
    }
    
    public String getPhoneSchool()
    {
        if (!ListSchool.getInstance().isEmpty())
        {      
            return ListSchool.getInstance().get(ListSchool.getInstance().size() - 1).getPhoneSchool();
        }
        return "";
    }
    
    public String getEmailSchool()
    {
        if (!ListSchool.getInstance().isEmpty())
        {      
            return ListSchool.getInstance().get(ListSchool.getInstance().size() - 1).getEmailSchool();
        }
        return "";
    }
    
    public String getUfSchool()
    {
        if (!ListSchool.getInstance().isEmpty())
        {      
            return ListSchool.getInstance().get(ListSchool.getInstance().size() - 1).getUfSchool();
        }
        return "";
    }
    
    public String getCitySchool()
    {
        if (!ListSchool.getInstance().isEmpty())
        {      
            return ListSchool.getInstance().get(ListSchool.getInstance().size() - 1).getCitySchool();
        }
        return "";
    }
    
    public String getNeightborhoodSchool()
    {
        if (!ListSchool.getInstance().isEmpty())
        {      
            return ListSchool.getInstance().get(ListSchool.getInstance().size() - 1).getNeightborhoodSchool();
        }
        return "";
    }
    
    public String getStreetSchool()
    {
        if (!ListSchool.getInstance().isEmpty())
        {      
            return ListSchool.getInstance().get(ListSchool.getInstance().size() - 1).getStreetSchool();
        }
        return "";
    }
    
    public int getNumberSchool()
    {
        if (!ListSchool.getInstance().isEmpty())
        {      
            return ListSchool.getInstance().get(ListSchool.getInstance().size() - 1).getNumberSchool();
        }
        return 0;
    }
    
    @Override
    public int getLastID()
    {
        if (!ListSchool.getInstance().isEmpty())
        {                                    
            return ListSchool.getInstance().get(ListSchool.getInstance().size() - 1).getIdSchool() + 1;
        }        
        return 0;
    }
    
   
}
