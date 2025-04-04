package application.service;

import application.model.Genero;
import application.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {
    @Autowired
    private GeneroRepository repository;

    public List<Genero> listarTodos() {
        return repository.findAll();
    }

    public Genero salvar(Genero genero) {
        return repository.save(genero);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

