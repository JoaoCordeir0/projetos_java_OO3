package com.sgat_system.controller;

import com.sgat_system.model.ListClassroom;
import com.sgat_system.model.ListStudent;
import java.text.DecimalFormat;

/**
 *
 * @author joaoc
 */
public class ReportController extends StudentController{
 
    public int searchInfoStudent(String cpf)
    {
        int pos = -1;
        for (int c = 0; c < ListStudent.getInstance().size(); c++)
        {
            if (ListStudent.getInstance().get(c).getCpfStudent().equals(cpf)){
                pos = c;
            }
        }
               
        return pos;   
    }        
    
    public String geValueParcelsStudent(int pos)
    {
        double value = ListStudent.getInstance().get(pos).getValueStudent();
        String par = String.valueOf(ListStudent.getInstance().get(pos).getParcelsStudent()).replace("x", "");
        
        int parcels = Integer.parseInt(par);
       
        DecimalFormat formato = new DecimalFormat("#.##");      
        
        return String.valueOf(formato.format(value / parcels));
    }
       
    public String getClassRegistredStudent(String cpf)
    {
        int pos = -1;
        String text = "";
        
        for (int c = 0; c < ListClassroom.getInstance().size(); c++)
        {
            String Student = ListClassroom.getInstance().get(c).getNameStudentClass();
            String infoStudent[] = Student.split(":");
            
            String cpfStudent = infoStudent[1]; 

            if (cpfStudent.equals(cpf)){
                pos = c;
            }
        }
        
        for (int c = 0; c < ListClassroom.getInstance().size(); c++)
        {
            text += "Class on the day " + ListClassroom.getInstance().get(c).getDayClass() + " to " + ListClassroom.getInstance().get(c).getTimeClass() + "\n";
        }
        
        return text;
    }
}
