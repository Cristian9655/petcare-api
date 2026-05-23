package br.com.clyvo.petcare.controller;

import br.com.clyvo.petcare.entity.Tutor;
import br.com.clyvo.petcare.repository.TutorRepository;
import br.com.clyvo.petcare.service.TutorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tutores")
public class TutorController {

    @Autowired
    private TutorService service;

    @PostMapping
    public Tutor create(@Valid @RequestBody Tutor tutor) {
        return service.create(tutor);
    }

    @GetMapping
    public List<Tutor> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Tutor findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Tutor update(@PathVariable Long id,
                        @Valid @RequestBody Tutor tutor) {

        return service.update(id, tutor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
