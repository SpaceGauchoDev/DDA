**2021-05-02**
	para que funcione el boton de cerrar ventana:
		- seleccionar JFrame
		- con el editor de Diseño, en la ventana de Properties
		- set defaultCloseOperation to DISPOSE		
	para setear acciones a botones 
		- seleccionar item 
		- con el editor de Diseño, en la ventana de Events
		- click en actionPerformed, drop down menu will suggest a actionPerformed function name based on var name
		- con el editor de Source, agregar codigo a esa funcion

## Front end:
### menu principal:
	**- drop down menu:** Inicio
		**- option:** Salir
	
	**- drop down menu:** GestionFacturas
		**- option:** Alta de factura por consola (solo para su uso a nivel de testing)
	
	**- drop down menu:** GestionPromociones
		**- option:** Alta De Promocion
			#### submenu Alta De Promocion
				**- input text field:** 	Codigo de la promocion
				**- input text field:** 	Nombre de la promocion
				**- number field:**			Porcentaje de descuento
				**- input text field:** 	Codigo de promocion
				**- button:**				Guardar
				**- text box:** 			Resultado
				**- button:**				Atrás
		**- option:** Reporte De Promocion
			#### submenu Reporte De Promocion (hay promociones)
				**- scrollable list text box/button objects:** Nombre promocion / Reporte
				**- button:**				Atrás
					#### submenu Reporte De Promocion Seleccionada
						**- text box:** Info Promocion seleccionada
						**- button:**	Atrás
				
			#### submenu Reporte De Promocion (no hay promociones)
				**- text box:**  	Mensaje "no hay promociones" 
				**- button:**		Atrás
				
				