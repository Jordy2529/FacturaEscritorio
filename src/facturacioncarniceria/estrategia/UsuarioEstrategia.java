/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacioncarniceria.estrategia;

import facturacioncarniceria.datos.Usuario;
import facturacioncarniceria.modelo.UsuarioDAO;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class UsuarioEstrategia implements InterfaceStrategy
{
    UsuarioDAO usuariodao=new UsuarioDAO();

    public UsuarioEstrategia() {
    }
    
    @Override
    public void add(Object obj, int tipo) {
        Usuario usuario;
        usuario = (Usuario) obj;
        usuariodao.addUsuario(usuario);
    }

    @Override
    public void visualize(DefaultTableModel modelo, int tipo) {
        usuariodao.visualizeUsuario(modelo);
    }

    @Override
    public void modify(Object obj, String numUsuario) {
        Usuario usuario;
        usuario = (Usuario) obj;
        usuariodao.modifyUsuario(usuario, numUsuario);
    }

    @Override
    public void vizualizeTextoPedidoDatos(JTextField txtuno, JTextField txtdos, JTextField txttres, JTextField txtcuatro, String codigoPedido) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String codigoFactura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float precioProducto(String codigoProducto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addFacturaDetalle(DefaultTableModel tablaProductos, String cedulaCliente, String numeroFactura, String cedulaUsuario, int metodoPago) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float cantidadProducto(String codigoProducto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarCantidad(float cantidad, String codigoProducto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visualizeUsuarioContra(JTextField txtuno, JTextField txtdos, JTextField txttres, String cedula) {
        usuariodao.visualizeUsuarioContra(txtuno, txtdos, txttres, cedula);
    }

    @Override
    public void modificarContrasena(String nuevaContrasena, String numUsuario) {
        usuariodao.modificarContrasena(nuevaContrasena, numUsuario);
    }

    @Override
    public void llenarComboBox(JComboBox combo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visualizeRucProveedor(JTextField txtuno, String codigoPedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addCompra(String codigoProovedor, String numFactura, String fechaCompra, DefaultTableModel tablaCotizacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visualizeAnular(DefaultTableModel tableProvider, String codigoFacturaAnulada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addCotiacionDetalle(DefaultTableModel tablaProductos, String numeroFactura, String cedulaUsuario, float totalCotizacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addCompraVenta(String idmetologia, String cedulausuario, String fechaCompraVenta, String identificacionCompraVenta, String nombreCompraVenta, String numeroCompraVenta, double subtotal12compraventa, double base0compraventa, double iva12compraventa, double totalcompraventa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visualizeCompraVenta(DefaultTableModel tableProvider, String fechaIncio, String fechaFin, int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visualizeCotizacionDetalle(DefaultTableModel tableProvider, String codigoCotizacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visualizarCliente(JTextField txtuno, JTextField txtdos, String codigoCotizacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
