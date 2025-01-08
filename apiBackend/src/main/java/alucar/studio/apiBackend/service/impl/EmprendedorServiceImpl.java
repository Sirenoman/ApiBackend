package alucar.studio.apiBackend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alucar.studio.apiBackend.dtos.EmprendedorDTO;
import alucar.studio.apiBackend.models.Emprendedor;
import alucar.studio.apiBackend.repository.EmprendedorRepository;
import alucar.studio.apiBackend.service.EmprendedorService;

@Service
public class EmprendedorServiceImpl implements EmprendedorService{
	
	@Autowired
	protected EmprendedorRepository repository;

	@Override
	public List<EmprendedorDTO> findAll() {
		return repository.findAll().stream()
				.map(EmprendedorDTO::new)
				.toList();
	}

	@Override
	public void insertEmprendedor(EmprendedorDTO emprendedor) {
		repository.save(new Emprendedor(emprendedor));
	}

	@Override
	public EmprendedorDTO findById(Long id) {
		return new EmprendedorDTO(repository.findById(id).orElse(null));
	}

	@Override
	public void eliminarEmprendedor(Long id) {
		repository.deleteById(id);
	}

}
