/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo38AccesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author LV-energy
 */
public class Conexion {
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="universidadgrupo38";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;
   
   
    private Conexion(){}
    
    public static Connection getConexion(){
        
        if(connection ==null){
            try{
                Class.forName("org.mariadb.jdbc.Driver");
                connection=DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
                 //JOptionPane.showMessageDialog(null,"Conectado");
            } catch (ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null,"Error al cargar los driver");
            } catch (SQLException ex){
                 JOptionPane.showMessageDialog(null,"Error al conectar a la base de datos");
                           
                        
            }
        }
    return connection;
    }
    
}
