package alucar.studio.apiBackend.models;

import java.io.Serializable;

import alucar.studio.apiBackend.dtos.EmprendedorDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "defaultdb", name = "emprendedor")
public class Emprendedor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2275441373889011415L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EMPRENDEDOR")
	private Long id;
	@Column(name = "NOMBRE_EMPRENDEDOR")
	private String nombre;
	@Column(name = "NI_EMPRENDEDOR")
	private String numeroIdentificacion;
	@Column(name = "CORREO_EMPRENDEDOR")
	private String correo;
	@Column(name = "NU_EMPRENDEDOR")
	private String numeroUni;
	
	public Emprendedor(EmprendedorDTO empr) {
		this.id = empr.getId();
		this.nombre = empr.getNombre();
		this.numeroIdentificacion = empr.getNumeroIdentificacion();
		this.correo = empr.getCorreo();
		this.numeroUni = empr.getNumeroUni();
	}
	
	public Emprendedor(Long id, String nombre, String numeroIdentificacion, String correo, String numeroUni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numeroIdentificacion = numeroIdentificacion;
		this.correo = correo;
		this.numeroUni = numeroUni;
	}
	
	public Emprendedor() {
		super();
		// TODO Auto-generated constructor stub
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
