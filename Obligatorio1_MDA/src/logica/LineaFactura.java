package logica;

public class LineaFactura {
    
    private Producto producto;
    private int cantidad;
    private int descuento;

    public LineaFactura(Producto producto, int cantidad, int descuento) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int d) {
        this.descuento = d;
    }    
    
    
    public boolean tieneProducto(Producto unP){
        return this.getProducto().equals(unP);
    }

    @Override
    public String toString() {
        return  getProducto().getCodigo() + " - " + 
                getProducto().getNombre() + " - " + 
                getCantidad() + " - " + 
                " $ " + getTotalConDescuento();
    }

    boolean incrementar(int cantidad) {
        if (this.cantidad + cantidad > producto.getUnidades()) {
            return false;
        }
        this.cantidad += cantidad;
        return true;
    }
    
    public float getTotalConDescuento() {
        return cantidad * (producto.getPrecio() - (producto.getPrecio()* descuento/100));
    }
    
    public float getMontoDescontado() {
        return cantidad * (producto.getPrecio()* descuento/100);
    }
    
    protected void bajarStock() {
        producto.modificarStock(-cantidad);
    }
}
