package edu.claseBienvenidaJ.controladores;

import edu.claseBienvenidaJ.servicios.MenuImplementacion;
import edu.claseBienvenidaJ.servicios.MenuInterfaz;

/**
 * Clase principal de la aplicación
 * 250923 -cmr
 */
public class InicioAplicacion {

	public static void main(String[] args) {
		
		MenuInterfaz mi = new MenuImplementacion();
		
		mi.mostrarMensajeBienvenida();

	}

}
