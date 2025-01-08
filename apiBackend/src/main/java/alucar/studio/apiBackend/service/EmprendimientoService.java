package alucar.studio.apiBackend.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import alucar.studio.apiBackend.dtos.EmprendimientoDTO;

public interface EmprendimientoService {

	
	public Page<EmprendimientoDTO> findAll(Pageable paginacion);
	
	public void insertEmprendimiento(EmprendimientoDTO emprendimiento);

	public EmprendimientoDTO findByIdEmprendimiento(Long id);
	
	public void deleteEmprendimiento(Long id);

}
