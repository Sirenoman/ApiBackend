package alucar.studio.apiBackend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alucar.studio.apiBackend.dtos.ComentariosDTO;
import alucar.studio.apiBackend.models.Comentarios;
import alucar.studio.apiBackend.repository.ComentarioRepository;
import alucar.studio.apiBackend.service.ComentarioService;

@Service
public class ComentarioServiceImpl implements ComentarioService{

	@Autowired
	protected ComentarioRepository repository;
	
	@Override
	public List<ComentariosDTO> FindByIdEmprendimiento(Long id) {
		return repository.findByidEmprendimiento(id).stream().map(ComentariosDTO::new).toList();
	}

	@Override
	public ComentariosDTO findById(Long id) {
		return new ComentariosDTO(repository.findById(id).orElse(null));
	}

	@Override
	public void InsertComentario(ComentariosDTO comentario) {
		repository.save(new Comentarios(comentario));
	}

	@Override
	public void deleteComentario(Long id) {
		repository.deleteById(id);
	}

}
