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
public class JPProductos extends javax.swing.JPanel {
    ConexionDB connect = new ConexionDB();
    Connection con;
    Statement st;
    ResultSet rs;
    DefaultTableModel modeloProducto;

    public JPProductos() {
        initComponents();
        consultaInicial();
    }
    
    void limpiarTabla() {
        for (int i = 0; i < jTProductos.getRowCount(); i++) {
            modeloProducto.removeRow(i);
            i = i - 1;
        }
    }

    void limpiarCampos() {
        this.jTFIdProducto.setText("");
        this.jTFNombreProducto.setText("");
        this.jTFDescripcion.setText("");
        this.jTFPrecio.setText("");
    }

    public void consultaInicial() {
        try {
            String consultaE = "SELECT * FROM producto";
            con = connect.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(consultaE);

            Object[] productos = new Object[4];
            modeloProducto = (DefaultTableModel) jTProductos.getModel();
            while (rs.next()) {
                productos[0] = rs.getInt("idProducto");
                productos[1] = rs.getString("nombreProducto");
                productos[2] = rs.getString("descripcion");
                productos[3] = rs.getString("precio");

                modeloProducto.addRow(productos);
            }
            jTProductos.setModel(modeloProducto);
        } catch (Exception e) {
            System.out.println("El error es: " + e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFIdProducto = new javax.swing.JTextField();
        jTFNombreProducto = new javax.swing.JTextField();
        jTFDescripcion = new javax.swing.JTextField();
        jTFPrecio = new javax.swing.JTextField();
        jBAgregar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Precio"
            }
        ));
        jTProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTProductos);

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
        jLabel1.setText("REGISTRAR PRODUCTOS");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("PRODUCTOS REGISTRADOS");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setText("Descripcion:");

        jTFIdProducto.setEditable(false);
        jTFIdProducto.setEnabled(false);

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

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setText("Precio:");

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
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFIdProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                            .addComponent(jTFNombreProducto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFDescripcion)
                            .addComponent(jTFPrecio))
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
                    .addComponent(jTFIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        String nombreProducto = jTFNombreProducto.getText();
        String descripcion = jTFDescripcion.getText();
        String precio = String.valueOf(jTFPrecio.getText());

        String queryInsertar = "INSERT INTO producto (nombreProducto, descripcion, precio) VALUES ('" + nombreProducto + "', '" + descripcion + "','" + precio + "')";

        if (nombreProducto.equals("") && descripcion.equals("") && precio.equals("")){
            JOptionPane.showMessageDialog(null, "Tienes que ingresar datos");
        } else if (nombreProducto.equals("") || descripcion.equals("") || precio.equals("")) {
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

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        String nombreB = jTFNombreProducto.getText();
        String buscarSql = "SELECT * FROM producto WHERE nombreProducto LIKE '%" + nombreB + "%'";
        try{
            limpiarTabla();
            con = connect.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(buscarSql);
            
            Object[] productos = new Object[5];
            modeloProducto = (DefaultTableModel) jTProductos.getModel();
            while(rs.next()){
                productos[0] = rs.getInt("idProducto");
                productos[1] = rs.getString("nombreProducto");
                productos[2] = rs.getString("descripcion");
                productos[3] = rs.getString("precio");

                modeloProducto.addRow(productos);
            }if(modeloProducto.getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "No existe el registro relacionado con " + nombreB);
                consultaInicial();
            }
            jTProductos.setModel(modeloProducto);
        }catch(Exception e){
            System.out.println("El error es: "+e);
        }
        this.limpiarCampos();
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        int fila = this.jTProductos.getSelectedRow();
        int idProducto = Integer.parseInt(this.jTProductos.getValueAt(fila, 0).toString());
        String nombreProducto = jTFNombreProducto.getText();
        String descripcion = jTFDescripcion.getText();
        String precio = String.valueOf(jTFPrecio.getText());
        
        String modifSql = "UPDATE producto SET nombreProducto='"+nombreProducto+"',descripcion='"+descripcion+"', precio ='"+precio+"' WHERE idProducto = "+idProducto;
        
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

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int fila = this.jTProductos.getSelectedRow();
        int idProducto = Integer.parseInt(this.jTProductos.getValueAt(fila, 0).toString());
        String sql = "DELETE FROM productos WHERE idProducto = "+idProducto;
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

    private void jTProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProductosMouseClicked
        int fila = this.jTProductos.getSelectedRow();
        this.jTFIdProducto.setText(this.jTProductos.getValueAt(fila, 0).toString());
        this.jTFNombreProducto.setText(this.jTProductos.getValueAt(fila, 1).toString());
        this.jTFDescripcion.setText(this.jTProductos.getValueAt(fila, 2).toString());
        this.jTFPrecio.setText(this.jTProductos.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_jTProductosMouseClicked


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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFDescripcion;
    private javax.swing.JTextField jTFIdProducto;
    private javax.swing.JTextField jTFNombreProducto;
    private javax.swing.JTextField jTFPrecio;
    private javax.swing.JTable jTProductos;
    // End of variables declaration//GEN-END:variables
}