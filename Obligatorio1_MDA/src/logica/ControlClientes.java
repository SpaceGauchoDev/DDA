package logica;

import java.util.ArrayList;

public class ControlClientes {

    private ArrayList<Cliente> clientes = new ArrayList();

    public ControlClientes(){
        
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    public ArrayList<Cliente> clientesNoCompraronProductoMenorPrecio(){
        Producto menor = Fachada.getInstancia().getProductoMenorPrecio();
        ArrayList<Cliente> retorno = new ArrayList<Cliente>();
        
        for(Cliente c: clientes){
            if (!Fachada.getInstancia().clienteComproProducto(c, menor)){
                retorno.add(c);
            }
        }
        return retorno;
    }
    
    public ArrayList<Cliente> clientesCompraronProductoMenorPrecio() {
        Producto menor = Fachada.getInstancia().getProductoMenorPrecio();
        ArrayList<Cliente> retorno = new ArrayList<Cliente>();
        
        for(Cliente c: clientes){
            if (Fachada.getInstancia().clienteComproProducto(c, menor)){
                retorno.add(c);
            }
        }
        return retorno;
    }

     public boolean existeCliente(String unaCedula) {
           boolean existe = false;
           int pos=0;
           ArrayList<Cliente> lista = this.getClientes();
           while (pos<lista.size()&&!existe){
               Cliente c = lista.get(pos);
               if (c.getCedula().equals(unaCedula)){
                   existe = true;
               }
               pos++;
           }
           return existe;
    }
        
    public boolean agregar(Cliente c){
        boolean ok = false;
        if (c.validar() && !this.existeCliente(c.getCedula())){
            clientes.add(c);
            ok=true;
        }
        
        return ok;
    }

    public Cliente getClientePorCedula(String unaCedula) {
        boolean existe = false;
        int pos=0;
        ArrayList<Cliente> lista = this.getClientes();
        while (pos<lista.size()&&!existe){
            Cliente c = lista.get(pos);
            if (c.getCedula().equals(unaCedula)){
                return c;
            }
            pos++;
        }
        return null;
    }
}
