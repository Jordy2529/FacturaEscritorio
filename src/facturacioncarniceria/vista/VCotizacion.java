/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacioncarniceria.vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import rojeru_san.RSButtonRiple;
import rojeru_san.RSMTextFull;
import rojerusan.RSButtonCircle;

/**
 *
 * @author JORDY
 */
public class VCotizacion extends javax.swing.JInternalFrame {

    public JTextField getTxtClienteCotizacion() {
        return txtClienteCotizacion;
    }

    public void setTxtClienteCotizacion(JTextField txtClienteCotizacion) {
        this.txtClienteCotizacion = txtClienteCotizacion;
    }
    
    public JTextField getTxtNumeroArticulos() {
        return txtNumeroArticulos;
    }

    public void setTxtNumeroArticulos(JTextField txtNumeroArticulos) {
        this.txtNumeroArticulos = txtNumeroArticulos;
    }

    public JTextField getTxtTotalFactura() {
        return txtTotalFactura;
    }

    public void setTxtTotalFactura(JTextField txtTotalFactura) {
        this.txtTotalFactura = txtTotalFactura;
    }

    
    
    public RSButtonCircle getBtnCalcularFactura() {
        return btnCalcularFactura;
    }

    public void setBtnCalcularFactura(RSButtonCircle btnCalcularFactura) {
        this.btnCalcularFactura = btnCalcularFactura;
    }

    public RSButtonRiple getBtnEditarTabla() {
        return btnEditarTabla;
    }

    public void setBtnEditarTabla(RSButtonRiple btnEditarTabla) {
        this.btnEditarTabla = btnEditarTabla;
    }

    public JRadioButton getRbEfectivo() {
        return rbEfectivo;
    }

    public void setRbEfectivo(JRadioButton rbEfectivo) {
        this.rbEfectivo = rbEfectivo;
    }

    public JRadioButton getRbTarjeta() {
        return rbTarjeta;
    }

    public void setRbTarjeta(JRadioButton rbTarjeta) {
        this.rbTarjeta = rbTarjeta;
    }

    public JTextField getTxtNumeroCotizacion() {
        return txtNumeroCotizacion;
    }

    public void setTxtNumeroCotizacion(JTextField txtNumeroCotizacion) {
        this.txtNumeroCotizacion = txtNumeroCotizacion;
    }

   

    public RSButtonRiple getBtnGenerarPDFCotizacion() {
        return btnGenerarPDFCotizacion;
    }

    public void setBtnGenerarPDFCotizacion(RSButtonRiple btnGenerarPDFCotizacion) {
        this.btnGenerarPDFCotizacion = btnGenerarPDFCotizacion;
    }

    public JTable getTablaCotizacion() {
        return tablaCotizacion;
    }

    public void setTablaCotizacion(JTable tablaCotizacion) {
        this.tablaCotizacion = tablaCotizacion;
    }

    public JTable getTablaProductosCotizacion() {
        return tablaProductosCotizacion;
    }

    public void setTablaProductosCotizacion(JTable tablaProductosCotizacion) {
        this.tablaProductosCotizacion = tablaProductosCotizacion;
    }

    public JTextField getTxtBuscarProductosCotizacion() {
        return txtBuscarProductosCotizacion;
    }

    public void setTxtBuscarProductosCotizacion(JTextField txtBuscarProductosCotizacion) {
        this.txtBuscarProductosCotizacion = txtBuscarProductosCotizacion;
    }

    public JTextField getTxtFechaFinCo() {
        return txtFechaFinCo;
    }

    public void setTxtFechaFinCo(JTextField txtFechaFinCo) {
        this.txtFechaFinCo = txtFechaFinCo;
    }

    public JTextField getTxtFechaInicioCo() {
        return txtFechaInicioCo;
    }

    public void setTxtFechaInicioCo(JTextField txtFechaInicioCo) {
        this.txtFechaInicioCo = txtFechaInicioCo;
    }

    

    /**
     * Creates new form VProvider
     */
    public VCotizacion() {

        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCotizacion = new javax.swing.JTable();
        btnGenerarPDFCotizacion = new rojeru_san.RSButtonRiple();
        txtTotalFactura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNumeroArticulos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFechaInicioCo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNumeroCotizacion = new javax.swing.JTextField();
        pnlVisualizar1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductosCotizacion = new javax.swing.JTable();
        txtBuscarProductosCotizacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnCalcularFactura = new rojerusan.RSButtonCircle();
        rbEfectivo = new javax.swing.JRadioButton();
        rbTarjeta = new javax.swing.JRadioButton();
        btnEditarTabla = new rojeru_san.RSButtonRiple();
        jLabel12 = new javax.swing.JLabel();
        txtFechaFinCo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtClienteCotizacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("COTIZACION");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        tablaCotizacion.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tablaCotizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaCotizacion);

        btnGenerarPDFCotizacion.setBackground(new java.awt.Color(255, 153, 0));
        btnGenerarPDFCotizacion.setText("Guardar y Crear PDF");
        btnGenerarPDFCotizacion.setEnabled(false);
        btnGenerarPDFCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFCotizacionActionPerformed(evt);
            }
        });

        txtTotalFactura.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("TOTAL:");

        txtNumeroArticulos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("#");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumeroArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenerarPDFCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNumeroArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGenerarPDFCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtFechaInicioCo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFechaInicioCo.setEnabled(false);
        txtFechaInicioCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaInicioCoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Fec Cotización:");

        txtNumeroCotizacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtNumeroCotizacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroCotizacion.setEnabled(false);
        txtNumeroCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCotizacionActionPerformed(evt);
            }
        });

        pnlVisualizar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        pnlVisualizar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pnlVisualizar1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnlVisualizar1FocusGained(evt);
            }
        });
        pnlVisualizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlVisualizar1MouseClicked(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tablaProductosCotizacion.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tablaProductosCotizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaProductosCotizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosCotizacionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaProductosCotizacion);

        txtBuscarProductosCotizacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarProductosCotizacionKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Buscar:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscarProductosCotizacion))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarProductosCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlVisualizar1.addTab("Productos", jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCalcularFactura.setBackground(new java.awt.Color(0, 204, 51));
        btnCalcularFactura.setText("CALCULAR");
        btnCalcularFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularFacturaActionPerformed(evt);
            }
        });

        rbEfectivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbEfectivo.setText("EFECTIVO");
        rbEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEfectivoActionPerformed(evt);
            }
        });

        rbTarjeta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbTarjeta.setText("TARJETA");

        btnEditarTabla.setBackground(new java.awt.Color(0, 153, 153));
        btnEditarTabla.setText("Mas Productos");
        btnEditarTabla.setEnabled(false);
        btnEditarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbEfectivo)
                    .addComponent(rbTarjeta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcularFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btnEditarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbEfectivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbTarjeta))
                    .addComponent(btnCalcularFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnEditarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        pnlVisualizar1.addTab("Metodo de Pago", jPanel5);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("No:");

        txtFechaFinCo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFechaFinCo.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Valido Hasta:");

        txtClienteCotizacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtClienteCotizacion.setEnabled(false);
        txtClienteCotizacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteCotizacionKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("CLIENTE:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlVisualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtFechaInicioCo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaFinCo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtClienteCotizacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumeroCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClienteCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(txtNumeroCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaInicioCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtFechaFinCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(11, 11, 11)
                        .addComponent(pnlVisualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCotizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCotizacionActionPerformed

    private void btnGenerarPDFCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFCotizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarPDFCotizacionActionPerformed

    private void txtFechaInicioCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaInicioCoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaInicioCoActionPerformed

    private void pnlVisualizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVisualizar1MouseClicked

    }//GEN-LAST:event_pnlVisualizar1MouseClicked

    private void pnlVisualizar1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnlVisualizar1FocusGained
        // limpiarLogin();
        // limpiarRegistro();
        //txtCedulaLogin.grabFocus();
    }//GEN-LAST:event_pnlVisualizar1FocusGained

    private void btnEditarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTablaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarTablaActionPerformed

    private void rbEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEfectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbEfectivoActionPerformed

    private void btnCalcularFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularFacturaActionPerformed

    private void txtBuscarProductosCotizacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProductosCotizacionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarProductosCotizacionKeyReleased

    private void tablaProductosCotizacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosCotizacionMouseClicked
        // TODO add your handling code here:
        //        VPrincipal vmain = null;
        //
        //         if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            //                    evt.consume();
            //                    System.out.println("Double Click");
            //                    //System.out.println(vpedido.getTablaProductosPedido().getValueAt(vpedido.getTablaProductosPedido().getSelectedRow(), 0).toString());
            //                    JOptionPane.showMessageDialog(vmain,"dobleeee click" );
            //        }
    }//GEN-LAST:event_tablaProductosCotizacionMouseClicked

    private void txtClienteCotizacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteCotizacionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteCotizacionKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonCircle btnCalcularFactura;
    private rojeru_san.RSButtonRiple btnEditarTabla;
    private rojeru_san.RSButtonRiple btnGenerarPDFCotizacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane pnlVisualizar1;
    private javax.swing.JRadioButton rbEfectivo;
    private javax.swing.JRadioButton rbTarjeta;
    private javax.swing.JTable tablaCotizacion;
    private javax.swing.JTable tablaProductosCotizacion;
    private javax.swing.JTextField txtBuscarProductosCotizacion;
    private javax.swing.JTextField txtClienteCotizacion;
    private javax.swing.JTextField txtFechaFinCo;
    private javax.swing.JTextField txtFechaInicioCo;
    private javax.swing.JTextField txtNumeroArticulos;
    private javax.swing.JTextField txtNumeroCotizacion;
    private javax.swing.JTextField txtTotalFactura;
    // End of variables declaration//GEN-END:variables
}
