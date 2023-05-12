import ContenidoB.JPClientes;
import ContenidoB.JPEmpleados;
import ContenidoB.JPInicio;
import ContenidoB.JPOpciones;
import ContenidoB.JPProductos;
import ContenidoB.JPProveedores;
import java.awt.BorderLayout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
/*
 * @author crist
 */
public class JFMenu extends javax.swing.JFrame {

    public JFMenu() {
        initComponents();
        initContent();
        setDate();
    }
    
    private void setDate(){
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        jLDate.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy ", spanishLocale)));
    }
    
    private void initContent(){
        JPInicio cInicio = new JPInicio();
        cInicio.setSize(900, 500);
        cInicio.setLocation(0,0);
        
        jPContenidoM.removeAll();
        jPContenidoM.add(cInicio, BorderLayout.CENTER);
        jPContenidoM.revalidate();
        jPContenidoM.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo = new javax.swing.JPanel();
        jPOpciones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jBInicio = new javax.swing.JButton();
        jBEmpleado = new javax.swing.JButton();
        jBClientes = new javax.swing.JButton();
        jBProveedores = new javax.swing.JButton();
        jBProductos = new javax.swing.JButton();
        jBOpciones = new javax.swing.JButton();
        jPHeader = new javax.swing.JPanel();
        jLDate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPContenidoM = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPFondo.setBackground(new java.awt.Color(34, 18, 81));

        jPOpciones.setBackground(new java.awt.Color(34, 18, 81));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLASTICOS");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("GOMEZ");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setAlignmentX(1.5F);
        jSeparator1.setAlignmentY(0.9F);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botella.png"))); // NOI18N

        jBInicio.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jBInicio.setForeground(new java.awt.Color(255, 255, 255));
        jBInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio.png"))); // NOI18N
        jBInicio.setText("INICIO");
        jBInicio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 10, new java.awt.Color(0, 0, 0)));
        jBInicio.setBorderPainted(false);
        jBInicio.setContentAreaFilled(false);
        jBInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInicioActionPerformed(evt);
            }
        });

        jBEmpleado.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jBEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        jBEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        jBEmpleado.setText("EMPLEADOS");
        jBEmpleado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 10, new java.awt.Color(0, 0, 0)));
        jBEmpleado.setBorderPainted(false);
        jBEmpleado.setContentAreaFilled(false);
        jBEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEmpleadoActionPerformed(evt);
            }
        });

        jBClientes.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jBClientes.setForeground(new java.awt.Color(255, 255, 255));
        jBClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleado.png"))); // NOI18N
        jBClientes.setText("CLIENTES");
        jBClientes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 10, new java.awt.Color(0, 0, 0)));
        jBClientes.setBorderPainted(false);
        jBClientes.setContentAreaFilled(false);
        jBClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClientesActionPerformed(evt);
            }
        });

        jBProveedores.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jBProveedores.setForeground(new java.awt.Color(255, 255, 255));
        jBProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventario.png"))); // NOI18N
        jBProveedores.setText("PROVEEDORES");
        jBProveedores.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 10, new java.awt.Color(0, 0, 0)));
        jBProveedores.setBorderPainted(false);
        jBProveedores.setContentAreaFilled(false);
        jBProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProveedoresActionPerformed(evt);
            }
        });

        jBProductos.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jBProductos.setForeground(new java.awt.Color(255, 255, 255));
        jBProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos.png"))); // NOI18N
        jBProductos.setText("PRODUCTOS");
        jBProductos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 10, new java.awt.Color(0, 0, 0)));
        jBProductos.setBorderPainted(false);
        jBProductos.setContentAreaFilled(false);
        jBProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProductosActionPerformed(evt);
            }
        });

        jBOpciones.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jBOpciones.setForeground(new java.awt.Color(255, 255, 255));
        jBOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuraciones.png"))); // NOI18N
        jBOpciones.setText("OPCIONES");
        jBOpciones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 10, new java.awt.Color(0, 0, 0)));
        jBOpciones.setBorderPainted(false);
        jBOpciones.setContentAreaFilled(false);
        jBOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOpcionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPOpcionesLayout = new javax.swing.GroupLayout(jPOpciones);
        jPOpciones.setLayout(jPOpcionesLayout);
        jPOpcionesLayout.setHorizontalGroup(
            jPOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOpcionesLayout.createSequentialGroup()
                .addGroup(jPOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jBClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        jPOpcionesLayout.setVerticalGroup(
            jPOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOpcionesLayout.createSequentialGroup()
                .addGroup(jPOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPOpcionesLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2))
                    .addGroup(jPOpcionesLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jBInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPHeader.setBackground(new java.awt.Color(255, 255, 255));

        jLDate.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        jLDate.setText("Hoy Es {dayname} {day} de {year}");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        jLabel4.setText("CONTENIDO");

        javax.swing.GroupLayout jPHeaderLayout = new javax.swing.GroupLayout(jPHeader);
        jPHeader.setLayout(jPHeaderLayout);
        jPHeaderLayout.setHorizontalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                .addComponent(jLDate)
                .addContainerGap())
        );
        jPHeaderLayout.setVerticalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPContenidoM.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPContenidoMLayout = new javax.swing.GroupLayout(jPContenidoM);
        jPContenidoM.setLayout(jPContenidoMLayout);
        jPContenidoMLayout.setHorizontalGroup(
            jPContenidoMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPContenidoMLayout.setVerticalGroup(
            jPContenidoMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPFondoLayout = new javax.swing.GroupLayout(jPFondo);
        jPFondo.setLayout(jPFondoLayout);
        jPFondoLayout.setHorizontalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFondoLayout.createSequentialGroup()
                .addComponent(jPOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPContenidoM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPFondoLayout.setVerticalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPFondoLayout.createSequentialGroup()
                .addComponent(jPHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPContenidoM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmpleadoActionPerformed
        JPEmpleados cEmpleados = new JPEmpleados();
        cEmpleados.setSize(885, 500);
        cEmpleados.setLocation(0,0);
        
        jPContenidoM.removeAll();
        jPContenidoM.add(cEmpleados, BorderLayout.CENTER);
        jPContenidoM.revalidate();
        jPContenidoM.repaint();
    }//GEN-LAST:event_jBEmpleadoActionPerformed

    private void jBClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClientesActionPerformed
        JPClientes cClientes = new JPClientes();
        cClientes.setSize(885, 500);
        cClientes.setLocation(0,0);
        
        jPContenidoM.removeAll();
        jPContenidoM.add(cClientes, BorderLayout.CENTER);
        jPContenidoM.revalidate();
        jPContenidoM.repaint();
    }//GEN-LAST:event_jBClientesActionPerformed

    private void jBProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProveedoresActionPerformed
        JPProveedores cProveedores = new JPProveedores();
        cProveedores.setSize(885, 500);
        cProveedores.setLocation(0,0);
        
        jPContenidoM.removeAll();
        jPContenidoM.add(cProveedores, BorderLayout.CENTER);
        jPContenidoM.revalidate();
        jPContenidoM.repaint();
    }//GEN-LAST:event_jBProveedoresActionPerformed

    private void jBProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProductosActionPerformed
        JPProductos cProductos = new JPProductos();
        cProductos.setSize(885, 500);
        cProductos.setLocation(0,0);
        
        jPContenidoM.removeAll();
        jPContenidoM.add(cProductos, BorderLayout.CENTER);
        jPContenidoM.revalidate();
        jPContenidoM.repaint();
    }//GEN-LAST:event_jBProductosActionPerformed

    private void jBOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOpcionesActionPerformed
        JPOpciones cOpciones = new JPOpciones();
        cOpciones.setSize(885, 500);
        cOpciones.setLocation(0,0);
        
        jPContenidoM.removeAll();
        jPContenidoM.add(cOpciones, BorderLayout.CENTER);
        jPContenidoM.revalidate();
        jPContenidoM.repaint();
    }//GEN-LAST:event_jBOpcionesActionPerformed

    private void jBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInicioActionPerformed
        JPInicio cInicio = new JPInicio();
        cInicio.setSize(900, 500);
        cInicio.setLocation(0,0);
        
        jPContenidoM.removeAll();
        jPContenidoM.add(cInicio, BorderLayout.CENTER);
        jPContenidoM.revalidate();
        jPContenidoM.repaint();
    }//GEN-LAST:event_jBInicioActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBClientes;
    private javax.swing.JButton jBEmpleado;
    private javax.swing.JButton jBInicio;
    private javax.swing.JButton jBOpciones;
    private javax.swing.JButton jBProductos;
    private javax.swing.JButton jBProveedores;
    private javax.swing.JLabel jLDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPContenidoM;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPHeader;
    private javax.swing.JPanel jPOpciones;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
