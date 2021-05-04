package main;

import interfaz.IUGraficaMenu;
import interfaz.IuConsola;
import logica.DatosPrueba;

public class Inicio {

     public static void main(String[] args) throws Exception {
        DatosPrueba.cargar();
        
        IUGraficaMenu menu = new IUGraficaMenu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        
        /*
        IuConsola menu = new IuConsola();
        menu.mostrarConsola();
        */
      } 
}
