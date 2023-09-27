
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


public class FormularioNotas extends javax.swing.JFrame {

    
        private List<Inscripcion> ListaI;
        private List<Alumno> ListaA;
        
        private InscripcionData inscData;
        private MateriaData mData;
        private AlumnoData aData;
        private DefaultTableModel modelo;

    public FormularioNotas() {
        initComponents();
        this.setLocationRelativeTo(null);
        aData = new AlumnoData();
        ListaA =aData.listarAlumnos();
        inscData = new InscripcionData();
        modelo= new DefaultTableModel();
        
        
        cargarAlumnos();
        armarCabeceraTabla();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboxAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtNotaAlumno = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("CARGA DE NOTAS");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Seleccione un alumno:");

        cboxAlumno.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cboxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxAlumnoActionPerformed(evt);
            }
        });

        jtNotaAlumno.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jtNotaAlumno.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtNotaAlumno);

        jbGuardar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jbGuardar.setText("Modificar Nota");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(jbGuardar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbSalir)
                                    .addGap(28, 28, 28)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
       dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void cboxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxAlumnoActionPerformed

       
        
        borrarFilaTabla();
        cargarDatosInscriptos();
        
        
        
        
    }//GEN-LAST:event_cboxAlumnoActionPerformed

    
    
    
    
    
    
    
    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
            
        int filaseleccionada = jtNotaAlumno.getSelectedRow();

    if (filaseleccionada != -1) {
        Alumno a = (Alumno) cboxAlumno.getSelectedItem();
        int idMateria = (Integer) modelo.getValueAt(filaseleccionada, 0);
        int idAlumno = a.getIdAlumno();
        
        // Obtener la nota actual de la celda
        double notaActual = (Double) modelo.getValueAt(filaseleccionada, 2);

        // Solicitar al usuario la nueva nota
        String inputNota = JOptionPane.showInputDialog(this, "Ingrese la nueva nota:", notaActual);

        try {
            // Convertir la entrada del usuario en un valor double
            double nuevaNota = Double.parseDouble(inputNota);

            // Actualizar la celda en el modelo de datos con la nueva nota
            modelo.setValueAt(nuevaNota, filaseleccionada, 2);

            // Actualizar la base de datos con la nueva nota
            inscData.actualizarNota(idAlumno, idMateria, nuevaNota);
            System.out.println(idAlumno + " " + idMateria + " " + nuevaNota);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese una nota válida.");
        }
    }
        
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(FormularioNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioNotas().setVisible(true);
            }
        });
    }
    
    private void cargarAlumnos(){
        for(Alumno item: ListaA){
            cboxAlumno.addItem(item);
        }
    }
    private void armarCabeceraTabla(){
        
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Nota");
        
        for(Object it: filaCabecera){
            modelo.addColumn(it);
        }
        jtNotaAlumno.setModel(modelo);

    }
    
    private void cargarDatosInscriptos(){
       
                Alumno selec =(Alumno) cboxAlumno.getSelectedItem();
                
         
       List <Inscripcion> lista = inscData.obtenerInscripcionesPorAlumno(selec.getIdAlumno());
        
       for (Inscripcion m : lista){
           
            modelo.addRow(new Object[]{m.getMateria().getIdMateria(),m.getMateria().getNombre(),m.getNota()});
        }
        
    }
    
    private void borrarFilaTabla(){
        
        int indice = modelo.getRowCount() -1;
        
        
        for(int i = indice; i>=0; i--){
            modelo.removeRow(i);
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> cboxAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable jtNotaAlumno;
    // End of variables declaration//GEN-END:variables
}
