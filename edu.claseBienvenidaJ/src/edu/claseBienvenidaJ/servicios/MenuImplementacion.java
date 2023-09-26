package edu.claseBienvenidaJ.servicios;
/**
 * Implementación de la interfaz Menú
 * 260923 -cmr
 */
public class MenuImplementacion implements MenuInterfaz {

	/**
	 * Método que imprime por pantalla mensaje de bienvenida
	 * 260923 -cmr
	 */
	@Override
	public void mostrarMensajeBienvenida() {
		// TODO Auto-generated method stub

		String mensaje = "Clinica CS1";
				
		System.out.println(mensaje);
	}

}
