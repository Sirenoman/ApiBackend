package alucar.studio.apiBackend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "redes_sociales")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RedesSociales{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "NOMBRE_RED")
	private String nombre;
	@Column(name = "URL_RED")
	private String url;
	@Column(name = "ID_EMPRENDIMIENTO")
	private Long idEmprendimiento;
	
}
