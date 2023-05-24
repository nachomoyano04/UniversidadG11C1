/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

/**
 *
 * @author marcel.olguin
 */
public class sistemaUniv extends javax.swing.JFrame {

    /**
     * Creates new form sistemaUniv
     */
    public sistemaUniv() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jArchivo = new javax.swing.JMenu();
        jmiAltaDeAlumnos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiAltaDeMaterias = new javax.swing.JMenuItem();
        jInscripciones = new javax.swing.JMenu();
        jmiInscribirEnMateria = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jmiDesinscribirDeMateria = new javax.swing.JMenuItem();
        jCargaNotas = new javax.swing.JMenu();
        jConsultas = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(51, 126, 240));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );

        jArchivo.setText("Archivo");

        jmiAltaDeAlumnos.setText("Menu Alumnos");
        jArchivo.add(jmiAltaDeAlumnos);
        jArchivo.add(jSeparator1);

        jmiAltaDeMaterias.setText("Menu Materias");
        jArchivo.add(jmiAltaDeMaterias);

        jMenuBar1.add(jArchivo);

        jInscripciones.setText("Inscripciones");

        jmiInscribirEnMateria.setText("Inscribir a Materia");
        jmiInscribirEnMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInscribirEnMateriaActionPerformed(evt);
            }
        });
        jInscripciones.add(jmiInscribirEnMateria);
        jInscripciones.add(jSeparator3);

        jmiDesinscribirDeMateria.setText("Desinscribir de Materia");
        jInscripciones.add(jmiDesinscribirDeMateria);

        jMenuBar1.add(jInscripciones);

        jCargaNotas.setText("Carga de Notas");
        jMenuBar1.add(jCargaNotas);

        jConsultas.setText("Consultas");
        jMenuBar1.add(jConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiInscribirEnMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInscribirEnMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiInscribirEnMateriaActionPerformed

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
            java.util.logging.Logger.getLogger(sistemaUniv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sistemaUniv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sistemaUniv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sistemaUniv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sistemaUniv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jArchivo;
    private javax.swing.JMenu jCargaNotas;
    private javax.swing.JMenu jConsultas;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jInscripciones;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem jmiAltaDeAlumnos;
    private javax.swing.JMenuItem jmiAltaDeMaterias;
    private javax.swing.JMenuItem jmiDesinscribirDeMateria;
    private javax.swing.JMenuItem jmiInscribirEnMateria;
    // End of variables declaration//GEN-END:variables
}
