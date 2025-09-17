package alucar.studio.apiBackend.models;

import alucar.studio.apiBackend.dtos.ComentariosDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "comentarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comentarios{
	
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

}
