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

import alucar.studio.apiBackend.dtos.EmprendedorDTO;
import alucar.studio.apiBackend.service.EmprendedorService;

@RestController
@RequestMapping("/emprendedor")
public class EmprendedorController {
	
	@Autowired
	private EmprendedorService service;

	@GetMapping("/all")
	public ResponseEntity<?> mostrarEmprendedores(){
		return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> mostrarUnEmprendedor(@PathVariable("id") Long id){
		try {
			return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Error al obtener Emprendedor", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<?> guardarEmprendedor(@RequestBody EmprendedorDTO emprendedor){
		try {
			service.insertEmprendedor(emprendedor);
			return new ResponseEntity<>("Guardado", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Erro al insertar", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> borrarEmprendedor(@PathVariable("id") Long id){
		try {
			service.eliminarEmprendedor(id);
			return new ResponseEntity<>("Eliminado", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Error al eliminar", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
