package Vistas;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import ProgramacionTablas.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Johan Sebastian Lasso Rivas y Juan Sebastian
 */
public class Colegio extends javax.swing.JFrame {

    //Variables Globales
    private DefaultTableModel modelo;
    //almacena el indice (fila) del JTable.
    public int indiceFila;  
    
    
    public Colegio() {
        initComponents();
        
        //Sirve para que la ventana aparezca en el centro.
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.gray);
        
        
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
        btnGuardar = new javax.swing.JButton();
        lblIdColegio = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtIdColegio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblColegio = new javax.swing.JTable();
        txtCorreo = new javax.swing.JTextField();
        lblTelefono1 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(851, 450));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("COLEGIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 44, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 275, -1, -1));

        lblIdColegio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblIdColegio.setText("Codigo:");
        getContentPane().add(lblIdColegio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        lblDireccion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDireccion.setText("Direccion:");
        getContentPane().add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefono.setText("Telefono:");
        getContentPane().add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txtIdColegio.setBackground(new java.awt.Color(102, 102, 102));
        txtIdColegio.setForeground(new java.awt.Color(255, 255, 255));
        txtIdColegio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdColegioActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdColegio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 170, -1));

        txtNombre.setBackground(new java.awt.Color(102, 102, 102));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 160, -1));

        txtDireccion.setBackground(new java.awt.Color(102, 102, 102));
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 150, -1));

        txtTelefono.setBackground(new java.awt.Color(102, 102, 102));
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 150, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 275, -1, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 313, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 275, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 313, -1, -1));

        tblColegio.setBackground(new java.awt.Color(102, 102, 102));
        tblColegio.setForeground(new java.awt.Color(255, 255, 255));
        tblColegio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblColegio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblColegioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblColegio);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 130, 515, 215));

        txtCorreo.setBackground(new java.awt.Color(102, 102, 102));
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 170, -1));

        lblTelefono1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefono1.setText("Correo:");
        getContentPane().add(lblTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home-icon-silhouette.png"))); // NOI18N
        btnInicio.setBorderPainted(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 40, 70, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdColegioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdColegioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdColegioActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        limpiarTabla();
        getColumn();
        cargarTabla(tblColegio);
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         //Validación de cada una de las cajas de Texto (Campos vacios).

        if(txtIdColegio.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el codigo del Colegio" );
            txtIdColegio.requestFocus();
            return;
        }
        
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el nombre del Colegio" );
            txtNombre.requestFocus();
            return;
        }
        
        if(txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el codigo del Colegio" );
            txtDireccion.requestFocus();
            return;
        }
        
        if(txtTelefono.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita la dirección del Colegio" );
            txtTelefono.requestFocus();
            return;
        }
        if(txtCorreo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el correo del Colegio" );
            txtCorreo.requestFocus();
            return;
        }


        TablaColegio  objColegio = new TablaColegio();

        //Declaración de las variables para obtener los valores que se encuentran en las cajas de texto
        int codigo =  Integer.parseInt(txtIdColegio.getText());
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String correo = txtCorreo.getText();
        

        try {
            boolean resultado = objColegio.insertarColegio(codigo, nombre, direccion, telefono, correo);
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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
        limpiarTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
         //Validación de cada una de las cajas de Texto (Campos vacios).

        if(txtIdColegio.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el codigo del Colegio" );
            txtIdColegio.requestFocus();
            return;
        }
        
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el nombre del Colegio" );
            txtNombre.requestFocus();
            return;
        }
        
        if(txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el codigo del Colegio" );
            txtDireccion.requestFocus();
            return;
        }
        
        if(txtTelefono.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita la dirección del Colegio" );
            txtTelefono.requestFocus();
            return;
        }
        if(txtCorreo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor,digita el correo del Colegio" );
            txtCorreo.requestFocus();
            return;
        }
        
        TablaColegio objColegio = new TablaColegio();
        
        int codigo =  Integer.parseInt(txtIdColegio.getText());
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String correo = txtCorreo.getText();
        
        boolean resultado = objColegio.actualizarColegio(codigo, nombre, direccion, telefono, correo);
        if(resultado == true){
            JOptionPane.showMessageDialog(null, "Se actualizó el registro.");
            //Se realiza la limpieza al JTable
            limpiarCampos();
            //Se realiza la liempieza a los TexField, ComboBox etc.
            limpiarTabla();
            //Mostramos las columnas (La informacion que identifica a cada tabla en la BD)
            getColumn();
            //Actualizamos la tabla (Buscamos todos los registros)
            cargarTabla(tblColegio);
        }else{
            JOptionPane.showMessageDialog(null, "Error al actualizar.");
        }  
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tblColegioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblColegioMouseClicked
        /* Evento para cuendo el usuario presione click en cualquier fila de la tabla. 
           Lo que hará ese evento es poner todo los datos que hayan en la tabla en los distintos.
           JtextFiel , JCombobox.
        */
        //Modelo para el JTable
        modelo = (DefaultTableModel) tblColegio.getModel();

        // Asigno el elemento seleccionado de la tabla a los respectivos campos del formulario
        try {
            //Deshabilitar el campo de Codigo
            txtIdColegio.setEditable(false);
            
            txtIdColegio.setText(String.valueOf(modelo.getValueAt(tblColegio.getSelectedRow(), 0)));
            txtNombre.setText(String.valueOf(modelo.getValueAt(tblColegio.getSelectedRow(), 1)));
            txtDireccion.setText((String) modelo.getValueAt(tblColegio.getSelectedRow(), 2));
            txtTelefono.setText((String) modelo.getValueAt(tblColegio.getSelectedRow(), 3));
            txtCorreo.setText((String) modelo.getValueAt(tblColegio.getSelectedRow(), 4));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrió algo inesperado al momento de seleccionar una fila ¡Por favor, vuelva a intentarlo!");
        }
    }//GEN-LAST:event_tblColegioMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Saber si la tabla esta vacia esto me permite decirle al Usuario que presione el boton de buscar registros.
        if(tblColegio.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, Presione el botón de Bucar" );
            return;
        }

        if (tblColegio.getSelectedRow()== -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }
        
        // Defino el modelo para el JTable
        modelo = (DefaultTableModel) tblColegio.getModel();
        
        TablaColegio objColegio = new TablaColegio();
        
        try {
             
            // Asigno el indice del elemento seleccionado
            indiceFila = tblColegio.getSelectedRow();
            // Elimino el registro del JTable
            modelo.removeRow(indiceFila);
   
            
            //Declaración de la vaiable para obtener el valor que se encuentra en la caja de texto correspondiente.
            int idColegio = Integer.parseInt(txtIdColegio.getText());
            boolean resultado = objColegio.eliminarColegio(idColegio);
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

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInicioActionPerformed
    
    private void limpiarCampos(){
        txtIdColegio.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtIdColegio.requestFocus();
        txtIdColegio.setEditable(true);
    }
    private void limpiarTabla(){
        // Defino el modelo para el JTable
        DefaultTableModel modelo = (DefaultTableModel) tblColegio.getModel();
        
        // Limpio las filas y las columnas de la tabla
        modelo.setColumnCount(0);
        modelo.setNumRows(0);
    }
    
    
    //Metodo para cargar las columnas en la tabla
    private void getColumn() {
        modelo = (DefaultTableModel) tblColegio.getModel();
        // Cargo las columnas de titulo al Jtable
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
    }
    
    //Metodo para cargar los registros en la tabla
    private void cargarTabla(JTable tabla) {
        TablaColegio objMedicamento = new TablaColegio();
        //Se Identifica el modelo de la JTable
        modelo = (DefaultTableModel) tblColegio.getModel();
        ResultSet resultado = objMedicamento.cargarInfoColegio();
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
            java.util.logging.Logger.getLogger(Colegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Colegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Colegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Colegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Colegio().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblIdColegio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefono1;
    private javax.swing.JTable tblColegio;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdColegio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
