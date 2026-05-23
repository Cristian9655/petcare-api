package br.com.clyvo.petcare.service;

import br.com.clyvo.petcare.entity.Pet;
import br.com.clyvo.petcare.entity.Tutor;
import br.com.clyvo.petcare.repository.PetRepository;
import br.com.clyvo.petcare.repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
    @Autowired
    private PetRepository repository;

    @Autowired
    private  TutorService tutorService;

    @Autowired
    private TutorRepository tutorRepository;

    public Pet create(Pet pet) {
        Long tutorId = pet.getTutor().getId();

        Tutor tutor = tutorRepository.findById(tutorId)
                .orElseThrow(() ->
                        new RuntimeException("Tutor não encontrado"));

        pet.setTutor(tutor);

        return repository.save(pet);
    }

    public List<Pet> findAll() {
        return repository.findAll();
    }

    public Pet findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Pet não encontrado"));
    }

    public Pet update(Long id, Pet pet) {
        Pet entity = findById(id);

        entity.setNome(pet.getNome());
        entity.setEspecie(pet.getEspecie());
        entity.setRaca(pet.getRaca());
        entity.setIdade(pet.getIdade());
        entity.setPeso(pet.getPeso());

        if (pet.getTutor() != null) {
            Long tutorId = pet.getTutor().getId();

            Tutor tutor = tutorRepository.findById(tutorId)
                    .orElseThrow(() ->
                            new RuntimeException("Tutor não encontrado"));

            entity.setTutor(tutor);
        }
        return repository.save(entity);
    }

    public void delete(Long id) {
        findById(id);

        repository.deleteById(id);
    }

}
