package com.sanvalero.laboratorio.exception;

public class ProductoSinStockException extends Exception {
	
	public ProductoSinStockException() {
		super();
	}

	public ProductoSinStockException(String mensaje) {
		super(mensaje);
	}
}
