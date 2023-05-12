package ContenidoB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * @author crist
 */
public class JPClientes extends javax.swing.JPanel {
    ConexionDB connect = new ConexionDB();
    Connection con;
    Statement st;
    ResultSet rs;
    DefaultTableModel modeloCliente;

    public JPClientes() {
        initComponents();
        consultaInicial();
    }
    
    void limpiarTabla() {
        for (int i = 0; i < jTClientes.getRowCount(); i++) {
            modeloCliente.removeRow(i);
            i = i - 1;
        }
    }
    
    void limpiarCampos(){
        this.jTFIdCliente.setText("");
        this.jTFApellidoP.setText("");
        this.jTFApellidoM.setText("");
        this.jTFNombreC.setText("");
        this.jTFDireccion.setText("");
    }
    
    public void consultaInicial(){
        try{
            String consultaE = "SELECT * FROM cliente";
            con = connect.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(consultaE);
            
            Object[] clientes = new Object[5];
            modeloCliente = (DefaultTableModel) jTClientes.getModel();
            while(rs.next()){
                clientes[0] = rs.getInt("idCliente");
                clientes[1] = rs.getString("apellidoP");
                clientes[2] = rs.getString("apellidoM");
                clientes[3] = rs.getString("nombreC");
                clientes[4] = rs.getString("direccion");
                
                modeloCliente.addRow(clientes);
            }jTClientes.setModel(modeloCliente);
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
        jTClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFIdCliente = new javax.swing.JTextField();
        jTFNombreC = new javax.swing.JTextField();
        jTFApellidoP = new javax.swing.JTextField();
        jTFApellidoM = new javax.swing.JTextField();
        jTFDireccion = new javax.swing.JTextField();
        jBAgregar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Apellido Paterno", "Apellido materno", "Nombre", "Direccion"
            }
        ));
        jTClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTClientes);

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
        jLabel1.setText("REGISTRAR CLIENTES");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("CLIENTES REGISTRADOS");

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

        jTFIdCliente.setEditable(false);
        jTFIdCliente.setEnabled(false);
        jTFIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIdClienteActionPerformed(evt);
            }
        });

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
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFIdCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                            .addComponent(jTFNombreC, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFApellidoP)
                            .addComponent(jTFApellidoM)
                            .addComponent(jTFDireccion))
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
                    .addComponent(jTFIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
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

    private void jTFIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIdClienteActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        String apellidoP = jTFApellidoP.getText();
        String apellidoM = jTFApellidoM.getText();
        String nombreC = jTFNombreC.getText();
        String direccion = jTFDireccion.getText();

        String queryInsertar = "INSERT INTO cliente (apellidoP, apellidoM, nombreC, direccion) VALUES ('" + apellidoP + "', '" + apellidoM + "','" + nombreC + "','" + direccion + "')";

        if (apellidoP.equals("") && apellidoM.equals("") && nombreC.equals("") && direccion.equals("")) {
            JOptionPane.showMessageDialog(null, "Tienes que ingresar datos");
        } else if (apellidoP.equals("") || apellidoM.equals("") || nombreC.equals("") || direccion.equals("") || nombreC.equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Ingresa los datos faltantes");
        } else {
            try {
                con = connect.getConnection();
                st = con.createStatement();
                st.executeUpdate(queryInsertar);
                JOptionPane.showMessageDialog(null, "Registro agregado");
                limpiarTabla();
                consultaInicial();
            } catch (SQLException e) {
                System.out.println("Error: " + e);
            }
            this.limpiarCampos();
        }
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        int fila = this.jTClientes.getSelectedRow();
        int idCliente = Integer.parseInt(this.jTClientes.getValueAt(fila, 0).toString());
        String apellidoP = jTFApellidoP.getText();
        String apellidoM = jTFApellidoM.getText();
        String nombreC = jTFNombreC.getText();
        String direccion = jTFDireccion.getText();
        
        String modifSql = "UPDATE cliente SET apellidoP='"+apellidoP+"',apellidoM='"+apellidoM+"', nombreC ='"+nombreC+"', direccion='"+direccion+"' WHERE idCliente = "+idCliente;
        
        try{
            con = connect.getConnection();
            st = con.createStatement();
            st.execute(modifSql);
            JOptionPane.showMessageDialog(null, "Registro Actualizado");
            limpiarTabla();
            consultaInicial();
        }catch(Exception e){
            System.out.println("El error es: "+e);
        }
        this.limpiarCampos();
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jTClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClientesMouseClicked
        int fila = this.jTClientes.getSelectedRow();
        this.jTFIdCliente.setText(this.jTClientes.getValueAt(fila, 0).toString());
        this.jTFApellidoP.setText(this.jTClientes.getValueAt(fila, 1).toString());
        this.jTFApellidoM.setText(this.jTClientes.getValueAt(fila, 2).toString());
        this.jTFNombreC.setText(this.jTClientes.getValueAt(fila, 3).toString());
        this.jTFDireccion.setText(this.jTClientes.getValueAt(fila, 4).toString());
    }//GEN-LAST:event_jTClientesMouseClicked

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int fila = this.jTClientes.getSelectedRow();
        int idCliente = Integer.parseInt(this.jTClientes.getValueAt(fila, 0).toString());
        String sql = "DELETE FROM cliente WHERE idCliente = "+idCliente;
        try{
            con = connect.getConnection();
            st = con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
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

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        String nombreB = jTFNombreC.getText();
        String buscarSql = "SELECT * FROM cliente WHERE nombrec LIKE '%" + nombreB + "%'";
        try{
            limpiarTabla();
            con = connect.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(buscarSql);
            
            Object[] clientes = new Object[5];
            modeloCliente = (DefaultTableModel) jTClientes.getModel();
            while(rs.next()){
                clientes[0] = rs.getInt("idCliente");
                clientes[1] = rs.getString("apellidoP");
                clientes[2] = rs.getString("apellidoM");
                clientes[3] = rs.getString("nombreC");
                clientes[4] = rs.getString("direccion");
                
                modeloCliente.addRow(clientes);
            }if(modeloCliente.getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "No existe el registro relacionado con " + nombreB);
                consultaInicial();
            }
            jTClientes.setModel(modeloCliente);
        }catch(Exception e){
            System.out.println("El error es: "+e);
        }
        this.limpiarCampos();
    }//GEN-LAST:event_jBBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTClientes;
    private javax.swing.JTextField jTFApellidoM;
    private javax.swing.JTextField jTFApellidoP;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFIdCliente;
    private javax.swing.JTextField jTFNombreC;
    // End of variables declaration//GEN-END:variables
}
