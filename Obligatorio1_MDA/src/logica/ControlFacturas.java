package logica;

import java.util.ArrayList;
import java.util.Date;

public class ControlFacturas {

    private ArrayList<Factura> facturas = new ArrayList();
    private int proximoNumero;
   
    public ControlFacturas(){
    
    }
    
    public ArrayList<Factura> getFacturas() {
        return facturas;
    }
    
    public void agregar(Factura unaFactura){
        unaFactura.setNumero(generarProximoNumero());
        unaFactura.asignarFecha();
        unaFactura.bajarStock();
        facturas.add(unaFactura);
    }
    
    public boolean clienteComproProducto(Cliente c, Producto p){
        boolean ret = false;
        for(Factura f: facturas){
            if (f.getCliente().equals(c)&&f.tieneProducto(p)){
                ret = true;
            }
        }
      
        return ret;
    }
    
    public Date clienteFechaUltimaFacturaPorProducto(Cliente c, Producto p){
        Date ret = null;
  
        for(Factura f: facturas){
            if (f.getCliente().equals(c) && f.tieneProducto(p)) {
                ret = f.getFecha();
            }
        }
        return ret;
    }
    
    private int generarProximoNumero(){
        proximoNumero++;
        return proximoNumero;
    }
    
    public float montoTotalDescontadoPorProducto(Producto p){
        float result = 0;
        
        for(Factura f: facturas){
            if (f.tieneProducto(p)) {
                result += f.obtenerMontoDescontadoPorProducto(p);
            }
        }
        
        return result;
    }
    
    public InfoProducto InformacionPorProducto(Producto p){
        InfoProducto info = new InfoProducto();
        
        info.setNombre(p.getNombre());
        info.setPrecioDeLista(p.getPrecio());
        
        int facturasEnLasQueAparece = 0;
        for(Factura f: facturas){
            if (f.tieneProducto(p)) {
                facturasEnLasQueAparece++; 
            }
        }
        info.setCantidadDeFacturas(facturasEnLasQueAparece);
        
        int cantidadesTotalesVendidas = 0;
        for(Factura f: facturas){
            if (f.tieneProducto(p)) {
                cantidadesTotalesVendidas+= f.obtenerCantidadDeProducto(p);
            }
        }
        info.setCantidadDeUnidadesVenidas(cantidadesTotalesVendidas);
        info.setMontoTotalDescuento(montoTotalDescontadoPorProducto(p));
        
        return info;
    }
    
}
