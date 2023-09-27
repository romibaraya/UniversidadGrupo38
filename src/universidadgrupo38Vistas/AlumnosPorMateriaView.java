
package universidadgrupo38Vistas;

import universidadgrupo38AccesoADatos.AlumnoData;

import universidadgrupo38AccesoADatos.InscripcionData;
import universidadgrupo38AccesoADatos.MateriaData;
import universidadgrupo38Entidades.Alumno;
import universidadgrupo38Entidades.Inscripcion;
import universidadgrupo38Entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AlumnosPorMateriaView extends javax.swing.JFrame {
        
        private List<Materia> ListaM;
        private List<Inscripcion> ListaI;
        private List<Alumno> ListaA;
        
        private MateriaData mData;
        private AlumnoData aData;
        private InscripcionData inscData;
        
        private DefaultTableModel modelo;


 public AlumnosPorMateriaView() {
    initComponents();
    
    aData = new AlumnoData();
    mData = new MateriaData(); // Primero inicializa mData
    ListaA = aData.listarAlumnos();
    ListaM = mData.listarMaterias(); // Luego llama a listarMaterias
    modelo = new DefaultTableModel();
    inscData = new InscripcionData();
    
    armarCabeceraTabla();
    cargarMaterias();
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboxMateria = new javax.swing.JComboBox<>();
        jbSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAluMateria = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTADO ALUMNOS POR MATERIA");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione una materia:");

        cboxMateria.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cboxMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxMateriaActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jScrollPane2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jtAluMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtAluMateria);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cboxMateria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbSalir)))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(125, 125, 125))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(jbSalir)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void cboxMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxMateriaActionPerformed

        // Obtén la materia seleccionada en el JComboBox
    Materia materiaSeleccionada = (Materia) cboxMateria.getSelectedItem();

    // Limpia la tabla antes de cargar nuevos datos
    modelo.setRowCount(0);

    // Obtén la lista de alumnos inscritos en la materia seleccionada
    List<Alumno> alumnosMateria = inscData.obtenerAlumnosXMateria(materiaSeleccionada.getIdMateria());

    // Carga los alumnos correspondientes en la tabla
    for (Alumno alumno : alumnosMateria) {
        modelo.addRow(new Object[] {
            alumno.getIdAlumno(),
            alumno.getDni(),
            alumno.getApellido(),
            alumno.getNombre()
        });
    }
      
        
        
    }//GEN-LAST:event_cboxMateriaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlumnosPorMateriaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlumnosPorMateriaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlumnosPorMateriaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlumnosPorMateriaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnosPorMateriaView().setVisible(true);
            }
        });
    }

    
    
    
    
    private void armarCabeceraTabla(){
        
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("DNI");
        filaCabecera.add("Apellido");
        filaCabecera.add("Nombre");
        
        
        
        for(Object it: filaCabecera){
            modelo.addColumn(it);
        }
        jtAluMateria.setModel(modelo);

    }
    
    
    private void cargarMaterias(){
        for(Materia item: ListaM){
            cboxMateria.addItem(item);
        }
    }
    
    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Materia> cboxMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable jtAluMateria;
    // End of variables declaration//GEN-END:variables
}
