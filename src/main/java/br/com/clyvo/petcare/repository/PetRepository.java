package br.com.clyvo.petcare.repository;

import br.com.clyvo.petcare.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet,Long> {
}
