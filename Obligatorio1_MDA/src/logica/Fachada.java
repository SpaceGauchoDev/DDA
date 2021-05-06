package logica;

import java.util.ArrayList;
import java.util.Date;

public class Fachada {
    
    private static Fachada instancia;
    
    private ControlClientes cc = new ControlClientes();
    private ControlFacturas cf = new ControlFacturas();
    private ControlStock cs = new ControlStock();
    private ControlPromociones cpromo = new ControlPromociones();
    
    public static Fachada getInstancia(){
        
        if (instancia==null){
            instancia =  new Fachada();
        }
        return instancia;
    }
    
    public ArrayList<Cliente> getClientes() {
        return cc.getClientes();
    }
    
    public ArrayList clientesNoCompraronProductoMenorPrecio(){
        return cc.clientesNoCompraronProductoMenorPrecio();
    }
    
    public ArrayList<Cliente> clientesCompraronProductoMenorPrecio() {
        return cc.clientesCompraronProductoMenorPrecio();
    }

    public boolean existeCliente(String unaCedula) {
           return cc.existeCliente(unaCedula);
    }
    
    public Cliente buscarClientePorCedula(String unaCedula) {
           return cc.getClientePorCedula(unaCedula);
    }
  
    public boolean agregarCliente(Cliente c){
        return cc.agregar(c);
    }
    
    public ArrayList<Factura> getFacturas() {
        return cf.getFacturas();
    }
    
    public void agregarFactura(Factura unaFactura){
        cf.agregar(unaFactura);
    }
    
    public boolean clienteComproProducto(Cliente c, Producto p){
        return cf.clienteComproProducto(c, p);
    }
    
    public Date clienteFechaUltimaFacturaPorProducto(Cliente c, Producto p){
        return cf.clienteFechaUltimaFacturaPorProducto(c, p);
    }
    
    public ArrayList<Producto> getProductos() {
        return cs.getProductos();
    }

    public ArrayList<Proveedor> getProveedores() {
        return cs.getProveedores();
    }
    
    public Producto getProductoMenorPrecio(){
        return cs.getProductoMenorPrecio();
    }
  
    public void agregarProveedor(Proveedor unProveedor){
        cs.agregar(unProveedor);
    }
    
    public  boolean agregarProducto(Producto unProducto){
        return cs.agregar(unProducto);
    }
    
    public Producto buscarProductoPorCodigo(int codigoProducto) {
        return cs.getProductoPorCodigo(codigoProducto);
    }
    
    public int getDescuentoPorProducto(Producto p){
        return cpromo.getDescuento(p);
    }
    
    public void agregarPromocion(Promocion unaPromocion){
        cpromo.agregar(unaPromocion);
    }
    
    public ArrayList<Promocion> getPromociones() {
        return cpromo.getPromociones();
    }
    
    public Promocion getPromocion(String codigoPromo) {
        return cpromo.getPromocion(codigoPromo);
    }
    
    public float montoDeDescuentoOtorgadoPorPromocion(String codigoPromo){
        return cpromo.montoDeDescuentoOtorgadoPorPromocion(codigoPromo);
    }
    
    public float montoTotalDescontadoPorProducto(Producto p){
        return cf.montoTotalDescontadoPorProducto(p);
    }
    
    public InfoProducto InformacionPorProducto(Producto p){
        return cf.InformacionPorProducto(p);
    }
}
