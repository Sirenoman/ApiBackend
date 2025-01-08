package alucar.studio.apiBackend.service;

import java.util.List;

import alucar.studio.apiBackend.dtos.EmprendedorDTO;

public interface EmprendedorService {
	
	public List<EmprendedorDTO> findAll();
	
	public void insertEmprendedor(EmprendedorDTO emprendedor);
	
	public EmprendedorDTO findById(Long id);
	
	public void eliminarEmprendedor(Long id);

}
