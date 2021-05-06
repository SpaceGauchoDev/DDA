package logica;
import java.util.ArrayList;

public class DatosPrueba {

    public static void cargar(){
       
        Fachada logica = Fachada.getInstancia();
        
        //======PROVEEDORES
        //=================
        Proveedor pA = new Proveedor("Proveedor A");
        logica.agregarProveedor(pA);
        
        Proveedor pB = new Proveedor("Proveedor B");
        logica.agregarProveedor(pB);
        
        Proveedor pC = new Proveedor("Proveedor C");
        logica.agregarProveedor(pC); 
        
        //========PRODUCTOS
        //=================
        Producto caramelo = new Producto("Caramelo",2,3000,pA);
        logica.agregarProducto(caramelo);
        
        Producto camisa = new Producto("Camisa",1300,1000,pB);
        logica.agregarProducto(camisa);
        
        Producto computadora = new Producto("Computadora",20000,40,pC);
        logica.agregarProducto(computadora);
        
        Producto manteca = new Producto("Manteca",50,5000,pC);
        logica.agregarProducto(manteca);
        
        Producto taza = new Producto("Manteca",100,5000,pC);
        logica.agregarProducto(taza);

        Producto lamparita = new Producto("Lamparita",75,5000,pA);
        logica.agregarProducto(lamparita);

        Producto pantufla = new Producto("Pantufla",250,5000,pB);
        logica.agregarProducto(pantufla);

        Producto detergente = new Producto("Detergente",170,5000,pB);
        logica.agregarProducto(detergente);
        
        //======PROMOCIONES
        //=================
        ArrayList <Producto> productos_1 = new ArrayList();
        productos_1.add(pantufla);
        productos_1.add(camisa);
        Promocion promo1 = new Promocion("PRO_1", "Promo ropa", 15, productos_1 );
        logica.agregarPromocion(promo1);
        
        ArrayList <Producto> productos_2 = new ArrayList();
        productos_2.add(detergente);
        productos_2.add(caramelo);
        Promocion promo2 = new Promocion("PRO_2", "Promo comida", 50, productos_2 );
        logica.agregarPromocion(promo2);
       
        
        //=========CLIENTES
        //=================
        Cliente juan = new Cliente("12345678","Juan");
        logica.agregarCliente(juan);
        
        Cliente ana = new Cliente("13456789","Ana");
        logica.agregarCliente(ana);
        
        Cliente mario = new Cliente("21234567","Mario");
        logica.agregarCliente(mario);
        
        Cliente danilo = new Cliente("42935245","Danilo");
        logica.agregarCliente(danilo);

        Cliente gabriel = new Cliente("42935246","Gabriel");
        logica.agregarCliente(gabriel);
        
        Cliente roberto = new Cliente("42935247","Roberto");
        logica.agregarCliente(roberto);
        
        Cliente yamila = new Cliente("42935248","Yamila");
        logica.agregarCliente(yamila);

        //=========FACTURAS
        //=================
        
        Factura f1 = new Factura(juan);
        f1.agregar(30, caramelo);
        f1.agregar(2, camisa);
        f1.agregar(1, computadora);
        logica.agregarFactura(f1);
        /*
        Factura f2 = new Factura(ana);
        f2.agregar(400, caramelo);
        f2.agregar(20, camisa);
        f2.agregar(10, computadora);
        logica.agregarFactura(f2);
        
        Factura f3 = new Factura(mario);
        f3.agregar(1, pantufla);
        f3.agregar(1, computadora);
        logica.agregarFactura(f3);
        */
        Factura f4 = new Factura(danilo);
        f4.agregar(5, manteca);
        f4.agregar(2, pantufla);
        f4.agregar(1, detergente);
        logica.agregarFactura(f4);
        
        /*
        Factura f5 = new Factura(yamila);
        f5.agregar(2, lamparita);
        f5.agregar(1, taza);
        logica.agregarFactura(f5);
        */
    }
}
