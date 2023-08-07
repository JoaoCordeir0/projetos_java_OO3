package com.sgat_system.controller;

import com.sgat_system.model.Instructor;
import com.sgat_system.model.ListInstructor;
import com.sgat_system.model.PrimaryKey;
import com.sgat_system.model.TableList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joao.cordeiro
 */
public class InstructorController implements PrimaryKey, TableList{
    
    public boolean registerInstructor(int id, String name, String cpf, String email, String phone)
    {
        Instructor instructor = new Instructor(id, name, cpf, email, phone);
        
        return ListInstructor.getInstance().add(instructor);
    }
    
    @Override
    public void tableListInformation(JTable Itable, String Location)
    {
        DefaultTableModel tbl = (DefaultTableModel) Itable.getModel();
        
        tbl.setRowCount(ListInstructor.getInstance().size());
        Itable.setModel(tbl);               
        
        for (int c = 0; c < ListInstructor.getInstance().size(); c++)
        {
            Itable.setValueAt(ListInstructor.getInstance().get(c).getNameInstructor(), c, 0);
            Itable.setValueAt(ListInstructor.getInstance().get(c).getCpfInstructor(), c, 1);      
            Itable.setValueAt(ListInstructor.getInstance().get(c).getPhoneInstructor(), c, 2);      
        }        
    }
    
    @Override
    public int getLastID()
    {
        if (!ListInstructor.getInstance().isEmpty())
        {                                    
            return ListInstructor.getInstance().get(ListInstructor.getInstance().size() - 1).getIdInstructor()+ 1;
        }        
        return 0;
    }
}
