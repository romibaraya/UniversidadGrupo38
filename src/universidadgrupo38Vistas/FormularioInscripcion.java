
package universidadgrupo38Vistas;


import universidadgrupo38AccesoADatos.AlumnoData;

import universidadgrupo38AccesoADatos.InscripcionData;
import universidadgrupo38AccesoADatos.MateriaData;
import universidadgrupo38Entidades.Alumno;
import universidadgrupo38Entidades.Inscripcion;
import universidadgrupo38Entidades.Materia;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;







public class FormularioInscripcion extends javax.swing.JFrame {

        private List<Materia> ListaM;
        private List<Alumno> ListaA;
        
        private InscripcionData inscData;
        private MateriaData mData;
        private AlumnoData aData;
        
    
        private DefaultTableModel modelo;
    

    public FormularioInscripcion() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        aData = new AlumnoData();
        ListaA =aData.listarAlumnos();
        modelo= new DefaultTableModel();
        inscData = new InscripcionData();
        mData = new MateriaData();
        
        cargarAlumnos();
        armarCabeceraTabla();
  
    }

    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboxAlumno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        radioInscriptas = new javax.swing.JRadioButton();
        radioNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbAInscribir = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("FORMULARIO DE INSCRIPCIÓN");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Seleccione un Alumno");

        cboxAlumno.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cboxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxAlumnoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Listado de Materias");

        radioInscriptas.setBackground(new java.awt.Color(255, 209, 103));
        radioInscriptas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        radioInscriptas.setForeground(new java.awt.Color(102, 102, 102));
        radioInscriptas.setText("Materias Inscriptas");
        radioInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInscriptasActionPerformed(evt);
            }
        });

        radioNoInscriptas.setBackground(new java.awt.Color(255, 209, 103));
        radioNoInscriptas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        radioNoInscriptas.setForeground(new java.awt.Color(102, 102, 102));
        radioNoInscriptas.setText("Materias no inscriptas");
        radioNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoInscriptasActionPerformed(evt);
            }
        });

        jScrollPane1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtMaterias);

        jbInscribir.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jbInscribir.setText("Inscribir");
        jbInscribir.setEnabled(false);
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAInscribir.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jbAInscribir.setText("Anular Inscripcion");
        jbAInscribir.setEnabled(false);
        jbAInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAInscribirActionPerformed(evt);
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbInscribir)
                                .addGap(89, 89, 89)
                                .addComponent(jbAInscribir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioInscriptas)
                                .addGap(109, 109, 109)
                                .addComponent(radioNoInscriptas))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(radioInscriptas)
                    .addComponent(radioNoInscriptas))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbAInscribir)
                    .addComponent(jbSalir))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxAlumnoActionPerformed

    
    
    
    
    
    private void radioInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInscriptasActionPerformed
        
        
        borrarFilaTabla();
        radioNoInscriptas.setSelected(false);
        cargarDatosInscriptos();
        jbAInscribir.setEnabled(true);
        jbInscribir.setEnabled(false);
        
        
        
    }//GEN-LAST:event_radioInscriptasActionPerformed

    
    
    
    private void radioNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoInscriptasActionPerformed
        
         borrarFilaTabla();
         radioInscriptas.setSelected(false);
         cargarDatosNoInscriptos();
         jbAInscribir.setEnabled(false);
        jbInscribir.setEnabled(true);
        
        
        
    }//GEN-LAST:event_radioNoInscriptasActionPerformed

    
    
    
    
    
    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        
        
        int filaSeleccionada= jtMaterias.getSelectedRow();
        if(filaSeleccionada!=-1){
            
            Alumno a=(Alumno)cboxAlumno.getSelectedItem();
            
            int idMateria=(Integer)modelo.getValueAt(filaSeleccionada, 0);
            String nombreMateria=(String)modelo.getValueAt(filaSeleccionada, 1);
            int anio=(Integer)modelo.getValueAt(filaSeleccionada, 2);
            Materia m = new Materia(idMateria,nombreMateria,anio,true);
            
            Inscripcion i = new Inscripcion(a,m,0);
            inscData.guardarInscripcion(i);
            borrarFilaTabla();
            
            
        }
        
        
        
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbAInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAInscribirActionPerformed
        
        int filaSeleccionada = jtMaterias.getSelectedRow();
        
        if(filaSeleccionada != -1){
            
            Alumno a = (Alumno)cboxAlumno.getSelectedItem();
            int idMateria =(Integer) modelo.getValueAt(filaSeleccionada, 0);
            
            inscData.borrarInscripcion(a.getIdAlumno(), idMateria);
            borrarFilaTabla();
        }
        
        
        
        
    }//GEN-LAST:event_jbAInscribirActionPerformed

    
    
    
    

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
            java.util.logging.Logger.getLogger(FormularioInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioInscripcion().setVisible(true);
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
        filaCabecera.add("Año");
        
        for(Object it: filaCabecera){
            modelo.addColumn(it);
        }
        jtMaterias.setModel(modelo);

    }
    
    private void borrarFilaTabla(){
        
        int indice = modelo.getRowCount() -1;
        
        
        for(int i = indice; i>=0; i--){
            modelo.removeRow(i);
        }
        
    }
    
    private void cargarDatosNoInscriptos(){
        
        Alumno selec =(Alumno) cboxAlumno.getSelectedItem();
        ListaM = (ArrayList) inscData.obtenerMateriasNOCursadas(selec.getIdAlumno());
        
        for(Materia m: ListaM){
            modelo.addRow(new Object [] {m.getIdMateria(),m.getNombre(),m.getAnioMateria()});
        }
        
    }
    
    private void cargarDatosInscriptos(){
        
                Alumno selec =(Alumno) cboxAlumno.getSelectedItem();
        List <Materia> lista = inscData.obtenerMateriasCursadas(selec.getIdAlumno());
        
        for (Materia m : lista){
            modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre(),m.getAnioMateria()});
        }
        
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> cboxAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAInscribir;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable jtMaterias;
    private javax.swing.JRadioButton radioInscriptas;
    private javax.swing.JRadioButton radioNoInscriptas;
    // End of variables declaration//GEN-END:variables
}
