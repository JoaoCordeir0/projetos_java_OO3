package com.sgat_system.controller;

import com.sgat_system.model.Classroom;
import com.sgat_system.model.ListClassroom;
import com.sgat_system.model.ListInstructor;
import com.sgat_system.model.ListStudent;
import com.sgat_system.model.ListUsers;
import com.sgat_system.model.PrimaryKey;
import com.sgat_system.model.TableList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joaoc
 */
public class ClassroomController extends SchoolController implements TableList, PrimaryKey{
    
    public boolean registerClassroom(int id, String nameStudent, String instructor, String categoty, String dayClass, String timeClass)
    {
        // Extends SchoolController
        String nameSchool = getNameSchool();
        
        Classroom classroom = new Classroom(id, nameStudent, instructor, categoty, dayClass, timeClass, nameSchool);
        
        return ListClassroom.getInstance().add(classroom);        
    }
    
    //Returns the names and cpf to fill the combobox in the view
    public Vector comboBoxListStudentInfo()
    {
        Vector vetor = new Vector();
        
        for (int c = 0; c < ListStudent.getInstance().size(); c++)
        {
            vetor.addElement(ListStudent.getInstance().get(c).getNameStudent() + " : " + ListStudent.getInstance().get(c).getCpfStudent());
        }
        
        return vetor;
    }
    
    //Returns the names and cpf to fill the combobox in the view
    public Vector comboBoxListInstructorInfo()
    {
        Vector vetor = new Vector();
        
        for (int c = 0; c < ListInstructor.getInstance().size(); c++)
        {
            vetor.addElement(ListInstructor.getInstance().get(c).getNameInstructor()+ " : " + ListInstructor.getInstance().get(c).getCpfInstructor());
        }
        
        return vetor;
    }
    
    public void deleteClassroom(JTable Ctable)
    {
        if (Ctable.getSelectedRow() == -1)
        {
            JOptionPane.showMessageDialog(null, "Select a user in the table to delete", "Warning", 0);
        }
        else
        {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Warning", JOptionPane.YES_NO_OPTION);
            
            if (confirm == JOptionPane.YES_OPTION)
            {
                ListClassroom.getInstance().remove(Ctable.getSelectedRow());
                
                JOptionPane.showMessageDialog(null, "Success deleting user", "Warning", 1);
                
                tableListInformation(Ctable, "TableList");
            }
        }
    }
    
    @Override
    public void tableListInformation(JTable Ctable, String Location)
    {
        DefaultTableModel tbl = (DefaultTableModel) Ctable.getModel();
        
        tbl.setRowCount(ListClassroom.getInstance().size());
        Ctable.setModel(tbl);               
        
        if (Location.equals("Dashboard"))
        {
            for (int c = 0; c < ListClassroom.getInstance().size(); c++)
            {
                String Student = ListClassroom.getInstance().get(c).getNameStudentClass();
                String Instructor = ListClassroom.getInstance().get(c).getNameInstructorClass();
                
                String infoStudent[] = Student.split(":");
                String infoInstructor[] = Instructor.split(":");
                
                String nameStudent = infoStudent[0];
                String cpfStudent = infoStudent[1];              
                String nameInstructor = infoInstructor[0];                
                
                Ctable.setValueAt(nameInstructor, c, 0);
                Ctable.setValueAt(ListClassroom.getInstance().get(c).getCategoryClass(), c, 1);      
                Ctable.setValueAt(nameStudent, c, 2);      
                Ctable.setValueAt(cpfStudent, c, 3);    
                Ctable.setValueAt(ListClassroom.getInstance().get(c).getDayClass(), c, 4);    
                Ctable.setValueAt(ListClassroom.getInstance().get(c).getTimeClass(), c, 5);                     
            }   
        }
    }
    
    @Override
    public int getLastID()
    {
        if (!ListClassroom.getInstance().isEmpty())
        {                                    
            return ListClassroom.getInstance().get(ListClassroom.getInstance().size() - 1).getIdClass() + 1;
        }        
        return 0;
    }
}
