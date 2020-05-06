package com.sanvalero.laboratorio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sanvalero.laboratorio.model.DescripcionPrenda;
import com.sanvalero.laboratorio.model.Publicacion;
import com.sanvalero.laboratorio.model.UsuarioComun;

public class UsuarioTest {
	
	private static Publicacion foto1;
	private static UsuarioComun usuario;
	
	@BeforeAll
	public static void setupAll() {
		usuario = new UsuarioComun(null, null, 0, 0, 0);
	}
	
	@Test
	public void compartirFoto() {
		Publicacion publicacion1 = new Publicacion(null, null);
		Publicacion publicacion2 = new Publicacion(null, null);
		
		usuario.compartirFoto(null, null);
		usuario.compartirFoto(null, null);
		
		//Comprobar publicaciones
		assertEquals(2, usuario.getPublicaciones().size());
	}
	public void etiquetarPrenda() {
		DescripcionPrenda descripcion = new DescripcionPrenda("Camiseta", "Camiseta con bordados", 10, true, foto1);
		usuario.etiquetarPrenda("Camiseta", "Camiseta con bordados", 10, true, foto1);
		
		//Comprobar si se ha etiquetado la prenda
		assertEquals(1, usuario.getDescripciones().size());
		
		//Comprobar si se ha añadido la descripcion correctamente
		assertEquals("Camiseta con bordados", usuario.getDescripciones().get(0).getDescripcion());
	}
}
