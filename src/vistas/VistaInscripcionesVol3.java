/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

    import controladoras.AlumnoData;
    import controladoras.MateriaData;
    import controladoras.InscripcionData;
    import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.awt.Color;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author nacho
 */
public class VistaInscripcionesVol3 extends javax.swing.JFrame {
    private AlumnoData ad = new AlumnoData();
    private MateriaData md = new MateriaData();
    private InscripcionData inDa = new InscripcionData();
    private Alumno al;
    private DefaultTableModel tablaMateriasCursadas;
    private DefaultTableModel tablaMateriasNOCursadas;
    private HashMap<String,Integer> materias = new HashMap();

    public VistaInscripcionesVol3() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableMaterias = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfDNI = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfEstado = new javax.swing.JTextField();
        jbBuscarAlumnoPorDNI = new javax.swing.JButton();
        jbInscribir = new javax.swing.JButton();
        jbDesinscribir = new javax.swing.JButton();
        jbActivarAlumno = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableMateriasNOCursadas = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jbLimpiar = new javax.swing.JButton();

        jButton1.setText("Activar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("FORMULARIO DE INSCRIPCIONES");

        jtableMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Año"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableMaterias.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtableMaterias);
        if (jtableMaterias.getColumnModel().getColumnCount() > 0) {
            jtableMaterias.getColumnModel().getColumn(0).setResizable(false);
            jtableMaterias.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("DNI");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("NOMBRE");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("APELLIDO");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("FECHA");

        jtfNombre.setEditable(false);
        jtfNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfNombre.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        jtfApellido.setEditable(false);
        jtfApellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfApellido.setForeground(new java.awt.Color(0, 0, 0));

        jtfFecha.setEditable(false);
        jtfFecha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfFecha.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("ESTADO");

        jtfEstado.setEditable(false);
        jtfEstado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jbBuscarAlumnoPorDNI.setText("BUSCAR");
        jbBuscarAlumnoPorDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarAlumnoPorDNIActionPerformed(evt);
            }
        });

        jbInscribir.setText("Inscribir");
        jbInscribir.setEnabled(false);
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbDesinscribir.setText("Desinscribir");
        jbDesinscribir.setEnabled(false);
        jbDesinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDesinscribirActionPerformed(evt);
            }
        });

        jbActivarAlumno.setText("Activar");
        jbActivarAlumno.setEnabled(false);
        jbActivarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActivarAlumnoActionPerformed(evt);
            }
        });

        jtableMateriasNOCursadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Año"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableMateriasNOCursadas.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtableMateriasNOCursadas);
        if (jtableMateriasNOCursadas.getColumnModel().getColumnCount() > 0) {
            jtableMateriasNOCursadas.getColumnModel().getColumn(0).setResizable(false);
            jtableMateriasNOCursadas.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("MATERIAS INSCRIPTAS");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("MATERIAS NO INSCRIPTAS");

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jbActivarAlumno)
                .addGap(18, 18, 18)
                .addComponent(jbLimpiar)
                .addGap(18, 18, 18)
                .addComponent(jbInscribir)
                .addGap(18, 18, 18)
                .addComponent(jbDesinscribir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbBuscarAlumnoPorDNI)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(61, 61, 61)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscarAlumnoPorDNI))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbActivarAlumno)
                    .addComponent(jbInscribir)
                    .addComponent(jbDesinscribir)
                    .addComponent(jbLimpiar))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarAlumnoPorDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarAlumnoPorDNIActionPerformed
        if(!(jtfDNI.getText().equalsIgnoreCase(""))){    
            //ACTIVAMOS BOTONES
            jbActivarAlumno.setEnabled(true);
            jbInscribir.setEnabled(true);
            jbDesinscribir.setEnabled(true);
            //DESACTIVAMOS BOTON BUSCAR
            jbBuscarAlumnoPorDNI.setEnabled(false);
            //PARTE DE BUSQUEDA ALUMNO
            String dni = jtfDNI.getText();
            al = ad.buscarAlumnoPorDni(Integer.parseInt(dni));
            jtfNombre.setText(al.getNombre());jtfNombre.setEditable(false);
            jtfApellido.setText(al.getApellido());
            jtfFecha.setText(al.getFechaNacimiento().toString());
            if(al.isEstado()){
                jtfEstado.setText(" Activo");
                jtfEstado.setForeground(Color.green);
            }else{
                jtfEstado.setText(" Inactivo");
                jtfEstado.setForeground(Color.red);
            }
            //PARTE DE BUSQUEDA MATERIA
            tablaMateriasCursadas = (DefaultTableModel) jtableMaterias.getModel();
            tablaMateriasNOCursadas = (DefaultTableModel) jtableMateriasNOCursadas.getModel();
            for (Materia mats: inDa.obtenerMateriasCursadas(al.getId_alumno())) {
                tablaMateriasCursadas.insertRow(tablaMateriasCursadas.getRowCount(), new Object[]{mats.getNombre(),mats.getAnio()});
                materias.put(mats.getNombre(), mats.getId_materia());
            }
            for (Materia mats : inDa.obtenerMateriasNOCursadas(al.getId_alumno())) {
                tablaMateriasNOCursadas.insertRow(tablaMateriasNOCursadas.getRowCount(), new Object[]{mats.getNombre(),mats.getAnio()});
                materias.put(mats.getNombre(), mats.getId_materia());
            }
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese un DNI al campo");
        }
    }//GEN-LAST:event_jbBuscarAlumnoPorDNIActionPerformed

    private void jbActivarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActivarAlumnoActionPerformed
        // TODO add your handling code here:
        ad.activarAlumno(al.getId_alumno());
        jtfEstado.setText(" Activo");
        jtfEstado.setForeground(Color.green);
    }//GEN-LAST:event_jbActivarAlumnoActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        if(jtableMateriasNOCursadas.getSelectedRow() != (-1)){
            String nombreMateria = jtableMateriasNOCursadas.getValueAt(jtableMateriasNOCursadas.getSelectedRow(), 0).toString();
            Materia mat;
            mat = md.buscarMateria(materias.get(nombreMateria));
            Inscripcion insc = new Inscripcion(al, mat, 0);
            inDa.inscribir(insc);
            tablaMateriasNOCursadas.removeRow(jtableMateriasNOCursadas.getSelectedRow());
            tablaMateriasCursadas.insertRow(jtableMaterias.getRowCount(), new Object[]{mat.getNombre(),mat.getAnio()});
        } else{
            JOptionPane.showMessageDialog(this, "Seleccione una fila de materias No inscriptas");
        }
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        jtfDNI.setText("");
        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfFecha.setText("");
        jtfEstado.setText("");
        jbBuscarAlumnoPorDNI.setEnabled(true);
        jbActivarAlumno.setEnabled(false);
        jbInscribir.setEnabled(false);
        jbDesinscribir.setEnabled(false);
        tablaMateriasCursadas.setRowCount(0);
        tablaMateriasNOCursadas.setRowCount(0);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbDesinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDesinscribirActionPerformed
        // TODO add your handling code here:
        if(jtableMaterias.getSelectedRow() != (-1)){
            String nombreMateria = tablaMateriasCursadas.getValueAt(jtableMaterias.getSelectedRow(), 0).toString();
            Materia mat;
            mat = md.buscarMateria(materias.get(nombreMateria));
            inDa.borrarInscripcionMateriaAlumno(al.getId_alumno(), mat.getId_materia());
            tablaMateriasCursadas.removeRow(jtableMaterias.getSelectedRow());
            tablaMateriasNOCursadas.insertRow(jtableMateriasNOCursadas.getRowCount(), new Object[]{mat.getNombre(),mat.getAnio()});
        }else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila de materias inscriptas");
        }
    }//GEN-LAST:event_jbDesinscribirActionPerformed

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
            java.util.logging.Logger.getLogger(VistaInscripcionesVol3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInscripcionesVol3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInscripcionesVol3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInscripcionesVol3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaInscripcionesVol3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbActivarAlumno;
    private javax.swing.JButton jbBuscarAlumnoPorDNI;
    private javax.swing.JButton jbDesinscribir;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JTable jtableMaterias;
    private javax.swing.JTable jtableMateriasNOCursadas;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDNI;
    private javax.swing.JTextField jtfEstado;
    private javax.swing.JTextField jtfFecha;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
