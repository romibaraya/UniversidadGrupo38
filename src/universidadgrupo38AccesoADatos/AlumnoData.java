
package universidadgrupo38AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidadgrupo38Entidades.Alumno;


public class AlumnoData {
    
    private Connection con = null;
    
    public AlumnoData(){
        con= Conexion.getConexion();
    }
    
    public void guardarAlumno(Alumno alumno){
        
        String sql="INSERT INTO alumnos(dni, apellido, nombre, fechaNacimiento, estado)"
                + "VALUES(?, ?, ?, ?, ?)";
        
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno Guardado");

             }
            ps.close();
            
        } 
        
        
        
        
        catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno");
        
        
        }
        
        
        
        
        
    }
    
    
    public void modificarAlumno(Alumno alumno){
        
        
        
        String sql = "UPDATE alumnos SET dni=?, apellido=?, nombre =?, fechaNacimiento=?"
                + "WHERE idALumno = ?";
        
        
       try{ PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1,alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4,Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, alumno.getIdAlumno());
            int exito=ps.executeUpdate();
            
            if(exito==1){
                JOptionPane.showMessageDialog(null,"Alumno Modificado");
            }
       }catch(SQLException ex){
           
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno");
           
       }
       
        
    }
    
    
    
    
    public void eliminarAlumno (int id){
        String sql = "UPDATE alumnos SET estado = 0 WHERE idAlumno = ? ";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt (1,id);
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null,"Alumno Eliminado");
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
    }
    
}
