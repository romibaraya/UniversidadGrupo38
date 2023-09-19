package universidadgrupo38AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidadgrupo38AccesoADatos.Conexion;
import universidadgrupo38Entidades.Inscripcion;


public class InscripcionData {
    
  
    
    private Connection  con = null;
    
    public InscripcionData(){
        
        this.con=Conexion.getConexion();
        
    }
    
    public void guardarInscripcion(Inscripcion insc){
        String sql="INSERT INTO inscripcion(idALumno,idMateria, nota) Values(?,?,?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Inscripcion Registrada");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscipcion");
        }
        
        
    }
    
    
    public void actualizarNota(int idAlumno,int idMateria, double nota ){
        
        String sql= "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? and idMateria = ?";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2,idAlumno);
            ps.setInt(3, idMateria);
            int fila=ps.executeUpdate();
            
            if (fila>0){
                 JOptionPane.showMessageDialog(null, "Nota Actualizada");
            }
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscipcion");
        }
    }
    
    
    public void borrarInscripcion(int idAlumno, int idMateria){
        
        String sql="DELETE FROM inscripcion WHERE idALumno=? and idMateria=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int fila= ps.executeUpdate();
            
            if(fila>0){
                JOptionPane.showMessageDialog(null, "Inscripción Borrada");
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscipcion");
        }
        
        
        
        
    } 
    
}
