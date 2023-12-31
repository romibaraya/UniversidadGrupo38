/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo38Vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Franco
 */
public class menuView extends javax.swing.JFrame {

    /**
     * Creates new form menuView
     */
    public menuView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(500,520);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono = new ImageIcon(getClass().getResource("/universidadgrupo38/recursos/5437842.jpg"));
        Image miImagen = icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void  paintComponent(Graphics g ){

                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);

            }
        }
        ;
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAlumno = new javax.swing.JMenu();
        FormularioDeAlumno = new javax.swing.JMenuItem();
        menuMateria = new javax.swing.JMenu();
        FormularioDeMateria = new javax.swing.JMenuItem();
        menuInscripcion = new javax.swing.JMenu();
        ManejoDeInscripciones = new javax.swing.JMenuItem();
        ManipulacionDeNotas = new javax.swing.JMenuItem();
        menuNotas = new javax.swing.JMenu();
        AlumnosPorMateria = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        menuAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo38/recursos/tarjeta-de-identificacion (2).png"))); // NOI18N

        FormularioDeAlumno.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        FormularioDeAlumno.setText("Formulario de Alumno");
        FormularioDeAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioDeAlumnoActionPerformed(evt);
            }
        });
        menuAlumno.add(FormularioDeAlumno);

        jMenuBar1.add(menuAlumno);

        menuMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo38/recursos/archivo-adjunto (1).png"))); // NOI18N

        FormularioDeMateria.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        FormularioDeMateria.setText("Formulario de Materia");
        FormularioDeMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioDeMateriaActionPerformed(evt);
            }
        });
        menuMateria.add(FormularioDeMateria);

        jMenuBar1.add(menuMateria);

        menuInscripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo38/recursos/contrato (1).png"))); // NOI18N

        ManejoDeInscripciones.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        ManejoDeInscripciones.setText("Manejo de Inscripciones");
        ManejoDeInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManejoDeInscripcionesActionPerformed(evt);
            }
        });
        menuInscripcion.add(ManejoDeInscripciones);

        ManipulacionDeNotas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        ManipulacionDeNotas.setText("Manipulacion de Notas");
        ManipulacionDeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManipulacionDeNotasActionPerformed(evt);
            }
        });
        menuInscripcion.add(ManipulacionDeNotas);

        jMenuBar1.add(menuInscripcion);

        menuNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo38/recursos/periodico (1).png"))); // NOI18N
        menuNotas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        AlumnosPorMateria.setText("Alumnos por Materia");
        AlumnosPorMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnosPorMateriaActionPerformed(evt);
            }
        });
        menuNotas.add(AlumnosPorMateria);

        jMenuBar1.add(menuNotas);

        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo38/recursos/salir00.png"))); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuSalir.add(jMenuItem1);

        jMenuBar1.add(menuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FormularioDeAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioDeAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioAlumnoView alumno = new FormularioAlumnoView();
        alumno.setVisible(true);
        alumno.getContentPane().setBackground(new Color(26, 83, 91));
        escritorio.add(alumno);
        
    }//GEN-LAST:event_FormularioDeAlumnoActionPerformed

    private void FormularioDeMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioDeMateriaActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        FormularioMateria materia = new FormularioMateria();
        materia.setVisible(true);
        materia.getContentPane().setBackground(new Color(255, 107, 107));
        escritorio.add(materia);
        
        
        
        
    }//GEN-LAST:event_FormularioDeMateriaActionPerformed

    private void ManejoDeInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManejoDeInscripcionesActionPerformed

        escritorio.removeAll();
        escritorio.repaint();
        FormularioInscripcion inscripciones = new FormularioInscripcion();
        inscripciones.setVisible(true);
        inscripciones.getContentPane().setBackground(new Color(255, 209, 103));
        escritorio.add(inscripciones);
        



    }//GEN-LAST:event_ManejoDeInscripcionesActionPerformed

    private void ManipulacionDeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManipulacionDeNotasActionPerformed
       
        
        escritorio.removeAll();
        escritorio.repaint();
        FormularioNotas notas = new FormularioNotas();
        notas.setVisible(true);
        notas.getContentPane().setBackground(new Color(255, 209, 103));
        escritorio.add(notas);
        
        
        
        
    }//GEN-LAST:event_ManipulacionDeNotasActionPerformed

    private void AlumnosPorMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnosPorMateriaActionPerformed

        escritorio.removeAll();
        escritorio.repaint();
        AlumnosPorMateriaView APMV = new AlumnosPorMateriaView();
        APMV.setVisible(true);
        APMV.getContentPane().setBackground(new Color(78, 205, 196));
        escritorio.add(APMV);


        
    }//GEN-LAST:event_AlumnosPorMateriaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(menuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AlumnosPorMateria;
    private javax.swing.JMenuItem FormularioDeAlumno;
    private javax.swing.JMenuItem FormularioDeMateria;
    private javax.swing.JMenuItem ManejoDeInscripciones;
    private javax.swing.JMenuItem ManipulacionDeNotas;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuAlumno;
    private javax.swing.JMenu menuInscripcion;
    private javax.swing.JMenu menuMateria;
    private javax.swing.JMenu menuNotas;
    private javax.swing.JMenu menuSalir;
    // End of variables declaration//GEN-END:variables
}
