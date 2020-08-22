/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacioncarniceria.controlador;

import facturacioncarniceria.estrategia.Context;
import facturacioncarniceria.estrategia.ReportesEstrategia;
import facturacioncarniceria.modelo.Conexion;
import facturacioncarniceria.modelo.ReportesDAO;
import facturacioncarniceria.modelo.Validaciones;
import facturacioncarniceria.vista.VPrincipal;
import facturacioncarniceria.vista.VReportes;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.TableView;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author JORDY
 */
public class CReportes implements KeyListener, MouseListener, ActionListener {

    VReportes vreportes;
    Context contextReportes;
    VPrincipal vprincipal;
    ReportesDAO reportesDAO;
    ReportesEstrategia strategyReportes = new ReportesEstrategia();
    Conexion connectionBD;
    Validaciones validar =  new Validaciones();
    
    DefaultTableModel  modeloTablaVentas = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int filas, int columnas) {
            if (columnas == 3) {
                return true;
            } else {
                return false;
            }
        }
    };
    
    DefaultTableModel  modeloTablaCompras = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int filas, int columnas) {
            if (columnas == 3) {
                return true;
            } else {
                return false;
            }
        }
    };

    
    TableRowSorter trs;

    public CReportes(Context context, VReportes vreportes, VPrincipal vmain) {
        reportesDAO = new ReportesDAO();
        this.vreportes = vreportes;
        this.contextReportes = context;
        this.vprincipal = vmain;
        this.contextReportes = new Context(strategyReportes);
        
        this.vreportes.getBtnActualizar().addActionListener(this);
        this.vreportes.getBtnExportarCompras().addActionListener(this);
//       // this.vreportes.getJmiModificar().addActionListener(this);
        this.vreportes.getBtnExportarVentas().addActionListener(this);
//        this.vreportes.getTxtBuscar().addKeyListener(this);
//        this.vreportes.getTablaUsuario().addMouseListener(this);

        this.connectionBD = new Conexion();

        modeloTablaCompras.addColumn("#");
        modeloTablaCompras.addColumn("TIPO");
        modeloTablaCompras.addColumn("FECHA");
        modeloTablaCompras.addColumn("IDENT. RUC");
        modeloTablaCompras.addColumn("NOM. PROVEEDOR");
        modeloTablaCompras.addColumn("NUM. FACTURA");
        modeloTablaCompras.addColumn("SUB 12%");
        modeloTablaCompras.addColumn("BASE 0%");
        modeloTablaCompras.addColumn("IVA 12%");
        modeloTablaCompras.addColumn("TOTAL");
        modeloTablaCompras.addColumn("PAGO");
        modeloTablaCompras.addColumn("REALIZADO");
        vreportes.getTablaReporteCompra().setModel(modeloTablaCompras);

        modeloTablaVentas.addColumn("#");
        modeloTablaVentas.addColumn("TIPO");
        modeloTablaVentas.addColumn("FECHA");
        modeloTablaVentas.addColumn("IDENT. CEDULA");
        modeloTablaVentas.addColumn("NOM. CLIENTE");
        modeloTablaVentas.addColumn("NUM. FACTURA");
        modeloTablaVentas.addColumn("SUB 12%");
        modeloTablaVentas.addColumn("BASE 0%");
        modeloTablaVentas.addColumn("IVA 12%");
        modeloTablaVentas.addColumn("TOTAL");
        modeloTablaVentas.addColumn("PAGO");
        modeloTablaVentas.addColumn("REALIZADO");
        vreportes.getTablaReporteVenta().setModel(modeloTablaVentas);
    }

    public void validarCampos() {

    }

    public void iniciarVentana() {
        vreportes.show();
        validarCampos();
        
        
        vreportes.getTablaReporteCompra().getColumnModel().getColumn(0).setPreferredWidth(2);
        vreportes.getTablaReporteCompra().getColumnModel().getColumn(1).setPreferredWidth(50);
        vreportes.getTablaReporteCompra().getColumnModel().getColumn(2).setPreferredWidth(40);
        vreportes.getTablaReporteCompra().getColumnModel().getColumn(3).setPreferredWidth(60);
        vreportes.getTablaReporteCompra().getColumnModel().getColumn(4).setPreferredWidth(150);
        vreportes.getTablaReporteCompra().getColumnModel().getColumn(5).setPreferredWidth(80);
        vreportes.getTablaReporteCompra().getColumnModel().getColumn(6).setPreferredWidth(20);
        vreportes.getTablaReporteCompra().getColumnModel().getColumn(7).setPreferredWidth(20);
        vreportes.getTablaReporteCompra().getColumnModel().getColumn(8).setPreferredWidth(20);
        vreportes.getTablaReporteCompra().getColumnModel().getColumn(9).setPreferredWidth(20);
        vreportes.getTablaReporteCompra().getColumnModel().getColumn(10).setPreferredWidth(20);
        vreportes.getTablaReporteCompra().getColumnModel().getColumn(11).setPreferredWidth(100);
        
        vreportes.getTablaReporteVenta().getColumnModel().getColumn(0).setPreferredWidth(2);
        vreportes.getTablaReporteVenta().getColumnModel().getColumn(1).setPreferredWidth(50);
        vreportes.getTablaReporteVenta().getColumnModel().getColumn(2).setPreferredWidth(40);
        vreportes.getTablaReporteVenta().getColumnModel().getColumn(3).setPreferredWidth(60);
        vreportes.getTablaReporteVenta().getColumnModel().getColumn(4).setPreferredWidth(150);
        vreportes.getTablaReporteVenta().getColumnModel().getColumn(5).setPreferredWidth(80);
        vreportes.getTablaReporteVenta().getColumnModel().getColumn(6).setPreferredWidth(20);
        vreportes.getTablaReporteVenta().getColumnModel().getColumn(7).setPreferredWidth(20);
        vreportes.getTablaReporteVenta().getColumnModel().getColumn(8).setPreferredWidth(20);
        vreportes.getTablaReporteVenta().getColumnModel().getColumn(9).setPreferredWidth(20);
        vreportes.getTablaReporteVenta().getColumnModel().getColumn(10).setPreferredWidth(20);
        vreportes.getTablaReporteVenta().getColumnModel().getColumn(11).setPreferredWidth(100);
        
        Date fechaActual = new Date();
        vreportes.getDcInicial().setDate(fechaActual);
        vreportes.getDcFinal().setDate(fechaActual);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String fechaIngreso = sdf.format(vreportes.getDcInicial().getDate());
        String fechaIngresoFin = sdf.format(vreportes.getDcFinal().getDate());

        contextReportes.RunvisualizeCompraVenta(modeloTablaCompras, fechaIngreso, fechaIngresoFin, 1);
        contextReportes.RunvisualizeCompraVenta(modeloTablaVentas, fechaIngreso, fechaIngresoFin, 2);

        vprincipal.getLblCedula().getText();
        // contextReportes.RunVisualizeContra(vmodificarcontra.getTxtCedula(),vmodificarcontra.getTxtContra(),vmodificarcontra.getTxtNombres(),vmodificarcontra.getTxtCargo(),vmain.getLblcedula().getText());
    }

    public void cleanTableCompra() {
        for (int i = 0; i < vreportes.getTablaReporteCompra().getRowCount(); i++) {
            modeloTablaCompras.removeRow(i);
            i -= 1;
        }
    }

    public void cleanTableVenta() {
        for (int i = 0; i < vreportes.getTablaReporteVenta().getRowCount(); i++) {
            modeloTablaVentas.removeRow(i);
            i -= 1;
        }
    }

    public void limpiarCampos() {

    }

    @Override
    public void keyReleased(KeyEvent ae) {

    }

    @Override
    public void keyTyped(KeyEvent ae) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        if (e.getClickCount() == 2 && !e.isConsumed() && vreportes.getTablaUsuario()== e.getSource()) {
//            try {
//                int fila = vreportes.getTablaUsuario().getSelectedRow();
//                if (fila >= 0) {
//                    vreportes.getTxtCedula().setText(vreportes.getTablaUsuario().getValueAt(fila,0).toString());
//                    vreportes.getTxtNombres().setText(vreportes.getTablaUsuario().getValueAt(fila,1).toString());
//                    vreportes.getTxtApellido().setText(vreportes.getTablaUsuario().getValueAt(fila,2).toString());
//                    vreportes.getBtnGuardarUsuario().setEnabled(false);
//                    vreportes.getBtnModificarUsuario().setEnabled(true);
//                    vreportes.getTablaUsuario().setEnabled(false);
//                }
//            }catch (Exception ex) {
//                JOptionPane.showMessageDialog(vprincipal, "No se Guardo");
//            }
//        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public void crearCarpetas(String compraVenta, String fechaInicio, String fechaFinal) {

        File directorio = new File("C:\\COMPRA VENTA\\" + compraVenta+"_"+fechaInicio+"_"+fechaFinal);
        directorio.mkdirs();
    }

    public void exportarExcel(JTable t, String compraVenta) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaIngreso = sdf.format(vreportes.getDcInicial().getDate());
        String fechaIngresoFin = sdf.format(vreportes.getDcFinal().getDate());
        crearCarpetas(compraVenta,fechaIngreso,fechaIngresoFin);
        
        JFileChooser chooser = new JFileChooser("C:/COMPRA VENTA/" + compraVenta+"_"+fechaIngreso+"_"+fechaIngresoFin);
        chooser.setSelectedFile(new File("REPORTE_" + compraVenta+"_"+fechaIngreso+"_"+fechaIngresoFin));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".xls");
            try {
                File archivoXLS = new File(ruta);
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
                Workbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet("Lista de Productos Cotización");
                hoja.setDisplayGridlines(false);
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(f);
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (f == 0) {
                            celda.setCellValue(t.getColumnName(c));
                        }
                    }
                }
                int filaInicio = 1;
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (t.getValueAt(f, c) instanceof Double) {
                            celda.setCellValue(Double.parseDouble(t.getValueAt(f, c).toString()));
                        } else if (t.getValueAt(f, c) instanceof Float) {
                            celda.setCellValue(Float.parseFloat((String) t.getValueAt(f, c)));
                        } else {
                            celda.setCellValue(String.valueOf(t.getValueAt(f, c)));
                        }
                    }
                }
                libro.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
            } catch (IOException | NumberFormatException e) {
                throw e;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (this.vreportes.getBtnExportarVentas() == ae.getSource()) {
            try {
                exportarExcel(vreportes.getTablaReporteVenta(),"VENTAS");
            } catch (IOException ex) {
                Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (this.vreportes.getBtnExportarCompras()== ae.getSource()) {
            try {
                exportarExcel(vreportes.getTablaReporteCompra(),"COMPRAS");
            } catch (IOException ex) {
                Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (this.vreportes.getBtnActualizar() == ae.getSource()) {
            cleanTableCompra();
            cleanTableVenta();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            String fechaIngreso = sdf.format(vreportes.getDcInicial().getDate());
            String fechaIngresoFin = sdf.format(vreportes.getDcFinal().getDate());

//        vreportes.getDcInicial().setFormatoFecha(fechaActual);
//        vreportes.getDcFinal().setDate(fechaActual);
            contextReportes.RunvisualizeCompraVenta(modeloTablaCompras, fechaIngreso, fechaIngresoFin, 1);
            contextReportes.RunvisualizeCompraVenta(modeloTablaVentas, fechaIngreso, fechaIngresoFin, 2);
        }

    }
}
