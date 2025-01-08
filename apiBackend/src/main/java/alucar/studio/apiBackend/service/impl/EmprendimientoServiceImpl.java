package alucar.studio.apiBackend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import alucar.studio.apiBackend.dtos.EmprendimientoDTO;
import alucar.studio.apiBackend.models.Emprendimiento;
import alucar.studio.apiBackend.repository.EmprendimientoRepository;
import alucar.studio.apiBackend.service.EmprendimientoService;

@Service
public class EmprendimientoServiceImpl implements EmprendimientoService{

	@Autowired
	protected EmprendimientoRepository repository;
	
	@Override
	public Page<EmprendimientoDTO> findAll(Pageable paginacion) {
		return convertirListaAPagina(repository.findAll(paginacion).stream()
				.map(EmprendimientoDTO::new)
				.toList(), paginacion);
	}

	@Override
	public void insertEmprendimiento(EmprendimientoDTO emprendimiento) {
		repository.save(new Emprendimiento(emprendimiento));
	}

	@Override
	public EmprendimientoDTO findByIdEmprendimiento(Long id) {
		return new EmprendimientoDTO(repository.findById(id).orElse(null));
	}

	@Override
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
