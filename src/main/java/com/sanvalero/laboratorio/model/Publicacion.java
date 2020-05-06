package com.sanvalero.laboratorio.model;

public class Publicacion {
	
	private String foto;
	
	public Publicacion(String foto) {
		super();
		this.foto = foto;
	}

	public static String notificar(String nombreUsuario) {
		
		return "El usuario "+nombreUsuario+ " ha subido una foto";
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

}
