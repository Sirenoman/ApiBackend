package alucar.studio.apiBackend.models;

import alucar.studio.apiBackend.dtos.EmprendimientoDTO;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "emprendimiento")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emprendimiento {;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "NOMBRE_EMPR")
	private String nombre;
	@Column(name = "DESCRIPCION_EMPR")
	private String descripcion;
	@Column(name = "CF_EMPR")
	private Boolean creditoFiscal;
	@Column(name = "ID_EMPRENDEDOR")
	private Long idEmprendedor;
	
    @ManyToMany
    @JoinTable(
        name = "emprendimiento_categoria",
        joinColumns = @JoinColumn(name = "EMPR"),
        inverseJoinColumns = @JoinColumn(name = "CATEGORIA")
    )
    @JsonManagedReference
    private List<Categoria> categorias = new ArrayList<>();
    
    @ManyToMany
    @JoinTable(
        name = "emprendimiento_canalpago",
        joinColumns = @JoinColumn(name = "EMPR"),
        inverseJoinColumns = @JoinColumn(name = "CANALPAGO")
    )
    @JsonManagedReference
    private List<CanalPago> canalPagos = new ArrayList<>();
	
    // CONSTRUCTOR CON EL DTO
	public Emprendimiento(EmprendimientoDTO empr) {
		this.id = empr.getId();
		this.nombre = empr.getNombre();
		this.descripcion = empr.getDescripcion();
		this.creditoFiscal = empr.getCreditoFiscal();
		this.idEmprendedor = empr.getIdEmprendedor();
		this.categorias = empr.getCategorias().stream().map(Categoria::new).toList();
		this.canalPagos = empr.getCanalPagos().stream().map(CanalPago::new).toList();
	}
	
}
