package alucar.studio.apiBackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alucar.studio.apiBackend.models.Comentarios;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentarios, Long>{

	List<Comentarios> findByidEmprendimiento(Long id);

}
