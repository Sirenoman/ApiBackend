package alucar.studio.apiBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alucar.studio.apiBackend.dtos.ComentariosDTO;
import alucar.studio.apiBackend.service.ComentarioService;

@RestController
@RequestMapping("/comentarios")
public class ComentariosController {

	@Autowired
	private ComentarioService service;
	
	@GetMapping("/all/{id}")
	public ResponseEntity<?> mostrarComentarios(@PathVariable("id") Long id){
		try {
			return new ResponseEntity<>(service.FindByIdEmprendimiento(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Error al obtener comentarios", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> mostrarUnComentario(@PathVariable("id") Long id){
		try {
			return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Error al obtener comentario", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<?> guardarComentario(@RequestBody ComentariosDTO comentario){
		try {
			service.InsertComentario(comentario);
			return new ResponseEntity<>("Guardado", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Error al obtener comentario", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarComentario(@PathVariable("id") Long id){
		try {
			service.deleteComentario(id);
			return new ResponseEntity<>("Eliminado", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Error al eliminar comentario", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
