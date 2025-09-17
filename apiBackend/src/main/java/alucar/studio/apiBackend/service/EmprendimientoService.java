package alucar.studio.apiBackend.service;

import alucar.studio.apiBackend.models.Emprendimiento;
import alucar.studio.apiBackend.repository.EmprendimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import alucar.studio.apiBackend.dtos.EmprendimientoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprendimientoService {

	@Autowired
	protected EmprendimientoRepository repository;

	public Page<EmprendimientoDTO> findAll(Pageable paginacion) {
		return convertirListaAPagina(repository.findAll(paginacion).stream()
				.map(EmprendimientoDTO::new)
				.toList(), paginacion);
	}

	public void insertEmprendimiento(EmprendimientoDTO emprendimiento) {
		repository.save(new Emprendimiento(emprendimiento));
	}

	public EmprendimientoDTO findByIdEmprendimiento(Long id) {
		return repository.findById(id).map(EmprendimientoDTO::new).orElse(null);
	}

	public void deleteEmprendimiento(Long id) {
		repository.deleteById(id);
	}

	private Page<EmprendimientoDTO> convertirListaAPagina(List<EmprendimientoDTO> lista, Pageable pageable) {
		// Calcular el índice de inicio y fin basado en la paginación
		int start = (int) pageable.getOffset();
		int end = Math.min((start + pageable.getPageSize()), lista.size());

		// Crear una sublista para la página actual
		List<EmprendimientoDTO> subLista = lista.subList(start, end);

		// Crear y devolver el objeto Page
		return new PageImpl<>(subLista, pageable, lista.size());
	}


}
