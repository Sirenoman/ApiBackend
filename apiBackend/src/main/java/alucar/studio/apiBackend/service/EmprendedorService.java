package alucar.studio.apiBackend.service;

import java.util.List;

import alucar.studio.apiBackend.dtos.EmprendedorDTO;
import alucar.studio.apiBackend.models.Emprendedor;
import alucar.studio.apiBackend.repository.EmprendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmprendedorService {

	@Autowired
	protected EmprendedorRepository repository;

	public List<EmprendedorDTO> findAll() {
		return repository.findAll().stream()
				.map(EmprendedorDTO::new)
				.toList();
	}

	public void insertEmprendedor(EmprendedorDTO emprendedor) {
		repository.save(new Emprendedor(emprendedor));
	}

	public EmprendedorDTO findById(Long id) {
		return repository.findById(id).map(EmprendedorDTO::new).orElse(null);
	}

	public void eliminarEmprendedor(Long id) {
		repository.deleteById(id);
	}
}
