package Vistas;

import ComboBox.InformacionColegio;
import ProgramacionTablas.*;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Johan Sebastian Lasso Rivas y Juan Sebastian
 */
public class Alumno extends javax.swing.JFrame {
    
    
    //Variables Globales
    private DefaultTableModel modelo;
    //almacena el indice (fila) del JTable.
    public int indiceFila; 
    
   
    public Alumno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDireccion = new javax.swing.JTextField();
        txtFechaIngreso = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        lblIdAlumno = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        lblApellidoMaterno = new javax.swing.JLabel();
        txtIdAlumno = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblFechaIngreso = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumno = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(851, 450));
        setMinimumSize(new java.awt.Dimension(851, 450));

        txtDireccion.setBackground(new java.awt.Color(102, 102, 102));
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));

        txtFechaIngreso.setBackground(new java.awt.Color(102, 102, 102));
        txtFechaIngreso.setForeground(new java.awt.Color(255, 255, 255));

        txtTelefono.setBackground(new java.awt.Color(102, 102, 102));
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));

        lblIdAlumno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblIdAlumno.setText("Alumno:");

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombre.setText("Nombre:");

        lblApellidoPaterno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblApellidoPaterno.setText("Apellido Paterno:");

        lblApellidoMaterno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblApellidoMaterno.setText("Apellido Materno:");

        txtIdAlumno.setBackground(new java.awt.Color(102, 102, 102));
        txtIdAlumno.setForeground(new java.awt.Color(255, 255, 255));
        txtIdAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAlumnoActionPerformed(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(102, 102, 102));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));

        txtApellidoPaterno.setBackground(new java.awt.Color(102, 102, 102));
        txtApellidoPaterno.setForeground(new java.awt.Color(255, 255, 255));

        txtApellidoMaterno.setBackground(new java.awt.Color(102, 102, 102));
        txtApellidoMaterno.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMaternoActionPerformed(evt);
            }
        });

        lblDireccion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDireccion.setText("Direccion:");

        lblTelefono.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefono.setText("Telefono:");

        lblFechaIngreso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblFechaIngreso.setText("Fecha Ingreso:");

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ALUMNO");

        tblAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlumnoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlumno);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIdAlumno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdAlumno))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblApellidoMaterno)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtApellidoMaterno))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblTelefono)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblDireccion)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtDireccion))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblFechaIngreso)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtFechaIngreso))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblApellidoPaterno)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblNombre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
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
                                .addComponent(btnLimpiar)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdAlumno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidoPaterno)
                            .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidoMaterno)
                            .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaIngreso)
                            .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnBuscar)
                            .addComponent(btnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnActualizar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAlumnoActionPerformed

    private void txtApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMaternoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        limpiarTabla();
        getColumn();
        cargarTabla();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         //Validación de cada una de las cajas de Texto (Campos vacios).

        if(txtIdAlumno.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el codigo del Alumno" );
            txtIdAlumno.requestFocus();
            return;
        }
       
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el nombre del Alumno" );
            txtNombre.requestFocus();
            return;
        }
        
        if(txtApellidoPaterno.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el apellido paterno" );
            txtApellidoPaterno.requestFocus();
            return;
        }
        if(txtApellidoMaterno.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el apellido materno" );
            txtApellidoMaterno.requestFocus();
            return;
        }
        
        if(txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita la direccion" );
            txtDireccion.requestFocus();
            return;
        }
        
        if(txtTelefono.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el telefono" );
            txtTelefono.requestFocus();
            return;
        }
        if(txtFechaIngreso.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita la fecha de ingreso" );
            txtFechaIngreso.requestFocus();
            return;
        }


        TablaAlumno  objAlumno = new TablaAlumno();

        //Declaración de las variables para obtener los valores que se encuentran en las cajas de texto
        int idAlumno = Integer.parseInt(txtIdAlumno.getText());
        String nombre = txtNombre.getText();
        String apellidoPaterno = txtApellidoPaterno.getText();
        String apellidoMaterno = txtApellidoMaterno.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String fechaIngreso = txtFechaIngreso.getText();
        
        try {
            boolean resultado = objAlumno.insertarAlumno(idAlumno, nombre, apellidoPaterno, apellidoMaterno, direccion, telefono, fechaIngreso);
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

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        //Validación de cada una de las cajas de Texto (Campos vacios).

       
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el nombre del Alumno" );
            txtNombre.requestFocus();
            return;
        }
        
        if(txtApellidoPaterno.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el apellido paterno" );
            txtApellidoPaterno.requestFocus();
            return;
        }
        if(txtApellidoMaterno.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el apellido materno" );
            txtApellidoMaterno.requestFocus();
            return;
        }
        
        if(txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita la direccion" );
            txtDireccion.requestFocus();
            return;
        }
        
        if(txtTelefono.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el telefono" );
            txtTelefono.requestFocus();
            return;
        }
        if(txtFechaIngreso.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita la fecha de ingreso" );
            txtFechaIngreso.requestFocus();
            return;
        }


        TablaAlumno  objAlumno = new TablaAlumno();

        //Declaración de las variables para obtener los valores que se encuentran en las cajas de texto
        int idAlumno = Integer.parseInt(txtIdAlumno.getText());
        String nombre = txtNombre.getText();
        String apellidoPaterno = txtApellidoPaterno.getText();
        String apellidoMaterno = txtApellidoMaterno.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String fechaIngreso = txtFechaIngreso.getText();
        
         boolean resultado = objAlumno.actualizarAlumno(idAlumno, nombre, apellidoPaterno, apellidoMaterno,direccion,telefono,fechaIngreso);
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

        
        if(tblAlumno.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, Presione el botón de Bucar" );
            return;
        }

        if (tblAlumno.getSelectedRow()== -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }
        
        // Defino el modelo para el JTable
        modelo = (DefaultTableModel) tblAlumno.getModel();
        
        TablaAlumno objAlumno = new TablaAlumno();
        
        try {
             
            // Asigno el indice del elemento seleccionado
            indiceFila = tblAlumno.getSelectedRow();
            // Elimino el registro del JTable
            modelo.removeRow(indiceFila);
   
            
            //Declaración de la vaiable para obtener el valor que se encuentra en la caja de texto correspondiente.
            int idAlumno = Integer.parseInt(txtIdAlumno.getText());
            boolean resultado = objAlumno.eliminarAlumno(idAlumno);
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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
        limpiarTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlumnoMouseClicked
        /* Evento para cuendo el usuario presione click en cualquier fila de la tabla. 
           Lo que hará ese evento es poner todo los datos que hayan en la tabla en los distintos.
           JtextFiel , JCombobox.
        */
        //Modelo para el JTable
        modelo = (DefaultTableModel) tblAlumno.getModel();

        // Asigno el elemento seleccionado de la tabla a los respectivos campos del formulario
        try {
            //Deshabilitar el campo de Codigo
            txtIdAlumno.setEditable(false);
            
            
            txtIdAlumno.setText(String.valueOf(modelo.getValueAt(tblAlumno.getSelectedRow(), 0)));
            txtNombre.setText((String)(modelo.getValueAt(tblAlumno.getSelectedRow(), 1)));
            txtApellidoPaterno.setText((String) modelo.getValueAt(tblAlumno.getSelectedRow(), 2));
            txtApellidoMaterno.setText((String) modelo.getValueAt(tblAlumno.getSelectedRow(), 3));
            txtDireccion.setText((String) modelo.getValueAt(tblAlumno.getSelectedRow(), 4));
            txtTelefono.setText((String) modelo.getValueAt(tblAlumno.getSelectedRow(), 5));
            txtFechaIngreso.setText(String.valueOf(modelo.getValueAt(tblAlumno.getSelectedRow(), 6)));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrió algo inesperado al momento de seleccionar una fila ¡Por favor, vuelva a intentarlo!");
        }
    }//GEN-LAST:event_tblAlumnoMouseClicked
    
    
     private void limpiarCampos(){
        txtIdAlumno.setText("");
        txtNombre.setText("");
        txtApellidoPaterno.setText("");
        txtApellidoMaterno.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtFechaIngreso.setText("");
        txtIdAlumno.setEditable(true);
    }
    private void limpiarTabla(){
        // Defino el modelo para el JTable
        DefaultTableModel modelo = (DefaultTableModel) tblAlumno.getModel();
        
        // Limpio las filas y las columnas de la tabla
        modelo.setColumnCount(0);
        modelo.setNumRows(0);
    }
    
    
    //Metodo para cargar las columnas en la tabla
    private void getColumn() {
        modelo = (DefaultTableModel) tblAlumno.getModel();
        // Cargo las columnas de titulo al Jtable
        modelo.addColumn("ID");
        modelo.addColumn("nombre");
        modelo.addColumn("Apell. Paterno");
        modelo.addColumn("Apell. Materno");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
         modelo.addColumn("FechaIngreso");
    }
    
    //Metodo para cargar los registros en la tabla
    private void cargarTabla() {
        TablaAlumno objAlumno = new TablaAlumno();
        //Se Identifica el modelo de la JTable
        modelo = (DefaultTableModel) tblAlumno.getModel();
        ResultSet resultado = objAlumno.cargarInfoAlumno();
        try {
            Object datos[] = new Object[7];
            while (resultado.next()) {
                for (int i = 0; i < 7; i++) {
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
            java.util.logging.Logger.getLogger(Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JLabel lblIdAlumno;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTable tblAlumno;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
