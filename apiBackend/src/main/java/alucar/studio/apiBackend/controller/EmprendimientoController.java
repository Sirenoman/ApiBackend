package alucar.studio.apiBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alucar.studio.apiBackend.dtos.EmprendimientoDTO;
import alucar.studio.apiBackend.service.EmprendimientoService;

@RestController
@RequestMapping("/emprendimiento")
public class EmprendimientoController {

	@Autowired
	private EmprendimientoService service;
	
	@GetMapping("/all")
	public ResponseEntity<?> mostrarEmprendimientos(Pageable paginacion){
		return new ResponseEntity<>(service.findAll(paginacion), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> mostrarUnEmprendimiento(@PathVariable("id") Long id){
		try {
			return new ResponseEntity<>(service.findByIdEmprendimiento(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Error al obtener emprendimiento", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<?> guardarEmprendimiento(@RequestBody EmprendimientoDTO emprendimiento){
		try {
			service.insertEmprendimiento(emprendimiento);
			return new ResponseEntity<>("Guardado", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Error al guardar emprendimiento", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarEmprendimiento(@PathVariable("id") Long id){
		try {
			service.deleteEmprendimiento(id);
			return new ResponseEntity<>("Eliminado", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Error al eliminar emprendimiento", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
