/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author admin
 */
public class diseno {
    String enfoco = "#00bcd4";    
    String plomo = "#818181";
    String negro = "#000000";

    public void msg(JLabel focus, JTextField letra, String message, int tamano) {
        if (tamano == 0) {
            letra.setText(message);
            letra.setForeground(java.awt.Color.decode(plomo));            
            //focus.setForeground(java.awt.Color.decode(plomo));
            
        }
    }
    
    public void click(JLabel focus ,JTextField letra, String message){
        if (letra.getText().equals(message)) {
            letra.setText("");
            letra.setForeground(java.awt.Color.decode(negro));             
            //focus.setForeground(java.awt.Color.decode(enfoco));             
        }       
                
    } 
    
    public void changeIcon(JLabel neoIco ,JButton button, String ico){
        ImageIcon icon = null;               
        if (ico.equals("view")) {                
             neoIco.setText("hide");
        }else{             
             neoIco.setText("view");
        }     
           icon = new ImageIcon(this.getClass().getResource("img/"+neoIco.getText()+".png"));
           button.setIcon(icon); 
           
    } 
    
}
