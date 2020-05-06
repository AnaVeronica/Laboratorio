package com.sanvalero.laboratorio.model;

public class UsuarioVIP extends Usuario {

	private static float totalGanancias;

	public UsuarioVIP(String nombreUsuario, String contrasena, int numeroSeguidores, int numeroSeguidos, float gananciasTotales) {
		super(nombreUsuario, contrasena, numeroSeguidores, numeroSeguidos);
		totalGanancias = gananciasTotales;
	}

	/**
	  * Método que le permite obtener ganancias al usuario VIP
	  * @param precio
	  * @return
	  */
	public static float obtenerGanancias(float precio) {
		float comision = 0.2f;
		float aumento = precio * comision;
		totalGanancias += aumento;
		 
		return totalGanancias; 
	 }
	 
	public float getTotalGanancias() {
		return totalGanancias;
	}

	public void setTotalGanancias(float gananciasTotales) {
		totalGanancias = gananciasTotales;
	}
	
}
