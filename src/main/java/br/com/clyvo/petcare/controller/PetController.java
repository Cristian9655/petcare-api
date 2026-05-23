package br.com.clyvo.petcare.controller;

import br.com.clyvo.petcare.entity.Pet;
import br.com.clyvo.petcare.service.PetService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService service;

    @PostMapping
    public Pet create(@Valid @RequestBody Pet pet) {
        return service.create(pet);
    }

    @GetMapping
    public List<Pet> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Pet findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Pet update(@PathVariable Long id,
                      @Valid @RequestBody Pet pet) {

        return service.update(id, pet);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
