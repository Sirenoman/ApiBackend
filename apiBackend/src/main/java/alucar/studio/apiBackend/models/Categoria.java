package alucar.studio.apiBackend.models;

import alucar.studio.apiBackend.dtos.CategoriaDTO;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categorias")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categoria{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
}
