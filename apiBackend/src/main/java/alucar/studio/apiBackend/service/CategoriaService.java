package alucar.studio.apiBackend.service;

import java.util.List;

import alucar.studio.apiBackend.dtos.CategoriaDTO;

public interface CategoriaService {

	public List<CategoriaDTO> findAll();
	
	public CategoriaDTO findById(Long id);
	
}
