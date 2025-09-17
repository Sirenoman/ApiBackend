package alucar.studio.apiBackend.service;

import java.util.List;

import alucar.studio.apiBackend.dtos.CategoriaDTO;
import alucar.studio.apiBackend.repository.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    protected CategoriasRepository repository;

    public List<CategoriaDTO> findAll() {
        return repository.findAll().stream().map(CategoriaDTO::new).toList();
    }

    public CategoriaDTO findById(Long id) {
        return repository.findById(id).map(CategoriaDTO::new).orElse(null);
    }

}
