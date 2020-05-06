package com.sanvalero.laboratorio.model;

public class DescripcionPrenda {
	private  String nombre;
	private  String descripcion;
	private float precio;
	private static boolean stock;
	
	private Publicacion publicacion;

	public DescripcionPrenda(String nombre, String descripcion, float precio, boolean disponibilidad, Publicacion publicacion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		stock = disponibilidad;
		this.setPublicacion(publicacion);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public static boolean isStock() {
		return stock;
	}

	public static void setStock(boolean disponibilidad) {
		stock = disponibilidad;
	}

	public Publicacion getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}

}
