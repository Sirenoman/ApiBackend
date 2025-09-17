package alucar.studio.apiBackend.models;

import alucar.studio.apiBackend.dtos.EmprendedorDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "emprendedor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emprendedor{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

}
