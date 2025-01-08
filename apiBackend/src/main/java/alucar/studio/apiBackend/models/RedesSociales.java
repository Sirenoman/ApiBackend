package alucar.studio.apiBackend.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "defaultdb", name = "redes_sociales")
public class RedesSociales implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 849360986074307586L;
	
	@Id
	@Column(name = "ID_RED")
	private Long id;
	@Column(name = "NOMBRE_RED")
	private String nombre;
	@Column(name = "URL_RED")
	private String url;
	@Column(name = "ID_EMPRENDIMIENTO")
	private Long idEmprendimiento;
	
	public RedesSociales(Long id, String nombre, String url, Long idEmprendimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.url = url;
		this.idEmprendimiento = idEmprendimiento;
	}
	
	public RedesSociales() {
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
	public String getName() {
		return nombre;
	}
	public void setName(String nombre) {
		this.nombre = nombre;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Long getIdEmprendimiento() {
		return idEmprendimiento;
	}
	public void setIdEmprendimiento(Long idEmprendimiento) {
		this.idEmprendimiento = idEmprendimiento;
	}
	
	
}
