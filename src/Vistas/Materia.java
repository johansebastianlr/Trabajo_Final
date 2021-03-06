/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import ComboBox.InformacionColegio;
import ComboBox.InformacionProfesor;
import ProgramacionTablas.*;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Johan Sebastian Lasso Rivas y Juan Sebastian
 */
public class Materia extends javax.swing.JFrame {

    //Variables Globales
    private DefaultTableModel modelo;
    //almacena el indice (fila) del JTable.
    public int indiceFila; 
    
    
    public Materia() {
        initComponents();
        //Sirve para que la ventana aparezca en el centro.
        this.setLocationRelativeTo(null);
        this.setBackground(Color.BLUE);
        InformacionProfesor infProfesor = new InformacionProfesor();
        
        //Creamos un Objeto para obtener el modelo del comboBox
        DefaultComboBoxModel objProfesor = new DefaultComboBoxModel(infProfesor.mostrarProfesor());
        cmbProfesor.setModel(objProfesor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblIdMateria = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        lblSalon = new javax.swing.JLabel();
        txtIdMateria = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtHorario = new javax.swing.JTextField();
        txtSalon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMateria = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblProfesor = new javax.swing.JLabel();
        cmbProfesor = new javax.swing.JComboBox<>();
        btnInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 0));
        setMinimumSize(new java.awt.Dimension(851, 450));
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MATERIA");

        lblIdMateria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblIdMateria.setText("Materia:");

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombre.setText("Nombre:");

        lblHorario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblHorario.setText("Horario:");

        lblSalon.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSalon.setText("Salon:");

        txtIdMateria.setBackground(new java.awt.Color(102, 102, 102));
        txtIdMateria.setForeground(new java.awt.Color(255, 255, 255));
        txtIdMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdMateriaActionPerformed(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(102, 102, 102));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));

        txtHorario.setBackground(new java.awt.Color(102, 102, 102));
        txtHorario.setForeground(new java.awt.Color(255, 255, 255));

        txtSalon.setBackground(new java.awt.Color(102, 102, 102));
        txtSalon.setForeground(new java.awt.Color(255, 255, 255));
        txtSalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalonActionPerformed(evt);
            }
        });

        tblMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMateriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMateria);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblProfesor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblProfesor.setText("Profesor:");

        cmbProfesor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "***Selecciona***" }));
        cmbProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProfesorActionPerformed(evt);
            }
        });

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home-icon-silhouette.png"))); // NOI18N
        btnInicio.setBorderPainted(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnGuardar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEliminar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(btnActualizar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnLimpiar))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblIdMateria)
                            .addGap(172, 172, 172))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblProfesor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbProfesor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblSalon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHorario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblNombre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnInicio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdMateria)
                            .addComponent(txtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHorario)
                            .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSalon)
                            .addComponent(txtSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProfesor)
                            .addComponent(cmbProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnBuscar)
                            .addComponent(btnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnActualizar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdMateriaActionPerformed

    private void txtSalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalonActionPerformed

    private void cmbProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProfesorActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Validación de cada una de las cajas de Texto (Campos vacios).

         if(txtIdMateria.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el codigo de la materia" );
            txtIdMateria.requestFocus();
            return;
        }
        
        
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el nombre de la materia" );
            txtNombre.requestFocus();
            return;
        }
        
       
        if(txtHorario.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el horario de la materia" );
            txtHorario.requestFocus();
            return;
        }
        
        if(txtSalon.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el salon" );
            txtSalon.requestFocus();
            return;
        }
        
        if(cmbProfesor.getSelectedIndex()== 0){
            JOptionPane.showMessageDialog(null, "Por favor,selecciona un docente" );
            cmbProfesor.requestFocus();
            return;
        }


        TablaMateria  objMateria = new TablaMateria();
        
        InformacionProfesor objProfesor = (InformacionProfesor) cmbProfesor.getSelectedItem();

        //Declaración de las variables para obtener los valores que se encuentran en las cajas de texto
        int idMateria = Integer.parseInt(txtIdMateria.getText());
        String nombre = txtNombre.getText();
        String horario = txtHorario.getText();
        String salon = txtSalon.getText();
        int idProfesor = objProfesor.getId();

        
        

        try {
            boolean resultado = objMateria.insertarMateria(idMateria, nombre, horario, salon, idProfesor);
            if(resultado == true){
                JOptionPane.showMessageDialog(null, "Se inserto un nuevo registro.");
                //Utilizamos el objeto para limpiar todos los campos.
                limpiarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al insertar.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrió algo inesperado. ¡Por favor, vuelva a intentarlo!");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        limpiarTabla();
        getColumn();
        cargarTabla();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
          
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el nombre de la materia" );
            txtNombre.requestFocus();
            return;
        }
        
       
        if(txtHorario.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el horario de la materia" );
            txtHorario.requestFocus();
            return;
        }
        
        if(txtSalon.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el salon" );
            txtSalon.requestFocus();
            return;
        }
        
        if(cmbProfesor.getSelectedIndex()== 0){
            JOptionPane.showMessageDialog(null, "Por favor,selecciona un docente" );
            cmbProfesor.requestFocus();
            return;
        }


        TablaMateria  objMateria = new TablaMateria();
        
        InformacionProfesor objProfesor = (InformacionProfesor) cmbProfesor.getSelectedItem();

        //Declaración de las variables para obtener los valores que se encuentran en las cajas de texto
        int idMateria = Integer.parseInt(txtIdMateria.getText());
        String nombre = txtNombre.getText();
        String horario = txtHorario.getText();
        String salon = txtSalon.getText();
        int idProfesor = objProfesor.getId();
        
        boolean resultado = objMateria.actualizarMateria(idMateria, nombre, horario, salon, idProfesor);
        if(resultado == true){
            JOptionPane.showMessageDialog(null, "Se actualizó el registro.");
            //Se realiza la limpieza al JTable
            limpiarCampos();
            //Se realiza la liempieza a los TexField, ComboBox etc.
            limpiarTabla();
            //Mostramos las columnas (La informacion que identifica a cada tabla en la BD)
            getColumn();
            //Actualizamos la tabla (Buscamos todos los registros)
            cargarTabla();
        }else{
            JOptionPane.showMessageDialog(null, "Error al actualizar.");
        } 

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         //Saber si la tabla esta vacia esto me permite decirle al Usuario que presione el boton de buscar registros.
        
        
        if(tblMateria.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, Presione el botón de Bucar" );
            return;
        }

        if (tblMateria.getSelectedRow()== -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }
        
        // Defino el modelo para el JTable
        modelo = (DefaultTableModel) tblMateria.getModel();
        
        TablaMateria objMateria = new TablaMateria();
        
        try {
             
            // Asigno el indice del elemento seleccionado
            indiceFila = tblMateria.getSelectedRow();
            // Elimino el registro del JTable
            modelo.removeRow(indiceFila);
   
            
            //Declaración de la vaiable para obtener el valor que se encuentra en la caja de texto correspondiente.
            int idMateria = Integer.parseInt(txtIdMateria.getText());
            boolean resultado = objMateria.eliminarMateria(idMateria);
            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "Se Eliminó el registro correctamente.");
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrió algo inesperado ¡Por favor, vuelva a intentarlo!" + e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMateriaMouseClicked
         /* Evento para cuendo el usuario presione click en cualquier fila de la tabla. 
           Lo que hará ese evento es poner todo los datos que hayan en la tabla en los distintos.
           JtextFiel , JCombobox.
        */
        //Modelo para el JTable
        modelo = (DefaultTableModel) tblMateria.getModel();

        // Asigno el elemento seleccionado de la tabla a los respectivos campos del formulario
        try {
            //Deshabilitar el campo de Codigo
            txtIdMateria.setEditable(false);
            
            InformacionProfesor objProfesor = new InformacionProfesor();
            

            //Realizamos una Instanciación para el modelo del comboBox perteneciente a los Departamentos. 
            DefaultComboBoxModel modeloProfesor = new DefaultComboBoxModel(objProfesor.mostrarProfesor());
            
            txtIdMateria.setText(String.valueOf(modelo.getValueAt(tblMateria.getSelectedRow(), 0)));
           
            txtNombre.setText((String)(modelo.getValueAt(tblMateria.getSelectedRow(), 1)));
            txtHorario.setText((String) modelo.getValueAt(tblMateria.getSelectedRow(), 2));
            txtSalon.setText((String) modelo.getValueAt(tblMateria.getSelectedRow(), 3));
            
             
            String profesor = (String) modelo.getValueAt(tblMateria.getSelectedRow(), 4);
            modeloProfesor.setSelectedItem(profesor);
            cmbProfesor.setModel(modeloProfesor);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrió algo inesperado al momento de seleccionar una fila ¡Por favor, vuelva a intentarlo!");
        }
    }//GEN-LAST:event_tblMateriaMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
        limpiarTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void limpiarCampos(){
        txtIdMateria.setText("");
        txtNombre.setText("");
        txtHorario.setText("");
        txtSalon.setText("");
        cmbProfesor.setSelectedIndex(0);
        txtIdMateria.setEditable(true);
        txtIdMateria.requestFocus();
    }
    private void limpiarTabla(){
        // Defino el modelo para el JTable
        DefaultTableModel modelo = (DefaultTableModel) tblMateria.getModel();
        
        // Limpio las filas y las columnas de la tabla
        modelo.setColumnCount(0);
        modelo.setNumRows(0);
    }
    
    
    //Metodo para cargar las columnas en la tabla
    private void getColumn() {
        modelo = (DefaultTableModel) tblMateria.getModel();
        // Cargo las columnas de titulo al Jtable
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Horario");
        modelo.addColumn("Salon");
        modelo.addColumn("Profesor");
    }
    
    //Metodo para cargar los registros en la tabla
    private void cargarTabla() {
        TablaMateria objMateria = new TablaMateria();
        //Se Identifica el modelo de la JTable
        modelo = (DefaultTableModel) tblMateria.getModel();
        ResultSet resultado = objMateria.cargarInfoMateria();
        try {
            Object datos[] = new Object[5];
            while (resultado.next()) {
                for (int i = 0; i < 5; i++) {
                    //Importante, el getObject tiene que ser mayor que 0 por ende se coloca el 1
                    datos[i] = resultado.getObject(i + 1);
                }
                modelo.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(Materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Materia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbProfesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblIdMateria;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblProfesor;
    private javax.swing.JLabel lblSalon;
    private javax.swing.JTable tblMateria;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtIdMateria;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalon;
    // End of variables declaration//GEN-END:variables
}
