/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo38;

import java.sql.Connection;
import java.time.LocalDate;
import universidadgrupo38AccesoADatos.AlumnoData;
import universidadgrupo38AccesoADatos.Conexion;
import universidadgrupo38Entidades.Alumno;
import universidadgrupo38Vistas.Vista;
/**
 *
 * @author Usuario
 */
public class UniversidadGrupo38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Vista pantalla = new Vista();
      pantalla.setVisible(true);
      pantalla.setLocationRelativeTo(null);
      Connection con=Conexion.getConexion();
      
      
      
      
        Alumno juan=new Alumno(123122598,"Sosa","Pedro",LocalDate.of(1980, 4 , 25), true);
        AlumnoData alu=new AlumnoData();
        //alu.guardarAlumno(juan);
        //alu.modificarAlumno(juan);
        alu.eliminarAlumno(11);
    }
    
}
