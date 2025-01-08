package alucar.studio.apiBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alucar.studio.apiBackend.models.RedesSociales;

@Repository
public interface RedesSocialesRepository extends JpaRepository<RedesSociales, Long>{

}
