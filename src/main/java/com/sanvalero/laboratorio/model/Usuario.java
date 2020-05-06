package com.sanvalero.laboratorio.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombreUsuario;
	private String contrasena;
	private int numeroSeguidores;
	private int numeroSeguidos;
	
	private List<DescripcionPrenda> descripciones;
	private List<Publicacion> publicaciones;
	private List<Mensaje> mensajesEnviados;
	private List<Mensaje> mensajesRecibidos;
	
	public Usuario(String nombreUsuario, String contrasena, int numeroSeguidores, int numeroSeguidos) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
		this.numeroSeguidores = numeroSeguidores;
		this.numeroSeguidos = numeroSeguidos;
		
		descripciones = new ArrayList<>();
		publicaciones = new ArrayList<>();
		mensajesEnviados = new ArrayList<>();
		mensajesRecibidos = new ArrayList<>();
	}
	
	/**
	 * Método que comparte una foto al perfil del usuario correspondiente
	 * @param nombreUsuario
	 * @param foto
	 */
	public void compartirFoto(String nombreUsuario, String foto) {
			
		Publicacion miPublicacion = new Publicacion(nombreUsuario, foto);
		publicaciones.add(miPublicacion);	
		Publicacion.notificar(nombreUsuario);		
	}
	
	/**
	 * Método que elimina una publicación
	 * @param publicacion
	 */
	public void eliminarFoto(Publicacion publicacion) {
		publicaciones.remove(publicacion);
	}
	
	/**
	 * Método que permite a un usuario etiquetar una prenda en una determinada publicación
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 * @param stock
	 * @param publicacion
	 */
	public void etiquetarPrenda(String nombre, String descripcion, float precio, boolean stock, Publicacion publicacion) {
		
		DescripcionPrenda descripcionPrenda = new DescripcionPrenda(nombre, descripcion, precio, stock, publicacion);
		descripciones.add(descripcionPrenda);	
	}
	
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public int getNumeroSeguidores() {
		return numeroSeguidores;
	}
	
	public void setNumeroSeguidores(int numeroSeguidores) {
		this.numeroSeguidores = numeroSeguidores;
	}
	
	public int getNumeroSeguidos() {
		return numeroSeguidos;
	}
	
	public void setNumeroSeguidos(int numeroSeguidos) {
		this.numeroSeguidos = numeroSeguidos;
	}

	public List<Mensaje> getMensajesEnviados() {
		return mensajesEnviados;
	}

	public void setMensajesEnviados(List<Mensaje> mensajesEnviados) {
		this.mensajesEnviados = mensajesEnviados;
	}

	public List<Mensaje> getMensajesRecibidos() {
		return mensajesRecibidos;
	}

	public void setMensajesRecibidos(List<Mensaje> mensajesRecibidos) {
		this.mensajesRecibidos = mensajesRecibidos;
	}

	public List<DescripcionPrenda> getDescripciones() {
		return descripciones;
	}

	public void setDescripciones(List<DescripcionPrenda> descripciones) {
		this.descripciones = descripciones;
	}

	public List<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(List<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}	
	
}
