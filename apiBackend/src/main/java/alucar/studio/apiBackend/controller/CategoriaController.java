package alucar.studio.apiBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import alucar.studio.apiBackend.dtos.CategoriaDTO;
import alucar.studio.apiBackend.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaService service;
	
	@GetMapping("/all")
	public ResponseEntity<?> mostrarCategorias() {
		try {
			return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Error al obtener Categorias", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/")
	public ResponseEntity<?> mostrarUnaCategoria(@RequestParam(required = false) Long id) {
		try {
			CategoriaDTO categoria = service.findById(id);
			if(categoria != null) {
				return new ResponseEntity<>(categoria, HttpStatus.OK);
			}
			return new ResponseEntity<>("No existe tal categoria", HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<>("Error al obtener categoria", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
