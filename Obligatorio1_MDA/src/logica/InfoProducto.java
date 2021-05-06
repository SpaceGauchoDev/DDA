package logica;

public class InfoProducto {
    private String nombre = "";
    private int precioDeLista;
    private int cantidadDeFacturas;
    private int cantidadDeUnidadesVenidas;
    private float montoTotalDescuento;    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioDeLista() {
        return precioDeLista;
    }

    public void setPrecioDeLista(int precioDeLista) {
        this.precioDeLista = precioDeLista;
    }

    public int getCantidadDeFacturas() {
        return cantidadDeFacturas;
    }

    public void setCantidadDeFacturas(int cantidadDeFacturas) {
        this.cantidadDeFacturas = cantidadDeFacturas;
    }

    public int getCantidadDeUnidadesVenidas() {
        return cantidadDeUnidadesVenidas;
    }

    public void setCantidadDeUnidadesVenidas(int cantidadDeUnidadesVenidas) {
        this.cantidadDeUnidadesVenidas = cantidadDeUnidadesVenidas;
    }

    public float getMontoTotalDescuento() {
        return montoTotalDescuento;
    }

    public void setMontoTotalDescuento(float montoTotalDescuento) {
        this.montoTotalDescuento = montoTotalDescuento;
    }
}
