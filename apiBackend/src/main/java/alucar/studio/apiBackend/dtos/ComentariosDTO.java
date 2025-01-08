package alucar.studio.apiBackend.dtos;

import java.io.Serializable;

import alucar.studio.apiBackend.models.Comentarios;

public class ComentariosDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String comentario;
	private Long idEmprendimiento;
	private String usuario;
	private int puntuacion;
	
	public ComentariosDTO(Comentarios com) {
		this.id = com.getId();
		this.comentario = com.getComentario();
		this.idEmprendimiento = com.getIdEmprendimiento();
		this.usuario = com.getUsuario();
		this.puntuacion = com.getPuntuacion();
	}
	
	public ComentariosDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComentariosDTO(String comentario, Long idEmprendimiento, String usuario, int puntuacion) {
		super();
		this.comentario = comentario;
		this.idEmprendimiento = idEmprendimiento;
		this.usuario = usuario;
		this.puntuacion = puntuacion;
	}

	// GETTERS AND SETTERS
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
