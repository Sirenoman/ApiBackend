package alucar.studio.apiBackend.dtos;

import java.io.Serializable;

import alucar.studio.apiBackend.models.Categoria;

public class CategoriaDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nombre;
	
	public CategoriaDTO(Categoria categoria) {
		this.id = categoria.getId();
		this.nombre = categoria.getNombre();
	}
	
	public CategoriaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategoriaDTO(String nombre) {
		super();
		this.nombre = nombre;
	}

	// GETTERS AND SETTERS
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
