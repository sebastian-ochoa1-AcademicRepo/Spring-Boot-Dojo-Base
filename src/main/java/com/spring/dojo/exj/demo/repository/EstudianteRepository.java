package com.spring.dojo.exj.demo.repository;

import com.spring.dojo.exj.demo.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

}
