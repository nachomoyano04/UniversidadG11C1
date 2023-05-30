/*
 * 
 * 
 */
package vistas;

import controladoras.AlumnoData;
import controladoras.InscripcionData;
import controladoras.MateriaData;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcel
 */
public class VistaAlumnosXMateria extends javax.swing.JInternalFrame {
    DefaultTableModel modelo;

    /**
     * Creates new form VistaAlumMat
     */
    public VistaAlumnosXMateria() {
        modelo=new DefaultTableModel();
        initComponents();
        armarTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMaterias = new javax.swing.JTable();
        tfBuscarIDMat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnbuscarIdMat = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tf_NomMat = new javax.swing.JTextField();
        labelEstado = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setText("ALUMNOS POR MATERIA");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tablaMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMaterias.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaMaterias);

        jLabel3.setText("ID Materia");

        btnbuscarIdMat.setText("Buscar");
        btnbuscarIdMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarIdMatActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre Materia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_NomMat, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfBuscarIDMat, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnbuscarIdMat)))
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addGap(298, 298, 298))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBuscarIDMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnbuscarIdMat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEstado)
                    .addComponent(tf_NomMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnbuscarIdMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarIdMatActionPerformed
        // TODO add your handling code here:
        Alumno alum = new Alumno();
        MateriaData md = new MateriaData();
        InscripcionData listaIncrip=new InscripcionData();
        ArrayList<Alumno> listaAlumnos=new ArrayList();
        Materia materia=new Materia();

        materia = md.buscarMateria(parseInt(tfBuscarIDMat.getText()));
        if (materia != null) {
            borrarFilas();
            tf_NomMat.setText(materia.getNombre()+" - "+materia.getAnio());
            if (materia.isEstado()) {                
                labelEstado.setOpaque(true);
                labelEstado.setBackground(new java.awt.Color(204, 204, 0));
                labelEstado.setForeground(new java.awt.Color(0, 0, 255));
                labelEstado.setText("Materia Activa");
            } else {
                labelEstado.setForeground(Color.red);
                labelEstado.setText("Materia Inactiva");
            }            
        borrarFilas();
        for( Alumno list: listaIncrip.obtenerAlumnosXMateria(materia.getId_materia())){  
            modelo.addRow(new Object []{list.getId_alumno(), list.getApellido(), list.getNombre()});
        }
        }       
    }//GEN-LAST:event_btnbuscarIdMatActionPerformed


    
    private void armarTabla(){
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("ID alumno");
        columnas.add("Nombre");
        columnas.add("Apellido");
        for(Object it:columnas){
            modelo.addColumn(it);
        }
        tablaMaterias.setModel(modelo);
    }
    
    private void borrarFilas(){
        int a=modelo.getRowCount()-1;
        for(int i=a;i>0;i--){
            modelo.removeRow(i);
        }
    }
    
  
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnbuscarIdMat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JTable tablaMaterias;
    private javax.swing.JTextField tfBuscarIDMat;
    private javax.swing.JTextField tf_NomMat;
    // End of variables declaration//GEN-END:variables
}