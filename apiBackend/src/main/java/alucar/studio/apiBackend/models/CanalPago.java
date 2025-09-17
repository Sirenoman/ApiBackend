package alucar.studio.apiBackend.models;

import alucar.studio.apiBackend.dtos.CanalPagoDTO;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "canal_pago")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CanalPago {
	
	@Id
	@Column(name = "ID_CANAL_PAGO")
	private Long id;
	@Column(name = "NOMBRE_CANAL_PAGO")
	private String nombre;
	
	@ManyToMany(mappedBy = "canalPagos")
	@JsonBackReference
    private List<Emprendimiento> emprendimientos = new ArrayList<>();
	
	public CanalPago(CanalPagoDTO canal) {
		this.id = canal.getId();
		this.nombre = canal.getNombre();
	}
	
}
