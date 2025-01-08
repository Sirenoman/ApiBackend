package alucar.studio.apiBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alucar.studio.apiBackend.models.Categoria;

@Repository
public interface CategoriasRepository extends JpaRepository<Categoria, Long> {

}
