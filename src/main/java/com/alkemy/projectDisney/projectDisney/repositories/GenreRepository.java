package com.alkemy.projectDisney.projectDisney.repositories;

import com.alkemy.projectDisney.projectDisney.entities.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<GenreEntity, Long> {
}
