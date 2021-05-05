package logica;

import java.util.ArrayList;

public class Promocion {
    private String codigo;
    private String nombre;
    private float porcentajeDeDescuento;
    private ArrayList <Producto> productos;
    
    Promocion(){
        codigo = "aaaaa";
        nombre = "default";
        porcentajeDeDescuento = 0;
        productos = new ArrayList();
    }
    
    //TODO mda: implementar
    public boolean contieneProducto(Producto p){
        return true;
    }
    
    public float getDescuento(){
        return porcentajeDeDescuento;
    }
    
    //TODO mda: actualizar UML
    public String getCodigo(){
        return codigo;
    }

    //TODO mda: implementar
    // codigo.lenght == 5
    // porcentajeDeDescuento >=0 && porcentajeDeDescuento <=1
    public boolean validar(){
        
        return true;
    }
    
    //TODO mda: actualizar UML
    public boolean compararCodigo(String cod){
        return cod==codigo;
    }
}
