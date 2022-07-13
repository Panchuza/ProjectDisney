package com.alkemy.projectDisney.projectDisney.repositories;

import com.alkemy.projectDisney.projectDisney.entities.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterEntity, Long> {
}
