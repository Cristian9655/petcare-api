package br.com.clyvo.petcare.service;

import br.com.clyvo.petcare.entity.Tutor;
import br.com.clyvo.petcare.repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorService {
    @Autowired
    private TutorRepository repository;

    public Tutor create(Tutor tutor) {
        return repository.save(tutor);
    }

    public List<Tutor> findAll() {
        return repository.findAll();
    }

    public Tutor findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Tutor não encontrado"));
    }

    public Tutor update(Long id, Tutor tutor) {
        Tutor entity = findById(id);

        entity.setNome(tutor.getNome());
        entity.setEmail(tutor.getEmail());
        entity.setTelefone(tutor.getTelefone());

        return repository.save(entity);
    }

    public void delete(Long id) {
        findById(id);

        repository.deleteById(id);
    }
}
