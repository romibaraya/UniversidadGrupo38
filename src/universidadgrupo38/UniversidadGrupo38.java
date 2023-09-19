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
import universidadgrupo38AccesoADatos.MateriaData;
import universidadgrupo38Entidades.Alumno;
import universidadgrupo38Entidades.Materia;
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
      
      
      
      /*
        //Alumno juan=new Alumno(123122598,"Sosa","Pedro",LocalDate.of(1980, 4 , 25), true);
        AlumnoData alu=new AlumnoData();
        //alu.guardarAlumno(juan);
        //alu.modificarAlumno(juan);
        //alu.eliminarAlumno(11);
        Alumno alumnoEncontrado=alu.buscarAlumno(10);
       
        System.out.println("DNI: "+alumnoEncontrado.getDni());
        System.out.println("Apellido: "+alumnoEncontrado.getApellido());
        

      
        AlumnoData alu=new AlumnoData ();
        for(Alumno alumno:alu.listarAlumnos()){
            
            System.out.println(alumno.getDni());
            System.out.println(alumno.getApellido());
            System.out.println(alumno.getNombre());
            System.out.println(alumno.getFechaNac());
        }
        
      
      //Materia mate=new Materia(5,"Física I", 2023,true);
      MateriaData mat=new MateriaData();
      //mat.guardarMateria(mate);
      //mat.modificarMateria(mate);
      //mat.eliminarMateria(5);
      Materia materiaEncontrada=mat.buscarMateria(5);
      if(materiaEncontrada!=null){
          System.out.println("Materia: "+materiaEncontrada.getNombre());
      }
      */
      
      MateriaData mat=new MateriaData();
      for(Materia materia:mat.listarMaterias()){
          
          System.out.println("Id: "+materia.getIdMateria());
          System.out.println("Materia: "+materia.getNombre() );
          System.out.println("Año: "+materia.getAnioMateria());
          
      }
      
    }
    
}
