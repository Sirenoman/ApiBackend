package alucar.studio.apiBackend.models;

import java.io.Serializable;

import alucar.studio.apiBackend.dtos.ComentariosDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "defaultdb", name = "comentarios")
public class Comentarios implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6404717398464055898L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_COMENTARIO")
	private Long id;
	@Column(name = "COMENTARIO")
	private String comentario;
	@Column(name = "ID_EMPR")
	private Long idEmprendimiento;
	@Column(name = "USUARIO")
	private String usuario;
	@Column(name = "PUNTUACION")
	private int puntuacion;
	
	public Comentarios(ComentariosDTO com) {
		this.id = com.getId();
		this.comentario = com.getComentario();
		this.idEmprendimiento = com.getIdEmprendimiento();
		this.usuario = com.getUsuario();
		this.puntuacion = com.getPuntuacion();
	}
	
	public Comentarios(Long id, String comentario, Long idEmprendimiento, String usuario, int puntuacion) {
		super();
		this.id = id;
		this.comentario = comentario;
		this.idEmprendimiento = idEmprendimiento;
		this.usuario = usuario;
		this.puntuacion = puntuacion;
	}
	
	public Comentarios() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Long getIdEmprendimiento() {
		return idEmprendimiento;
	}
	public void setIdEmprendimiento(Long idEmprendimiento) {
		this.idEmprendimiento = idEmprendimiento;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	
}
