/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author Samantha
 */
public class itemlist {

    public static Connection connect(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tomato","root","");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        return conn;
    }
    
}
