/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

package vistas;

import controladoras.MateriaData;
import entidades.Materia;
import java.awt.Color;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author marcel.olguin
 */
public class VistaMaterias extends javax.swing.JInternalFrame {

    /** Creates new form VistaMaterias */
    public VistaMaterias() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_titulo = new javax.swing.JLabel();
        jl_idMateria = new javax.swing.JLabel();
        jl_nombreMateria = new javax.swing.JLabel();
        tf_idMateria = new javax.swing.JTextField();
        tf_nombreMateria = new javax.swing.JTextField();
        btn_BuscarMateria = new javax.swing.JButton();
        jl_anioMateria = new javax.swing.JLabel();
        jl_estadoMateria = new javax.swing.JLabel();
        tf_anioMateria = new javax.swing.JTextField();
        btn_MateriaActiva = new javax.swing.JRadioButton();
        btn_MateriaInactiva = new javax.swing.JRadioButton();
        jLabelEstado = new javax.swing.JLabel();
        btn_Guardar = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();

        setTitle("Menu Materias");

        jl_titulo.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jl_titulo.setText("MATERIAS");

        jl_idMateria.setText("ID");

        jl_nombreMateria.setText("NOMBRE");

        btn_BuscarMateria.setText("Buscar");
        btn_BuscarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarMateriaActionPerformed(evt);
            }
        });

        jl_anioMateria.setText("AÑO");

        jl_estadoMateria.setText("ESTADO");

        btn_MateriaActiva.setText("Activa");
        btn_MateriaActiva.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btn_MateriaActivaStateChanged(evt);
            }
        });

        btn_MateriaInactiva.setText("Inactiva");
        btn_MateriaInactiva.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btn_MateriaInactivaStateChanged(evt);
            }
        });

        jLabelEstado.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEstado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        btn_Limpiar.setText("Limpiar");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });

        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_nombreMateria)
                            .addComponent(jl_anioMateria)
                            .addComponent(jl_idMateria)
                            .addComponent(jl_estadoMateria))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_anioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_idMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_MateriaActiva)
                                        .addGap(65, 65, 65)
                                        .addComponent(btn_MateriaInactiva))
                                    .addComponent(jLabelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_BuscarMateria))
                            .addComponent(tf_nombreMateria)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jl_titulo)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_idMateria)
                    .addComponent(tf_idMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_BuscarMateria))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jl_nombreMateria))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tf_nombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_anioMateria)
                    .addComponent(tf_anioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_estadoMateria)
                    .addComponent(jLabelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_MateriaActiva)
                    .addComponent(btn_MateriaInactiva))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Limpiar)
                    .addComponent(btn_Actualizar)
                    .addComponent(btn_Guardar)
                    .addComponent(btn_Salir))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BuscarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarMateriaActionPerformed
        Materia mat = new Materia();
        MateriaData md = new MateriaData();
        
        mat = md.buscarMateria(parseInt(tf_idMateria.getText()));
        if(mat != null){
            tf_nombreMateria.setText(mat.getNombre());
            tf_anioMateria.setText(String.valueOf(mat.getAnio()));
            btn_MateriaActiva.setEnabled(true);
            btn_MateriaInactiva.setEnabled(true);
            if (mat.isEstado()){      
                jLabelEstado.setOpaque(true);
                jLabelEstado.setBackground(new java.awt.Color(204, 204, 0));
                jLabelEstado.setForeground(new java.awt.Color(0, 0, 255));
                jLabelEstado.setText("Materia Activa");               
            }else{      
                jLabelEstado.setForeground(Color.red);
                jLabelEstado.setText("Materia Inactiva");
            }        
        } else{
            JOptionPane.showMessageDialog(null, "Materia no encontrada");
            limpiar();
        }        
    }//GEN-LAST:event_btn_BuscarMateriaActionPerformed

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        Materia mat = new Materia();
        MateriaData md = new MateriaData();
        
        if(!tf_idMateria.getText().equals("")){
            mat.setNombre(tf_nombreMateria.getText());
            mat.setAnio(parseInt(tf_anioMateria.getText()));
            md.modificarMateria(mat);
        
        }
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed

        tf_idMateria.setText("");
        tf_nombreMateria.setText("");
        tf_anioMateria.setText("");
        btn_MateriaActiva.setSelected(false);
        btn_MateriaInactiva.setSelected(false);
        jLabelEstado.setText("");
        jLabelEstado.setOpaque(false);
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed

        Materia mat = new Materia();
        MateriaData md = new MateriaData();
        
        mat.setNombre(tf_nombreMateria.getText());
        mat.setAnio(parseInt(tf_anioMateria.getText()));
        mat.setEstado(true);
        md.guardarMateria(mat);
                
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_MateriaActivaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btn_MateriaActivaStateChanged
        
        Materia mat = new Materia();
        MateriaData md = new MateriaData();
        
        if(btn_MateriaActiva.isSelected()){
            md.activarMateria(parseInt(tf_idMateria.getText()));
            jLabelEstado.setOpaque(true);
            jLabelEstado.setBackground(new java.awt.Color(204, 204, 0));
            jLabelEstado.setForeground(new java.awt.Color(0, 0, 255));
            jLabelEstado.setText("Materia Activa"); 
        
        }
    }//GEN-LAST:event_btn_MateriaActivaStateChanged

    private void btn_MateriaInactivaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btn_MateriaInactivaStateChanged
        
        Materia mat = new Materia();
        MateriaData md = new MateriaData();
        
        if(btn_MateriaInactiva.isSelected()){
            md.elminarMateria(parseInt(tf_idMateria.getText()));
            jLabelEstado.setForeground(Color.red);
            jLabelEstado.setText("Materia Inactiva");
        
        }
    }//GEN-LAST:event_btn_MateriaInactivaStateChanged

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_SalirActionPerformed
    private void limpiar(){
        tf_anioMateria.setText("");
        tf_idMateria.setText("");
        tf_nombreMateria.setText("");
        jLabelEstado.setText("");
        jLabelEstado.setOpaque(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_BuscarMateria;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JRadioButton btn_MateriaActiva;
    private javax.swing.JRadioButton btn_MateriaInactiva;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jl_anioMateria;
    private javax.swing.JLabel jl_estadoMateria;
    private javax.swing.JLabel jl_idMateria;
    private javax.swing.JLabel jl_nombreMateria;
    private javax.swing.JLabel jl_titulo;
    private javax.swing.JTextField tf_anioMateria;
    private javax.swing.JTextField tf_idMateria;
    private javax.swing.JTextField tf_nombreMateria;
    // End of variables declaration//GEN-END:variables

}
