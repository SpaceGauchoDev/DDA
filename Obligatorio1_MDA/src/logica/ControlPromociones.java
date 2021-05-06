package logica;

import java.util.ArrayList;

public class ControlPromociones {
    private ArrayList<Promocion> promociones = new ArrayList();
    
    public ControlPromociones(){
        
    }
    
    public ArrayList<Promocion> getPromociones() {
        return promociones;
    }
    
    public boolean agregar(Promocion p){
        boolean ok = false;
        if(p.validar() && getPromocion(p.getCodigo()) == null){
            promociones.add(p);
            ok = true;
        }
        return ok;
    }
    
    public Promocion getPromocion(String codigo){
        Promocion promo = null;
        for (Promocion p: promociones){
            if(p.compararCodigo(codigo)){
                promo = p;
            }
        }
        
        return promo;
    } 
    
    public int getDescuento(Producto p){
        int porcentaje = 0;
        // si encontramos un producto listado en una promocion devolvemos su descuento
        // si no lo encontramos significa su descuento es 0
        
        for (Promocion promo: promociones){
            if(promo.contieneProducto(p)){
                porcentaje = promo.getDescuento();
            }
        }
        
        return porcentaje;
    }
    
    
    public float montoDeDescuentoOtorgadoPorPromocion(String codigoPromo){
        Promocion promo = getPromocion(codigoPromo);
        ArrayList <Producto> productos = promo.getProductos();
        float result = 0;
        for (Producto prod: productos){
            result += Fachada.getInstancia().montoTotalDescontadoPorProducto(prod);
        }
        
        return result;
    }
    
    
    
}
