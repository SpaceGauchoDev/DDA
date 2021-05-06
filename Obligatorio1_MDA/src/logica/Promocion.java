package logica;

import java.util.ArrayList;

public class Promocion {
    private String codigo;
    private String nombre;
    private int porcentajeDeDescuento;
    private ArrayList <Producto> productos;
    
    public Promocion(){
        codigo = "aaaaa";
        nombre = "default";
        porcentajeDeDescuento = 0;
        productos = new ArrayList();
    }
    
    public Promocion(String c, String n, int p, ArrayList <Producto> pr){
        codigo = c;
        nombre = n;
        porcentajeDeDescuento = p;
        productos = pr;
    }
    
    public boolean contieneProducto(Producto p){
        boolean result = false;
        
        for(Producto prod: productos){
            if(prod.getCodigo() == p.getCodigo()){
                result = true;
                break;
            }
        }
        return result;
    }
    
    public int getDescuento(){
        return porcentajeDeDescuento;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public ArrayList <Producto> getProductos(){
        return productos;
    }
    
    private boolean verificarDescuento(){
        return porcentajeDeDescuento >=0 && porcentajeDeDescuento <=100;
    }
    
    private boolean verificarNombre(){
        return nombre.length() >= 3 && nombre.length()<= 64 && !nombre.equals("default");
    }
    
    private boolean verificarCodigo(){
        return codigo.length() == 5 && !codigo.equals("aaaaa");
    }

    public boolean validar(){
        return verificarDescuento() && verificarNombre() && verificarCodigo();
    }
    
    public boolean compararCodigo(String cod){
        return cod.equals(codigo);
    }
}
