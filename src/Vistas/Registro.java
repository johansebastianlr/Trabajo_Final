package Vistas;

import ComboBox.*;
import ProgramacionTablas.*;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Johan Sebastian Lasso Rivas y Juan Sebastian
 */
public class Registro extends javax.swing.JFrame {
    
    
    //Variables Globales
    private DefaultTableModel modelo;
    //almacena el indice (fila) del JTable.
    public int indiceFila; 
    
   
    public Registro() {
        initComponents();
        //Sirve para que la ventana aparezca en el centro.
        this.setLocationRelativeTo(null);
        
        InformacionAlumno infAlumno = new InformacionAlumno();
        InformacionMateria infMateria = new InformacionMateria();
        InformacionProfesor infProfesor = new InformacionProfesor();
        
        //Creamos un Objeto para obtener el modelo del comboBox
        DefaultComboBoxModel objAlumno = new DefaultComboBoxModel(infAlumno.mostrarAlumno());
        cmbAlumno.setModel(objAlumno);
        
        DefaultComboBoxModel objMateria = new DefaultComboBoxModel(infMateria.mostrarMateria());
        cmbMateria.setModel(objMateria);
        
        DefaultComboBoxModel objProfesor = new DefaultComboBoxModel(infProfesor.mostrarProfesor());
        cmbProfesor.setModel(objProfesor);
        
        
        txtIdRegistro.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIdAlumno = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        lblApellidoMaterno = new javax.swing.JLabel();
        txtIdRegistro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        cmbMateria = new javax.swing.JComboBox<>();
        cmbAlumno = new javax.swing.JComboBox<>();
        cmbProfesor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(851, 450));
        setUndecorated(true);
        setResizable(false);

        lblIdAlumno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblIdAlumno.setText("ID:");

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombre.setText("Alumno:");

        lblApellidoPaterno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblApellidoPaterno.setText("Materia:");

        lblApellidoMaterno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblApellidoMaterno.setText("Profesor:");

        txtIdRegistro.setBackground(new java.awt.Color(102, 102, 102));
        txtIdRegistro.setForeground(new java.awt.Color(255, 255, 255));
        txtIdRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdRegistroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("REGISTRO");

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegistro);

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

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home-icon-silhouette.png"))); // NOI18N
        btnInicio.setBorderPainted(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        cmbMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbProfesor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIdAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdRegistro))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblNombre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblApellidoMaterno)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblApellidoPaterno)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInicio)
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdAlumno)
                            .addComponent(txtIdRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(cmbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidoPaterno)
                            .addComponent(cmbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidoMaterno)
                            .addComponent(cmbProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnBuscar)
                            .addComponent(btnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnActualizar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        limpiarTabla();
        getColumn();
        cargarTabla();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         //Validación de cada una de las cajas de Texto (Campos vacios).
         
        if(cmbAlumno.getSelectedIndex()== 0){
            JOptionPane.showMessageDialog(null, "Por favor,Selecciona el Alumno" );
            cmbAlumno.requestFocus();
            return;
        }
        
        if(cmbMateria.getSelectedIndex()== 0){
            JOptionPane.showMessageDialog(null, "Por favor,Selecciona el Materia" );
            cmbMateria.requestFocus();
            return;
        }
        
        if(cmbProfesor.getSelectedIndex()== 0){
            JOptionPane.showMessageDialog(null, "Por favor,Selecciona el Profesor" );
            cmbProfesor.requestFocus();
            return;
        }
       

        TablaRegistro  objRegistro = new TablaRegistro();
        
        InformacionAlumno objAlumno = (InformacionAlumno) cmbAlumno.getSelectedItem();
        InformacionMateria objMateria = (InformacionMateria) cmbMateria.getSelectedItem();
        InformacionProfesor objProfesor = (InformacionProfesor) cmbProfesor.getSelectedItem();

        //Declaración de las variables para obtener los valores que se encuentran en los comboBox de texto
        int idAlumno = objAlumno.getId();
        int idMateria = objMateria.getId();
        int idProfesor = objProfesor.getId();
        
        
        try {
            boolean resultado = objRegistro.insertarRegistro(idAlumno,idMateria,idProfesor);
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
        
        if(tblRegistro.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, Presione el botón de Bucar" );
            return;
        }

        if (tblRegistro.getSelectedRow()== -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }

       
       if(cmbAlumno.getSelectedIndex()== 0){
            JOptionPane.showMessageDialog(null, "Por favor,Selecciona el Alumno" );
            cmbAlumno.requestFocus();
            return;
        }
        
        if(cmbMateria.getSelectedIndex()== 0){
            JOptionPane.showMessageDialog(null, "Por favor,Selecciona el Materia" );
            cmbMateria.requestFocus();
            return;
        }
        
        if(cmbProfesor.getSelectedIndex()== 0){
            JOptionPane.showMessageDialog(null, "Por favor,Selecciona el Profesor" );
            cmbProfesor.requestFocus();
            return;
        }

        TablaRegistro  objRegistro = new TablaRegistro();
        
        InformacionAlumno objAlumno = (InformacionAlumno) cmbAlumno.getSelectedItem();
        InformacionMateria objMateria = (InformacionMateria) cmbMateria.getSelectedItem();
        InformacionProfesor objProfesor = (InformacionProfesor) cmbProfesor.getSelectedItem();

        //Declaración de las variables para obtener los valores que se encuentran en los comboBox de texto
        int idRegistro = Integer.parseInt(txtIdRegistro.getText());
        int idAlumno = objAlumno.getId();
        int idMateria = objMateria.getId();
        int idProfesor = objProfesor.getId();
        
        boolean resultado = objRegistro.actualizarRegistro(idRegistro,idAlumno,idMateria,idProfesor);
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

        
        if(tblRegistro.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, Presione el botón de Bucar" );
            return;
        }

        if (tblRegistro.getSelectedRow()== -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }
        
        // Defino el modelo para el JTable
        modelo = (DefaultTableModel) tblRegistro.getModel();
        
        TablaRegistro objRegistro = new TablaRegistro();
        
        try {
             
            // Asigno el indice del elemento seleccionado
            indiceFila = tblRegistro.getSelectedRow();
            // Elimino el registro del JTable
            modelo.removeRow(indiceFila);
   
            
            //Declaración de la vaiable para obtener el valor que se encuentra en la caja de texto correspondiente.
            int idRegistro = Integer.parseInt(txtIdRegistro.getText());
            boolean resultado = objRegistro.eliminarRegistro(idRegistro);
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

    private void tblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistroMouseClicked
        /* Evento para cuendo el usuario presione click en cualquier fila de la tabla. 
           Lo que hará ese evento es poner todo los datos que hayan en la tabla en los distintos.
           JtextFiel , JCombobox.
        */
        //Modelo para el JTable
        modelo = (DefaultTableModel) tblRegistro.getModel();

        // Asigno el elemento seleccionado de la tabla a los respectivos campos del formulario
        try {
            
            txtIdRegistro.setText(String.valueOf(modelo.getValueAt(tblRegistro.getSelectedRow(), 0)));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrió algo inesperado al momento de seleccionar una fila ¡Por favor, vuelva a intentarlo!");
        }
    }//GEN-LAST:event_tblRegistroMouseClicked

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void txtIdRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdRegistroActionPerformed
    
    
     private void limpiarCampos(){
        txtIdRegistro.setText("");
        cmbAlumno.setSelectedIndex(0);
        cmbMateria.setSelectedIndex(0);
        cmbProfesor.setSelectedIndex(0);
    }
    private void limpiarTabla(){
        // Defino el modelo para el JTable
        DefaultTableModel modelo = (DefaultTableModel) tblRegistro.getModel();
        
        // Limpio las filas y las columnas de la tabla
        modelo.setColumnCount(0);
        modelo.setNumRows(0);
    }
    
    
    //Metodo para cargar las columnas en la tabla
    private void getColumn() {
        modelo = (DefaultTableModel) tblRegistro.getModel();
        // Cargo las columnas de titulo al Jtable
        modelo.addColumn("ID");
        modelo.addColumn("nombre Alumno");
        modelo.addColumn("nombre Materia");
        modelo.addColumn("nombre Profesor");
    }
    
    //Metodo para cargar los registros en la tabla
    private void cargarTabla() {
        TablaRegistro objRegistro = new TablaRegistro();
        //Se Identifica el modelo de la JTable
        modelo = (DefaultTableModel) tblRegistro.getModel();
        ResultSet resultado = objRegistro.cargarInfoRegistro();
        try {
            Object datos[] = new Object[4];
            while (resultado.next()) {
                for (int i = 0; i < 4; i++) {
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
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
    private javax.swing.JComboBox<String> cmbAlumno;
    private javax.swing.JComboBox<String> cmbMateria;
    private javax.swing.JComboBox<String> cmbProfesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblIdAlumno;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtIdRegistro;
    // End of variables declaration//GEN-END:variables
}
