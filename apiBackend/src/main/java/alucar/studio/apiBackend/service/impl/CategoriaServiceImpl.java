package alucar.studio.apiBackend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alucar.studio.apiBackend.dtos.CategoriaDTO;
import alucar.studio.apiBackend.repository.CategoriasRepository;
import alucar.studio.apiBackend.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	protected CategoriasRepository repository;
	
	@Override
	public List<CategoriaDTO> findAll() {
		return repository.findAll().stream().map(CategoriaDTO::new).toList();
	}

	@Override
	public CategoriaDTO findById(Long id) {
		return new CategoriaDTO(repository.findById(id).orElse(null));
	}

}
