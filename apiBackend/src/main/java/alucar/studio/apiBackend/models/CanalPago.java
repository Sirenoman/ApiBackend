package alucar.studio.apiBackend.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import alucar.studio.apiBackend.dtos.CanalPagoDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(schema = "defaultdb", name = "canal_pago")
public class CanalPago implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7301820441025462811L;
	
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

	public CanalPago(Long id, String nombre, List<Emprendimiento> emprendimientos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.emprendimientos = emprendimientos;
	}

	public CanalPago() {
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

	public List<Emprendimiento> getEmprendimientos() {
		return emprendimientos;
	}

	public void setEmprendimientos(List<Emprendimiento> emprendimientos) {
		this.emprendimientos = emprendimientos;
	}
	
	
}
