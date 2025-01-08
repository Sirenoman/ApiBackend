package alucar.studio.apiBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alucar.studio.apiBackend.models.Emprendedor;

@Repository
public interface EmprendedorRepository extends JpaRepository<Emprendedor, Long>{

}
