package logica;

public class LineaFactura {
    
    private Producto producto;
    private int cantidad;
    private float descuento; //TODO mda: actualizar UML

    public LineaFactura(Producto producto, int cantidad, float descuento) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }

    public Producto getProducto() {
        return producto;
    }

    // TODO mda: revisar si esto cumple experto
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    // TODO mda: revisar si esto cumple experto
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    // TODO mda: revisar si esto cumple experto
    boolean incrementar(int cantidad) {
        if (this.cantidad + cantidad > producto.getUnidades()) {
            return false;
        }
        this.cantidad += cantidad;
        return true;
    }
    
    //TODO mda: Actualizar UML
    public float getTotalConDescuento() {
        return cantidad * producto.getPrecio() * (1 - descuento);
    }
    
    // TODO mda: revisar si esto cumple experto
    protected void bajarStock() {
        producto.modificarStock(-cantidad);
    }
}
