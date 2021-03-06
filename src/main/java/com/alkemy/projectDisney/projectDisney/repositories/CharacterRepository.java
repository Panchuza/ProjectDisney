package com.alkemy.projectDisney.projectDisney.repositories;

import com.alkemy.projectDisney.projectDisney.entities.CharacterEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterEntity, Long> {
    //PRUEBA CRITERIA
    List<CharacterEntity> findAll(Specification<CharacterEntity> entitySpecification);
}
