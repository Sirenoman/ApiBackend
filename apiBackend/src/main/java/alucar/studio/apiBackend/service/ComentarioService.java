package alucar.studio.apiBackend.service;

import java.util.List;

import alucar.studio.apiBackend.dtos.ComentariosDTO;
import alucar.studio.apiBackend.models.Comentarios;
import alucar.studio.apiBackend.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComentarioService {

	@Autowired
	protected ComentarioRepository comentarioRepositoryrepository;

	public List<ComentariosDTO> FindByIdEmprendimiento(Long id) {
		return comentarioRepositoryrepository.findByidEmprendimiento(id).stream().map(ComentariosDTO::new).toList();
	}

	public ComentariosDTO findById(Long id) {
		return comentarioRepositoryrepository.findById(id).map(ComentariosDTO::new).orElse(null);
	}

	public void InsertComentario(ComentariosDTO comentario) {
		comentarioRepositoryrepository.save(new Comentarios(comentario));
	}

	public void deleteComentario(Long id) {
		comentarioRepositoryrepository.deleteById(id);
	}

}
