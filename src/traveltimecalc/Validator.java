/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package traveltimecalc;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author michael
 */
public class Validator {
    
    static class StaticValidator {
        
        public static Boolean IsPresent(JTextField txtbox){
            if(txtbox.getText().equals("")){
                JOptionPane.showMessageDialog(null, "\"" + txtbox.getName() + "\"" + " is a required field." );
                txtbox.grabFocus();
                return false;
            }
            return true;
        }
        
        public static Boolean IsCboPresent(JComboBox cbobox){
            if(cbobox.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null, "\"" + cbobox.getName() + "\"" + " is a required field." );
                return false;
            }
            return true;      
        }
        
        public static Boolean IsFloat(JTextField txtbox){
            try{
                Float.parseFloat(txtbox.getText());
                return true;
            }catch(NumberFormatException f){
                JOptionPane.showMessageDialog(null, "\"" + txtbox.getName() + "\"" + " must be a float." );
                txtbox.grabFocus();
                return false;
            }
        }
        
        
    
    }
    
}
