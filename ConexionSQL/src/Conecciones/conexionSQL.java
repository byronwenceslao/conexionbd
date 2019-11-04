/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conecciones;

/**
 *
 * @author Byron González
 */

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexionSQL {
    Connection connection = null;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection =  DriverManager.getConnection("jdbc:mysql://localhost/escuelita","byron","1234");
            JOptionPane.showMessageDialog(null,"Conexion Exitosa");
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error en la conexion");
        }
        return connection;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    