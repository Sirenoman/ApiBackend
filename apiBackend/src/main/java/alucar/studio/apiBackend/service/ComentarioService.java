package alucar.studio.apiBackend.service;

import java.util.List;

import alucar.studio.apiBackend.dtos.ComentariosDTO;

public interface ComentarioService {
	
	public List<ComentariosDTO> FindByIdEmprendimiento(Long id);
	
	public ComentariosDTO findById(Long id);
	
	public void InsertComentario(ComentariosDTO comentario);
	
	public void deleteComentario(Long id);

}
