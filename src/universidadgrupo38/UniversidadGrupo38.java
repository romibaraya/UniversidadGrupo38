
package universidadgrupo38;

import java.sql.Connection;
import java.time.LocalDate;
import universidadgrupo38AccesoADatos.AlumnoData;
import universidadgrupo38AccesoADatos.Conexion;
import universidadgrupo38AccesoADatos.InscripcionData;
import universidadgrupo38AccesoADatos.MateriaData;
import universidadgrupo38Entidades.Alumno;
import universidadgrupo38Entidades.Inscripcion;
import universidadgrupo38Entidades.Materia;
import universidadgrupo38Vistas.menuView;

public class UniversidadGrupo38 {


    public static void main(String[] args) {
           menuView pantalla = new menuView();
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
        }*/
        
      
//      Materia mate=new Materia(3,"Arte y Literatura", 2023,true);
//      MateriaData mat=new MateriaData();
//      mat.guardarMateria(mate);
      //mat.modificarMateria(mate);
      //mat.eliminarMateria(1);
      /*Materia materiaEncontrada=mat.buscarMateria(2);
      if(materiaEncontrada!=null){
          System.out.println("Materia: "+materiaEncontrada.getNombre());
      }
      
      /*
      //MateriaData mat=new MateriaData();
      for(Materia materia:mat.listarMaterias()){
          
          System.out.println("Id: "+materia.getIdMateria());
          System.out.println("Materia: "+materia.getNombre() );
          System.out.println("Año: "+materia.getAnioMateria());
          
      }*/
      
//      AlumnoData ad = new AlumnoData();
//      MateriaData md=new MateriaData();
//      InscripcionData id= new InscripcionData();
//      
//      Alumno juan = ad.buscarAlumno(9);
//      Materia mate =md.buscarMateria(2);
//      Inscripcion insc = new Inscripcion(juan,mate,9);
      //id.guardarInscripcion(insc);
      //id.actualizarNota(9, 2, 7);
      //id.borrarInscripcion(9, 2);
     
    /* for(Inscripcion inscripcion : id.obtenerInscripciones() ){
         System.out.println("id "+ inscripcion.getIdInscripcion() );
         System.out.println("Apellido "+inscripcion.getAlumno().getApellido());
         System.out.println("Materia "+inscripcion.getMateria().getNombre());
         
     }*/
     
    
//    for (Materia materia: id.obtenerMateriasNOCursadas(9)){
//        System.out.println("nombre "+  materia.getNombre());
//    }
//    
//    
//    
//    

}

    }
     
     

