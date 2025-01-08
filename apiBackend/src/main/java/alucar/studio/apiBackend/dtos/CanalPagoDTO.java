package alucar.studio.apiBackend.dtos;

import java.io.Serializable;

import alucar.studio.apiBackend.models.CanalPago;

public class CanalPagoDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nombre;
	
	public CanalPagoDTO(CanalPago canal) {
		this.id = canal.getId();
		this.nombre = canal.getNombre();
	}
	
	public CanalPagoDTO(String nombre) {
		super();
		this.nombre = nombre;
	}

	public CanalPagoDTO() {
		super();
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
