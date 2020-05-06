package com.sanvalero.laboratorio.model;

import com.sanvalero.laboratorio.exception.ProductoSinStockException;

public class UsuarioComun extends Usuario {

	private int numeroPrendasCompradas;
	
	public UsuarioComun(String nombreUsuario, String contrasena, int numeroSeguidores, int numeroSeguidos, int numeroPrendasCompradas) {
		super(nombreUsuario, contrasena, numeroSeguidores, numeroSeguidos);
		this.numeroPrendasCompradas = numeroPrendasCompradas;
	}

	/**
	 * Método que le permite a un usuario comprar una prenda
	 * @param publicacion
	 * @param nombreUsuario
	 * @param precio
	 * @throws ProductoSinStockException
	 */
	public void comprarPrenda(Publicacion publicacion, String nombreUsuario, float precio) throws ProductoSinStockException {
		boolean a = true;
		if(DescripcionPrenda.isStock() == a) {	
			float ganancias = UsuarioVIP.obtenerGanancias(precio);
			numeroPrendasCompradas++;
		}else {
			 throw new ProductoSinStockException("No hay stock");
		}
	}
	
	public int getNumeroPrendasCompradas() {
		return numeroPrendasCompradas;
	}


	public void setNumeroPrendasCompradas(int numeroPrendasCompradas) {
		this.numeroPrendasCompradas = numeroPrendasCompradas;
	}

	
}
