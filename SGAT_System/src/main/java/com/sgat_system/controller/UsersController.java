package com.sgat_system.controller;

import com.sgat_system.model.ListUsers;
import com.sgat_system.model.PrimaryKey;
import com.sgat_system.model.TableList;
import com.sgat_system.model.Users;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joaoc
 */
public class UsersController implements PrimaryKey, TableList{       
    
    public boolean registerUser(int id, String name, String cpf, String birthDate, String email, String phone, String password)
    {
        Users user = new Users(id, name, cpf, birthDate, email, phone, password);
        
        return ListUsers.getInstance().add(user);
    }
    
    @Override
    public void tableListInformation(JTable Utable, String Location)
    {
        DefaultTableModel tbl = (DefaultTableModel) Utable.getModel();
        
        tbl.setRowCount(ListUsers.getInstance().size());
        Utable.setModel(tbl);               
        
        for (int c = 0; c < ListUsers.getInstance().size(); c++)
        {
            Utable.setValueAt(ListUsers.getInstance().get(c).getId(), c, 0);
            Utable.setValueAt(ListUsers.getInstance().get(c).getName(), c, 1);
            Utable.setValueAt(ListUsers.getInstance().get(c).getCpf(), c, 2);
            Utable.setValueAt(ListUsers.getInstance().get(c).getBirthDate(), c,3);
            Utable.setValueAt(ListUsers.getInstance().get(c).getEmail(), c, 4);
            Utable.setValueAt(ListUsers.getInstance().get(c).getPhone(), c, 5);
            Utable.setValueAt(ListUsers.getInstance().get(c).getPassword(), c, 6);
        }        
    }
    
    public void deleteUser(JTable Utable)
    {    
        if (Utable.getSelectedRow() == -1)
        {
            JOptionPane.showMessageDialog(null, "Select a user in the table to delete", "Warning", 0);
        }
        else
        {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Warning", JOptionPane.YES_NO_OPTION);
            
            if (confirm == JOptionPane.YES_OPTION)
            {
                ListUsers.getInstance().remove(Utable.getSelectedRow());
                
                JOptionPane.showMessageDialog(null, "Success deleting user", "Warning", 1);
                
                tableListInformation(Utable, "TableList");
            }
        }
    }   
    
    public static boolean isValidEmailAddress(String email)
    {
       String expression = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
       
       Pattern pattern = Pattern.compile(expression);
       Matcher matcher = pattern.matcher(email);
       
       return matcher.matches();
    }     
         
    @Override
    public int getLastID()
    {
        if (!ListUsers.getInstance().isEmpty())
        {                                    
            return ListUsers.getInstance().get(ListUsers.getInstance().size() - 1).getId() + 1;
        }        
        return 0;
    }
}
