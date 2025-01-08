package alucar.studio.apiBackend.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import alucar.studio.apiBackend.dtos.EmprendimientoDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(schema = "defaultdb", name = "emprendimiento")
public class Emprendimiento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2476822419913226366L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EMPR")
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
	
	public Emprendimiento(Long id, String nombre, String descripcion, Boolean creditoFiscal, Long idEmprendedor,
			List<Categoria> categorias, List<CanalPago> canalPagos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.creditoFiscal = creditoFiscal;
		this.idEmprendedor = idEmprendedor;
		this.categorias = categorias;
		this.canalPagos = canalPagos;
	}

	public Emprendimiento() {
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Boolean getCreditoFiscal() {
		return creditoFiscal;
	}
	public void setCreditoFiscal(Boolean creditoFiscal) {
		this.creditoFiscal = creditoFiscal;
	}
	public Long getIdEmprendedor() {
		return idEmprendedor;
	}
	public void setIdEmprendedor(Long idEmprendedor) {
		this.idEmprendedor = idEmprendedor;
	}
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	public List<CanalPago> getCanalPagos() {
		return canalPagos;
	}
	public void setCanalPagos(List<CanalPago> canalPagos) {
		this.canalPagos = canalPagos;
	}
	
	
}
