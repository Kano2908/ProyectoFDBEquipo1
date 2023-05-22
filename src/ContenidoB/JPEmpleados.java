package ContenidoB;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * @author crist
 */
public class JPEmpleados extends javax.swing.JPanel {
    ConexionDB connect = new ConexionDB();
    Connection con;
    Statement st;
    ResultSet rs;
    DefaultTableModel modeloEmpleado;

    public JPEmpleados() {
        initComponents();
        consultaInicial();
    }
    
    void limpiarTabla() {
        for (int i = 0; i < jTEmpleados.getRowCount(); i++) {
            modeloEmpleado.removeRow(i);
            i = i - 1;
        }
    }
    
    void limpiarCampos(){
        this.jTFIdEmpleado.setText("");
        this.jTFApellidoP.setText("");
        this.jTFApellidoM.setText("");
        this.jTFNombreE.setText("");
        this.jTFDireccion.setText("");
        this.jCBTipoE.setSelectedIndex(0);
    }
    
    public void consultaInicial(){
        try{
            String consultaE = "SELECT * FROM Empleado";
            con = connect.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(consultaE);
            
            Object[] empleados = new Object[6];
            modeloEmpleado = (DefaultTableModel) jTEmpleados.getModel();
            while(rs.next()){
                empleados[0] = rs.getInt("idEmpleado");
                empleados[1] = rs.getString("apellidoP");
                empleados[2] = rs.getString("apellidoM");
                empleados[3] = rs.getString("nombreE");
                empleados[4] = rs.getString("direccion");
                empleados[5] = rs.getString("tipoEmpleado");
                
                modeloEmpleado.addRow(empleados);
            }jTEmpleados.setModel(modeloEmpleado);
        }catch(Exception e){
            System.out.println("El error es: "+e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTEmpleados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTFIdEmpleado = new javax.swing.JTextField();
        jTFNombreE = new javax.swing.JTextField();
        jTFApellidoP = new javax.swing.JTextField();
        jTFApellidoM = new javax.swing.JTextField();
        jTFDireccion = new javax.swing.JTextField();
        jBAgregar = new javax.swing.JButton();
        jCBTipoE = new javax.swing.JComboBox<>();
        jBBuscar = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Apellido Paterno", "Apellido materno", "Nombre", "Direccion", "Tipo Empleado"
            }
        ));
        jTEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTEmpleados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setText("REGISTRAR EMPLEADOS");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("EMPLEADOS REGISTRADOS");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setText("Apellido Paterno:");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel6.setText("Apellido Materno:");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setText("Direccion:");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setText("Tipo Empleado:");

        jTFIdEmpleado.setEditable(false);
        jTFIdEmpleado.setEnabled(false);

        jBAgregar.setBackground(new java.awt.Color(34, 18, 81));
        jBAgregar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jBAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jBAgregar.setText("AGREGAR");
        jBAgregar.setBorderPainted(false);
        jBAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jCBTipoE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cajero", "Ayudante" }));

        jBBuscar.setBackground(new java.awt.Color(34, 18, 81));
        jBBuscar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jBBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBBuscar.setText("BUSCAR");
        jBBuscar.setBorderPainted(false);
        jBBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBActualizar.setBackground(new java.awt.Color(34, 18, 81));
        jBActualizar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jBActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jBActualizar.setText("ACTUALIZAR");
        jBActualizar.setBorderPainted(false);
        jBActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(34, 18, 81));
        jBEliminar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminar.setText("ELIMINAR");
        jBEliminar.setBorderPainted(false);
        jBEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBLimpiar.setBackground(new java.awt.Color(34, 18, 81));
        jBLimpiar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jBLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jBLimpiar.setText("LIMPIAR");
        jBLimpiar.setBorderPainted(false);
        jBLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFIdEmpleado)
                            .addComponent(jTFNombreE, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFApellidoP)
                            .addComponent(jTFApellidoM)
                            .addComponent(jTFDireccion)
                            .addComponent(jCBTipoE, javax.swing.GroupLayout.Alignment.TRAILING, 0, 495, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(62, 62, 62))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jCBTipoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        String apellidoP = jTFApellidoP.getText();
        String apellidoM = jTFApellidoM.getText();
        String nombreE = jTFNombreE.getText();
        String direccion = jTFDireccion.getText();
        String tipoE = this.jCBTipoE.getSelectedItem().toString();

        String queryInsertar = "INSERT INTO empleado (apellidoP, apellidoM, nombreE, direccion, tipoEmpleado) VALUES ('" + apellidoP + "', '" + apellidoM + "','" + nombreE + "','" + direccion + "', '" + tipoE + "')";

        if (apellidoP.equals("") && apellidoM.equals("") && nombreE.equals("") && direccion.equals("") && tipoE.equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Tienes que ingresar datos");
        } else if (apellidoP.equals("") || apellidoM.equals("") || nombreE.equals("") || direccion.equals("") || tipoE.equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Ingresa los datos faltantes");
        } else {
            try {
                con = connect.getConnection();
                st = con.createStatement();
                st.executeUpdate(queryInsertar);
                JOptionPane.showMessageDialog(null, "Registro agregado");
                con.commit();
                limpiarTabla();
                consultaInicial();
            } catch (SQLException e) {
                System.out.println("Error: " + e);
            }
            this.limpiarCampos();
        }
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        int fila = this.jTEmpleados.getSelectedRow();
        int idEmpleado = Integer.parseInt(this.jTEmpleados.getValueAt(fila, 0).toString());
        String apellidoP = jTFApellidoP.getText();
        String apellidoM = jTFApellidoM.getText();
        String nombreE = jTFNombreE.getText();
        String direccion = jTFDireccion.getText();
        String tipoE = this.jCBTipoE.getSelectedItem().toString();
        
        String modifSql = "UPDATE Empleado SET apellidoP='"+apellidoP+"',apellidoM='"+apellidoM+"', nombreE ='"+nombreE+"', direccion='"+direccion+"', tipoEmpleado='"+tipoE+"' WHERE idEmpleado = "+idEmpleado;
        
        try{
            con = connect.getConnection();
            st = con.createStatement();
            st.execute(modifSql);
            JOptionPane.showMessageDialog(null, "Registro Actualizado");
            con.commit();
            limpiarTabla();
            consultaInicial();
        }catch(Exception e){
            System.out.println("El error es: "+e);
        }
        this.limpiarCampos();
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        String nombreB = jTFNombreE.getText();
        String buscarSql = "SELECT * FROM Empleado WHERE nombreE LIKE '%" + nombreB + "%'";
        try {
            limpiarTabla();
            con = connect.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(buscarSql);
            
            Object[] empleados = new Object[6];
            modeloEmpleado = (DefaultTableModel) jTEmpleados.getModel();
            while (rs.next()) {
                empleados[0] = rs.getInt("idEmpleado");
                empleados[1] = rs.getString("apellidoP");
                empleados[2] = rs.getString("apellidoM");
                empleados[3] = rs.getString("nombreE");
                empleados[4] = rs.getString("direccion");
                empleados[5] = rs.getString("tipoEmpleado");

                modeloEmpleado.addRow(empleados);
            }
            if (modeloEmpleado.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No existe el registro relacionado con " + nombreB);
                consultaInicial();
            }
            jTEmpleados.setModel(modeloEmpleado);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        this.limpiarCampos();
        //this.jBReiniciar.setEnabled(true);
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int fila = this.jTEmpleados.getSelectedRow();
        int idEmpleado = Integer.parseInt(this.jTEmpleados.getValueAt(fila, 0).toString());
        String sql = "DELETE FROM Empleado WHERE idEmpleado = "+idEmpleado;
        try{
            con = connect.getConnection();
            st = con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
            con.commit();
            limpiarTabla();
            consultaInicial();
        }catch(Exception e){
            System.out.println("El error fue: "+e);
        }
        this.limpiarCampos();
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        this.limpiarCampos();
        this.limpiarTabla();
        this.consultaInicial();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jTEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTEmpleadosMouseClicked
        int fila = this.jTEmpleados.getSelectedRow();
        this.jTFIdEmpleado.setText(this.jTEmpleados.getValueAt(fila, 0).toString());
        this.jTFApellidoP.setText(this.jTEmpleados.getValueAt(fila, 1).toString());
        this.jTFApellidoM.setText(this.jTEmpleados.getValueAt(fila, 2).toString());
        this.jTFNombreE.setText(this.jTEmpleados.getValueAt(fila, 3).toString());
        this.jTFDireccion.setText(this.jTEmpleados.getValueAt(fila, 4).toString());
        jCBTipoE.setSelectedItem((String) jTEmpleados.getValueAt(fila, 5));
    }//GEN-LAST:event_jTEmpleadosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JComboBox<String> jCBTipoE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTEmpleados;
    private javax.swing.JTextField jTFApellidoM;
    private javax.swing.JTextField jTFApellidoP;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFIdEmpleado;
    private javax.swing.JTextField jTFNombreE;
    // End of variables declaration//GEN-END:variables
}
