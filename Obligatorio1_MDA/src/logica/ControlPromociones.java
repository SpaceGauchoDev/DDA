package logica;

import java.util.ArrayList;

public class ControlPromociones {
    private ArrayList<Promocion> promociones = new ArrayList();
    
    public ControlPromociones(){
        
    }
    
    public ArrayList<Promocion> getPromociones() {
        return promociones;
    }
    
    //TODO mda: implementar
    public void agregar(Promocion p){
        
        
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
    
    public float porcentajeDeDescuento(Producto p){
        float porcentaje = 0;
        for (Promocion promo: promociones){
            if(promo.contieneProducto(p)){
                porcentaje = promo.getDescuento();
            }
        }
        
        return porcentaje;
    }
    
}
