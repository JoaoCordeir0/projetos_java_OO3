package com.sgat_system.controller;

import com.sgat_system.model.ListClassroom;
import com.sgat_system.model.ListStudent;
import com.sgat_system.model.PrimaryKey;
import com.sgat_system.model.Student;
import com.sgat_system.model.TableList;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joaoc
 */
public class StudentController implements PrimaryKey, TableList{
    
    public boolean registerStudent(int id, String name, String birthDate, String cpf, String email, String phone, double value, int parcels)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date registerDate = new Date();       
        
        Student student = new Student(id, name, birthDate, cpf, email, phone, value, parcels, sdf.format(registerDate));
        
        return ListStudent.getInstance().add(student);
    }
   
    @Override
    public void tableListInformation(JTable Stable, String Location) {
        
        DefaultTableModel tbl = (DefaultTableModel) Stable.getModel();
        
        tbl.setRowCount(ListStudent.getInstance().size());
        Stable.setModel(tbl);               
        
        if (Location.equals("Dashboard"))
        {
            for (int c = 0; c < ListStudent.getInstance().size(); c++)
            {
                Stable.setValueAt(ListStudent.getInstance().get(c).getNameStudent(), c, 0);
                Stable.setValueAt(ListStudent.getInstance().get(c).getCpfStudent(), c, 1);      
                Stable.setValueAt(ListStudent.getInstance().get(c).getBirthDateStudent(), c, 2);      
                Stable.setValueAt(ListStudent.getInstance().get(c).getBirthDateStudent(), c, 3);      
            }   
        }
        else if(Location.equals("TableList"))
        {
            for (int c = 0; c < ListStudent.getInstance().size(); c++)
            {
                Stable.setValueAt(ListStudent.getInstance().get(c).getIdStudent(), c, 0);
                Stable.setValueAt(ListStudent.getInstance().get(c).getNameStudent(), c, 1);      
                Stable.setValueAt(ListStudent.getInstance().get(c).getCpfStudent(), c, 2);      
                Stable.setValueAt(ListStudent.getInstance().get(c).getBirthDateStudent(), c, 3);
                Stable.setValueAt(ListStudent.getInstance().get(c).getEmailStudent(), c, 4);
                Stable.setValueAt(ListStudent.getInstance().get(c).getPhoneStudent(), c, 5);
                Stable.setValueAt(ListStudent.getInstance().get(c).getValueStudent(), c, 6);
                Stable.setValueAt(ListStudent.getInstance().get(c).getParcelsStudent(), c, 7);
                Stable.setValueAt(ListStudent.getInstance().get(c).getRegisterDate(), c, 8);                
            }   
        }
    }
    
    public void deleteStudent(JTable Stable)
    {
        if (Stable.getSelectedRow() == -1)
        {
            JOptionPane.showMessageDialog(null, "Select a user in the table to delete", "Warning", 0);
        }
        else
        {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Warning", JOptionPane.YES_NO_OPTION);
            
            if (confirm == JOptionPane.YES_OPTION)
            {
                ListStudent.getInstance().remove(Stable.getSelectedRow());
                
                JOptionPane.showMessageDialog(null, "Success deleting user", "Warning", 1);
                
                tableListInformation(Stable, "TableList");
            }
        }
    }
    
    @Override
    public int getLastID()
    {
        if (!ListStudent.getInstance().isEmpty())
        {                                    
            return ListStudent.getInstance().get(ListStudent.getInstance().size() - 1).getIdStudent() + 1;
        }        
        return 0;
    }    
}
