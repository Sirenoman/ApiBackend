package alucar.studio.apiBackend.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import alucar.studio.apiBackend.dtos.CategoriaDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(schema = "defaultdb", name = "categoria")
public class Categoria implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8162286961636671462L;

	@Id
	@Column(name = "ID_CATEGORIAS")
	private Long id;
	@Column(name = "NOMBRE")
	private String nombre;
	
	@ManyToMany(mappedBy = "categorias")
	@JsonBackReference
    private List<Emprendimiento> emprendimientos = new ArrayList<>();
	
	public Categoria(CategoriaDTO cat) {
		this.id = cat.getId();
		this.nombre = cat.getNombre();
	}
	
	public Categoria(Long id, String nombre, List<Emprendimiento> emprendimientos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.emprendimientos = emprendimientos;
	}

	public Categoria() {
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
