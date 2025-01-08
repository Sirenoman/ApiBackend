package alucar.studio.apiBackend.dtos;

import java.io.Serializable;

import alucar.studio.apiBackend.models.Emprendedor;

public class EmprendedorDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nombre;
	private String numeroIdentificacion;
	private String correo;
	private String numeroUni;
	
	public EmprendedorDTO(Emprendedor emp) {
		this.id = emp.getId();
		this.nombre = emp.getNombre();
		this.numeroIdentificacion = emp.getNumeroIdentificacion();
		this.correo = emp.getCorreo();
		this.numeroUni = emp.getNumeroUni();
	}
	
	public EmprendedorDTO(Long id, String nombre, String numeroIdentificacion, String correo, String numeroUni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numeroIdentificacion = numeroIdentificacion;
		this.correo = correo;
		this.numeroUni = numeroUni;
	}

	public EmprendedorDTO() {
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
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getNumeroUni() {
		return numeroUni;
	}
	public void setNumeroUni(String numeroUni) {
		this.numeroUni = numeroUni;
	}
	
	
}
