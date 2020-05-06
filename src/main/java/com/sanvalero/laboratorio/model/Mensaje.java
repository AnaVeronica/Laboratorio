package com.sanvalero.laboratorio.model;

import java.time.LocalDate;

public class Mensaje {
	private String mensaje;
	private boolean recibido;
	private static LocalDate fecha;
	
	private Usuario usuarioEmisor;
	private Usuario usuarioReceptor;
	
	public Mensaje(String mensaje, boolean recibido, LocalDate date, Usuario usuarioEmisor, Usuario usuarioReceptor) {
		super();
		this.mensaje = mensaje;
		this.recibido = recibido;
		fecha = date;
		this.usuarioEmisor = usuarioEmisor;
		this.usuarioReceptor = usuarioReceptor;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public boolean isRecibido() {
		return recibido;
	}

	public void setRecibido(boolean recibido) {
		this.recibido = recibido;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate date) {
		fecha = date;
	}

	public Usuario getUsuarioEmisor() {
		return usuarioEmisor;
	}

	public void setUsuarioEmisor(Usuario usuarioEmisor) {
		this.usuarioEmisor = usuarioEmisor;
	}

	public Usuario getUsuarioReceptor() {
		return usuarioReceptor;
	}

	public void setUsuarioReceptor(Usuario usuarioReceptor) {
		this.usuarioReceptor = usuarioReceptor;
	}	
	
}
